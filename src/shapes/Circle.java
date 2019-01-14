package shapes;

public class Circle {
    private double radius;
    private static int numberOfCirclesCreated = 0;

    public Circle(double radius){
        this.radius = radius;
    }
    final public double getArea(){
        return Math.PI * (this.radius*this.radius);
    }
    final public double getCircumference(){
        return 2 * Math.PI * this.radius;
    }
    public double showRadius(){
        return this.radius;
    }
    public int showCirclesCreated(){
        return numberOfCirclesCreated;
    }
    public void incrementCirclesCreated(){
        numberOfCirclesCreated++;
    }
}
