public class ControlFlowExercises {
    public static void main(String[] args){
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

        System.out.print("\nSquare previous number starting at 2 but no larger than 1,000,000");
        for(i = 2; i<1000000 && i != 0; i *= i){
            System.out.print("\n"+i);
        }

    }//end main
}//end class
