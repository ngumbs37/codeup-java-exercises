package shapes;

public class Rectangle extends Quadrilateral {
    public Rectangle(int l, int w){
        super(l,w);
    }
    void setLength(int length) {
        this.length = length;
    }

    void setWidth(int width) {
        this.width = width;
    }
}// end class