import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while(i <= 15){
//            System.out.println(i);
//            i++;
//        }
//
//        for (int i = 5; i <= 15; i++){
//            System.out.print(i + " ");
//        }
//        System.out.println(" ");
//
//        int j = 105;
//        do{
//            j -= 5;
//            System.out.println(j);
//        }while(j > -10);
//


        /// Use LONG because the check over 1mil is too big for INT
//        for(long k = 2; k < 1000000; k *= k){
//            System.out.println(k);
//        }
//
//        for(int j = 1; j <= 100; j++){
//            if(j % 15 == 0){
//                System.out.println("FizzBuzz");
//            }else if(j % 5 == 0){
//                System.out.println("Buzz");
//            }else if(j % 3 == 0){
//                System.out.println("Fizz");
//            }else System.out.println(j);
//        }

        Scanner scanner = new Scanner(System.in);
        String answer = "";
//        do {
//            System.out.println("Please enter a positive integer:");
//            int input = scanner.nextInt();
//            String line = "|";
//            System.out.printf("%s %1s %s %1s %s%n", "number", line, "squared", line, "cubed");
//            System.out.printf("------ | ------- | -----%n");
//
//            for (int i = 1; i <= input; i++) {
//                int num = i;
//                int square = i * i;
//                int cube = i * i * i;
//                int length = (int) (Math.log10(square) + 1);
//                if (length == 2) {
//                    System.out.printf("%d%7s %d%7s %d%n", num, line, square, line, cube);
//                } else {
//                    System.out.printf("%d%7s %d%8s %d%n", num, line, square, line, cube);
//                }
//            }
//            System.out.println("Would you like to continue? y/n");
//            answer = scanner.next();
//        } while (answer.equals("y"));


        do {
            System.out.println("Enter a grade from 0-100");
            int grade = scanner.nextInt();
            if( 88 <= grade && grade <= 100){
                System.out.println("A");
            }else if(80 <= grade && grade <= 87){
                System.out.println("B");
            }else if(67 <= grade && grade <= 79){
                System.out.println("C");

            }else if(60 <= grade && grade <= 66){
                System.out.println("D");

            }else if(0 <= grade && grade <= 59){
                System.out.println("F");
            }else {
                System.out.println("That is not a valid number");
            }
            System.out.println("Would you like to continue? y/n");
            answer = scanner.next();
        }while(answer.equals("y"));

    }
}
