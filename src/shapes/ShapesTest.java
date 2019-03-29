package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape = new Rectangle(5, 8);

        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
    }
}
