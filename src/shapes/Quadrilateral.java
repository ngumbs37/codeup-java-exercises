package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected int length;
    protected int width;

    public Quadrilateral(int l, int w){
        setLength(l);
        setWidth(w);
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    abstract void setLength(int length);
    abstract void setWidth(int width);

    public double getPerimeter(){
        return length + length + width + width;
    }

    public double getArea(){
        return length * width;
    }
}// end class
