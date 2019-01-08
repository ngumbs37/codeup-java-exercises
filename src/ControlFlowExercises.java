import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Integers from 5 to 15");
        int i = 5;
        for(; i<=15; i++){
            System.out.print(i);
            if (i <15){
                System.out.print(" ");
            }
        }
        System.out.println();

        System.out.println("\nCount backwards by 5's from 100 to -10");
        for(i = 100;i >=-10;i-=5){
            System.out.println(i);
        }

        System.out.println("\nSquare previous number starting at 2 but no larger than 1,000,000");
        for(i = 2; i<1000000 && i != 0; i *= i){
            System.out.println(i);
        }

        System.out.println("\nFizzBuzz 3 and 5");

        for(i=1; i <= 100; i++){

            if(i % 3 == 0){
                System.out.print("Fizz");
            }
            if(i % 5 == 0){
                System.out.print("Buzz");
            } else {
                if (i % 3 != 0 && i % 5 != 0){
                    System.out.print(i);
                }
            }
            System.out.println();
        }

        System.out.println("The system will generate squares and cubes up to a given integer.");
        System.out.println("What number would you like to go up to?");
        int x = Integer.parseInt(scanner.nextLine());

        String answer;
        boolean keepGoing;

        do{
            System.out.println("| number | squared | cubed");
            System.out.println("| ------ | ------- | -----");

            for(i = 1; i<= x; i++){
                System.out.printf("| %-6d | %-7d | %-5d\n", i, (i*i),(i*i*i));
            }
            System.out.println("Generate another table?");
            answer = scanner.nextLine();
            keepGoing = answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y");
            if(keepGoing){
                System.out.println("What number would you like to go up to?");
                x = Integer.parseInt(scanner.nextLine());
            }
        }while(keepGoing);

    }//end main
}//end class
