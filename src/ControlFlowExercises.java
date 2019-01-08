public class ControlFlowExercises {
    public static void main(String[] args){
        int i = 5;
        while(i <=15){
            System.out.print(i);
            if (i <15){
                    System.out.print(" ");
                }
            i++;
        }
        System.out.println();
        i = 100;
        do{
            if (i!=-10) {
                System.out.println(i);
            } else {
                System.out.print(i);
            }
            i-=5;
        }while(i >=-10);

    }//end main
}//end class
