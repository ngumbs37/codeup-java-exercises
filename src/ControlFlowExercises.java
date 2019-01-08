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
        
        i = 0;
        do{
            if (i!=100) {
                System.out.println(i);
            } else {
                System.out.print(i);
            }
            i+=2;
        }while(i <=100);

    }//end main
}//end class
