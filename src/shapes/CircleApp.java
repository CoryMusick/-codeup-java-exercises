package shapes;
import util.Input;
public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        boolean createCircle = true;

        while (createCircle) {
            Circle newCircle = new Circle( input.getDouble(1, 20, "Enter a radius between 1 and 20"));
            System.out.println("Area is:");
            System.out.println(newCircle.getArea());
            System.out.println("Circumference is:");
            System.out.println(newCircle.getCircumference());

            createCircle = input.yesNo("Would you like to create another circle?");
        }
        System.out.println("You made this many circles:");
        System.out.println(Circle.getCount());
    }
}
