package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int l, int w){
        length = l;
        width = w;
    }

    public int getPerimeter(){
        return length + length + width + width;
    }

    public int getArea(){
        return length * width;
    }
}
