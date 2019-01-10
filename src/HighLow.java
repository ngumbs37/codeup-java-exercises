public class HighLow {
    public static void main(String[] args) {
        MethodsExercises userInput = new MethodsExercises();
        int numberToGuess = randomNumber();
        int userGuess, counter = 0, attemptsLeft = 10;
        System.out.println("We're going to play a game of High-Low");

        do {
            userGuess = userInput.getInteger(1, 100);
            System.out.print("Your guess was "+ userGuess);
            compare(userGuess, numberToGuess);
            counter++;
            attemptsLeft--;
            if (attemptsLeft <=3 ){
                System.out.print("Attempts left: "+attemptsLeft +"\n");
            }
        }while(userGuess != numberToGuess && attemptsLeft != 0);
        if (attemptsLeft ==0){
            System.out.println("You ran out of attempts.\nThe number to guess was "+ numberToGuess);
        }else {
            System.out.println("It took " + counter + " tries to guess correctly.");
        }
    }// end main

    static int randomNumber(){
        return (int) (Math.random() * 100 )+1;
    }// end randomNumber
    static void compare(int a, int b){
        Guess guess = new Guess();
        if(a > b){
            guess.lower();
        } else if(a < b){
            guess.higher();
        } else {
            guess.correct();
        }
    }// end compare
}// end HighLow class
class Guess{
    void higher(){
        System.out.println("\nTry a higher number.");
    }
    void lower(){
        System.out.println("\nTry a lower number.");
    }
    void correct(){
        System.out.println("\nYou guessed correctly!");
    }
}// end Guess class

