package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Students> students = new HashMap<>();
        Input input = new Input();

        String[] names = {"julianGT", "theAlien", "kriSSy", "havocJunkie"};
        students.put(names[0].toLowerCase(), Students.addStudent("Julian", 88, 84, 90));
        students.put(names[1].toLowerCase(), Students.addStudent("Howard", 100, 100, 100));
        students.put(names[2].toLowerCase(), Students.addStudent("Kristine", 83, 72, 92));
        students.put(names[3].toLowerCase(), Students.addStudent("Cody", 83, 73, 42));

        System.out.println("Welcome!\n");

        System.out.printf("Here are the github usernames of our students:\n" +
                        "%s, %s, %s, %s\n\n", names[0], names[1], names[2], names[3]);
        do{
            System.out.println("What student would you like to see more information on?\n>  ");
            String userInput = input.getString();
            String userInputL = userInput.toLowerCase();
            if (students.keySet().contains(userInputL)) {
                System.out.println("Name: " + students.get(userInputL).getName() +
                        " - Gihub Username: " + userInputL +
                        "\nCurrent Average: " + students.get(userInput).getGradeAverage());
            } else {
                System.out.printf("\'%s\' was not found", userInput);
            }
        }while (input.yesNo("Would you like to see another student?\n"));
        System.out.println("Goodbye, and have a wonderful day!");
    }

}
