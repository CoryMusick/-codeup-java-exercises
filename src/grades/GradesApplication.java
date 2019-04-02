package grades;
import java.util.*;
import util.Input;



public class GradesApplication {
    public static void getUsernames(Map<String,Student> students){
        students.forEach((String, Student) ->{
            System.out.printf("|%s| ",String);
        });
    }
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();

        Student Tim = new Student("Tim");
        Student Mike = new Student("Mike");
        Student Carlo = new Student("Carlo");
        Student Cory = new Student("Cory");

        Cory.addGrade(97);
        Cory.addGrade(95);
        Cory.addGrade(89);
        Cory.addGrade(99);
        Tim.addGrade(99);
        Tim.addGrade(99);
        Tim.addGrade(99);
        Tim.addGrade(99);
        Mike.addGrade(99);
        Mike.addGrade(99);
        Mike.addGrade(99);
        Mike.addGrade(99);
        Carlo.addGrade(99);
        Carlo.addGrade(99);
        Carlo.addGrade(99);
        Carlo.addGrade(99);

        students.put("coryMusick", Cory);
        students.put("zenMaster", Carlo);
        students.put("javaWizard", Mike);
        students.put("poolGuy", Tim );

        Input input = new Input();
        boolean run = true;

        System.out.println("Welcome!");
        System.out.println();
        System.out.println("Here are the git hub usernames of our students:");
        System.out.println();
        getUsernames(students);
        System.out.println("\n");

        while(run){
        System.out.println("What student would you like to see more information on?");
        String selection = input.getString();
            if (students.containsKey(selection)) {
                Student student = students.get(selection);
                System.out.println("Name = " + student.getName() + " - GitHub Username: " + selection);
                System.out.println("All Grades: ");
                student.getAllGrades();
                System.out.println("Current Average: " + student.getGradeAverage() + "\n");
            }else{
                System.out.println("Sorry, no student found with the github username of \""+selection+"\"");
            }
            run = input.yesNo("Would you like to see another student?");
            if(!run){
                System.out.println("Thank you and have a nice day!");
            }
        }
    }
}
