package shapes;

public class Square extends Quadrilateral {
    public Square(int side) {
        super(side,side);
    }

    public double getPerimeter(){
        return 4 * length;
    }

    public double getArea(){
        return length^2;
    }

    void setLength(int side) {
        this.length = side;
    }

    void setWidth(int side) {
        this.width = side;
    }
}// end class
