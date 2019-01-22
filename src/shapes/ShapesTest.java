package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4,5);

        System.out.println("Perimeter: "+box1.getPerimeter());
        System.out.println("Area: "+ box1.getArea());

        Quadrilateral box2 = new Square(5);

        System.out.println("Perimeter: "+box2.getPerimeter());
        System.out.println("Area: "+ box2.getArea());

        Measurable myShape[] = {new Square(20), new Rectangle(6,2)};

        System.out.println("Perimeter: "+myShape[0].getPerimeter());
        System.out.println("Area: "+ myShape[0].getArea());


        System.out.println("Perimeter: "+myShape[1].getPerimeter());
        System.out.println("Area: "+ myShape[1].getArea());

    }
}// end class
