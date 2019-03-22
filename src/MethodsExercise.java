import java.util.Scanner;

public class MethodsExercise {


    public static int Addition(int num1, int num2) {
        return num1 + num2;
    }
    public static int Subtration(int num1, int num2) {
        return num1 - num2;
    }

    public static void Multiplication(int num1, int num2) {
        int result = 0;
        for(int i = 0; i< num2; i++){
            result += num1;
        }
        System.out.println(result);
    }

    public static int Division(int num1, int num2) {
        return num1 / num2;
    }

    public static int Modulus(int num1, int num2){
        return num1 % num2;
    }


    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 10 && num > 1){
            return num;
        }else return getInteger(min, max);
    }

    public static void factorial(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num >=1 && num <= 10){
            int fact = 1;
            String table = "";
            for(int i = 1; i<= num; i++){
              fact *= i;
              table += " " + i + " x";
            }
            String ftable = table.substring(0,(table.length()-1));
            System.out.printf("%d! = %s = %d",num,ftable,fact);
        }
    }



    public static void main(String[] args) {
//        System.out.println(Addition(5,10));
//
//        System.out.println(Subtration(10,5));
//
//        System.out.println(Division(10,5));
//
//        System.out.println(Modulus(9,6));
//
//        System.out.println(getInteger(1,10));

        factorial();
    }
}
