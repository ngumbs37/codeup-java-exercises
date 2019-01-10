import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args){
        Arithmetic math = new Arithmetic();
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println(math.addition(2,4));
        System.out.println(math.subtraction(2, 7));
        System.out.println(math.multiply(-3, -9));
        System.out.println(math.division(34, 0));
        System.out.println(math.modulus(70, 3));

        int userInput = getInteger(1, 10);

        System.out.println("You entered "+userInput);

        System.out.println("Lets calculate factorials!");
        userInput = getInteger(1, 10);
        System.out.println("Do you wish to continue?");
        String choice = scan.next();
        boolean decide = choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y");
        if(decide) {
            System.out.printf("The factorial of %d is %d", userInput, factorial(userInput));
        }
        System.out.println("\nType to 'roll' to roll dice.");
        String rolling = scan.next();
        decide = rolling.equalsIgnoreCase("roll");
        if (decide){
            do{
                System.out.printf("\nThe first die rolls for %d.\nThe second die rolls for %d.\n", rollDice(),rollDice());
                System.out.println("Roll dice again?");
                decide = false;
                choice = scan.next();
                decide = choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y") || rolling.equalsIgnoreCase("roll");
            } while(decide);
        }
    }// end main
    public static int getInteger(int min, int max){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.format("Enter a number between %d and %d: ", min, max);
        int number = scan.nextInt();
        if( number >= min && number <= max){
            return number;
        }else{
            return getInteger(min,max);
        }
    }// end getInteger
    public static long factorial(int number){
        if (number == 0) {
            return 1;
        }
        return number * factorial(number-1);
    } // end factorial
    public static int rollDice(){
        return (int) (Math.random()*6 )+1;
    }// end rollDice
}// end MethodsExercises class


class Arithmetic{
    int addition(double a, double b){
        return (int) (a + b);
    }
    int subtraction(double a, double b){
        return (int) (a - b);
    }
    int multiply(double a, double b ){
        return (int) (a * b);
    }
    int division(int a, int b) {
        if(a == 0 || b == 0){
            return 0;
        }
        return a / b;
    }
    int modulus(int a, int b){
        return a % b;
    }

}// end Arithmetic class