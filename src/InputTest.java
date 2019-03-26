import util.Input;

public class InputTest{
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println(input.getDouble(1, 10, "Please enter a number with decimals between 1 and 10"));

    }
}