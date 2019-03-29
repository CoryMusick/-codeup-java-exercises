package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    Rectangle(int length, int width) {
        super(length, width);
    }

    public int getLength() {
        return super.getLength();
    }

    void setLength(int length) {

    }


    public int getWidth() {
        return super.getWidth();
    }

    void setWidth(int width) {

    }

    public double getPerimeter() {
        return (width * 2) + (length * 2);
    }

    public double getArea() {
        return length * width;
    }
}

