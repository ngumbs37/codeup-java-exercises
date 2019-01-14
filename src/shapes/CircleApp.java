package shapes;

import util.Input;
import java.util.concurrent.TimeUnit;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        Circle circle;

        do{
            circle = new Circle(input.getDouble("Enter a number: "));
            System.out.println("A circle with a radius of " + circle.showRadius() + " units hmmm...");
            try {TimeUnit.SECONDS.sleep(4);}catch(Exception e){}
            System.out.format("Circumference: %.3f units\n", circle.getCircumference());
            System.out.format("Area: %.3f units squared\n\n", circle.getArea());
            circle.incrementCirclesCreated();

        }while(input.yesNo("Make another circle? "));

        System.out.println("You created " + circle.showCirclesCreated() + " circles");
    }
}
