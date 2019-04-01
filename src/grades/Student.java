package grades;
import java.util.*;

public class Student {
    private String name;
    private List<Integer> grades;

    Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return this.name;
    };
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    };
    // returns the average of the students grades
    public double getGradeAverage(){
        int total = 0;
        for(int i = 0; i<grades.size(); i++){
            total += grades.get(i);
        }
        return (double)total/grades.size();
    }

    public void getAllGrades(){
        for(int i = 0; i <this.grades.size(); i ++){
            System.out.println(this.grades.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        Student Cory = new Student("Cory");

        Cory.addGrade(97);
        Cory.addGrade(95);
        Cory.addGrade(89);

        System.out.println(Cory.grades);
        System.out.println(Cory.getGradeAverage());

    }
}
