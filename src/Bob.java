import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Try speaking with Bob, He hasn't been too conversational lately.");
        String speaks;
        String choice;

         do {
             speaks = scan.next();
            if(speaks.isEmpty()){
                System.out.println("Fine. Be that way!");
            } else if(speaks.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if(speaks.endsWith("?")){
                System.out.println("Sure.");
            } else {
                System.out.println("Whatever");
            }
                 System.out.println("\nSpeak to Bob again?");
             choice = scan.next();
             if(decide(choice)){
                 System.out.println("The floor is all yours.");
             }
         } while(decide(choice));

//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.

    }// end main

    public static boolean decide(String go){
        return go.equalsIgnoreCase("yes") || go.equalsIgnoreCase("y");
    }// end decide method
}// end class

