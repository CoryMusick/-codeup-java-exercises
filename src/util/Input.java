package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

   public Input(){
    scanner = new Scanner(System.in);
    }

    public String getString(){
        return scanner.nextLine();
    }

    public boolean yesNo(){
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")){
            return true;
        }else return false;
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
       return yesNo();
    }


    public int getInt(int min, int max){
       int num = getInt();
       while(num < min || num > max ){
           System.out.println("Please Enter a Valid Number");
           num = scanner.nextInt();
       }
       return num;
    }
    public int getInt(){
       return scanner.nextInt();
    }

    public int getInt(int min, int max, String prompt){
        System.out.println(prompt);
        return getInt(min, max);
    }

    public double getDouble(){
       return scanner.nextDouble();
    }

    public double getDouble(int min, int max){
        double num = getDouble();
        while(num < min || num > max ){
            System.out.println("Please Enter a Valid Number");
            num = scanner.nextDouble();
        }
        return num;
    }

    public double getDouble(int min, int max, String prompt){
        System.out.println(prompt);
        return getDouble(min, max);
    }

}


