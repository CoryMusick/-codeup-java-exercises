import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = " ";
        boolean bobIsTalking = true;
        do{
            System.out.print("You: ");
            String input = scanner.nextLine();
            if((input.isEmpty()) || input == null){
                System.out.println("Bob: Fine. Be that way!");
            }else if(input.endsWith("!")){
                System.out.println("Bob: Whoa, chill out!");
            }else if(input.endsWith("?")){
                System.out.println("Bob: Sure..");
            }else if (input.equals("bye")){
                bobIsTalking = false;
                System.out.println("Bob: Later");
            }else System.out.println("Bob: Whatever");
        }while(bobIsTalking);
        System.out.println("Bob: * Rips JUUL and heelies away *");

//
//        String input = scanner.nextLine();
//        String reverseInput = "";
//        for(int i = (input.length()-1); i >=0; --i){
//            reverseInput = reverseInput + input.charAt(i);
//        }
//        System.out.println(reverseInput);
//
//        if(input.equals(reverseInput)){
//            System.out.println("palindrome");
//        }else System.out.println("not a palindrome");
    }
}
