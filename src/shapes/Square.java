package shapes;

public class Square extends Quadrilateral {
    public Square(int side) {
        super(side, side);
    }

    void setLength(int length) {
        this.length= length;
        this.width = length;
    }

    void setWidth(int width) {
        this.length = width;
        this.width = width;
    }


    public double getPerimeter() {
        return 4 * width;
    }


    public double getArea() {
        return width * width;
    }
}
