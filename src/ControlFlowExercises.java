public class ControlFlowExercises {
    public static void main(String[] args){
        System.out.println("Integers from 5 to 15");
        int i = 5;
        while(i <=15){
            System.out.print(i);
            if (i <15){
                    System.out.print(" ");
                }
            i++;
        }
        System.out.println();

        System.out.println("\nCount backwards by 5's from 100 to -10");
        i = 100;
        do{
            System.out.println(i);
            i-=5;
        }while(i >=-10);

        System.out.print("\nSquare previous number starting at 2 but no larger than 1,000,000");
        i=2;
        do{
            System.out.print("\n"+i);
            i = i * i;
        }while(i<1000000 && i != 0);

    }//end main
}//end class
