import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args){
        Arithmetic math = new Arithmetic();
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println(math.addition(5, 15));
        System.out.println(math.subtraction(2, 7));
        System.out.println(math.multiply(-3, -9));
        System.out.println(math.division(34.4, 0));
        System.out.println(math.modulus(3, 3));

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
            System.out.printf("\nThe first die rolls for %d.\nThe second die rolls for %d", rollDice(),rollDice());
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
    double division(double a, double b){
        return a / b;
    }
    int modulus(int a, int b){
        return a % b;
    }


}// end Arithmetic class


//        Test the application and find the integer for the highest factorial that can be accurately calculated by this application,
//        then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns accurate factorial calculation}".
//        Don’t forget to change your verification too!
//        Use Recursion to implement the factorial.
//        Create an application that simulates dice rolling.
//
//        Ask the user to enter the number of sides for a pair of dice.
//        Prompt the user to roll the dice.
//        "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//        Use static methods to implement the method(s) that generate the random numbers.
//        Use the .random method of the java.lang.Math class to generate random numbers.
//        Game Development 101
//
//        Welcome to the world of game development!
//
//        You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//
//        The specs for the game are:
//
//        Game picks a random number between 1 and 100.
//        Prompts user to guess the number
//        All user inputs are validated
//        If user's guess is less than the number, it outputs "HIGHER"
//        If user's guess is more than the number, it outputs "LOWER"
//        If a user guesses the number, the game should declare "GOOD GUESS!"
//        Hints
//
//        Use the random method of the java.lang.Math class to generate a random number.
//        Bonus
//
//        Keep track of how many guesses a user makes
//        Set an upper limit on the number of guesses


