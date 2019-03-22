import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String answer = " ";
//        do{
//            System.out.print("You: ");
//            String input = scanner.nextLine();
//            if((input.isEmpty()) || input == null){
//                System.out.println("Bob: Fine. Be that way!");
//            }else if((input.substring((input.length() - 1)).equals("!"))){
//                System.out.println("Bob: Whoa, chill out!");
//            }else if((input.substring((input.length() - 1)).equals("?"))){
//                System.out.println("Bob: Sure..");
//            }else System.out.println("Bob: Whatever");
//
//            System.out.println();
//            System.out.println("Would you like to keep trying to talk to Bob? y/n");
//            answer = scanner.next();
//            scanner.nextLine();
//        }while(answer.equals("y"));


        String input = scanner.nextLine();
        String reverseInput = "";
        for(int i = (input.length()-1); i >=0; --i){
            reverseInput = reverseInput + input.charAt(i);
        }
        System.out.println(reverseInput);

        if(input.equals(reverseInput)){
            System.out.println("palindrome");
        }else System.out.println("not a palindrome");
    }
}
