import java.util.Scanner;

public class ConsoleExercises {
   public static void main(String[] args){
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %s \n", pi);

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
//        System.out.println("Please Enter a Number");
//        int userInt = scanner.nextInt();
//
//       System.out.println("Please enter 3 words");
//       String input1 = scanner.next();
//       String input2 = scanner.next();
//       String input3 = scanner.next();
//
//       System.out.format("%s \n%s \n%s \n", input1, input2, input3);
//
//       System.out.println("Type a sentence");
//       String sentence = scanner.nextLine();
//       System.out.println(sentence);
       System.out.println("Enter the length then width of a classroom");
       String length = scanner.nextLine();
       String width = scanner.nextLine();
       double w = Double.parseDouble(width);
       double l = Double.parseDouble(length);
       double area = w * l;
       double perimeter = (2 * w) + (2 * l);
       System.out.format("The Area of the classroom is %f\n",area);
       System.out.format("The Perimeter of the class room is %f\n",perimeter);

   }
}
