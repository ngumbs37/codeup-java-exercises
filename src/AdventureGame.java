import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Welcome to the adventure game!\n");
        System.out.println("What is your name adventurer?");
        String username = scan.next();
        System.out.println("Are you ready to begin, "+ username+"?");
        String choice = scan.next();
        System.out.println("What enemy do you wish to hunt?");
        String enemyName = scan.next();
        boolean escape = false;
        boolean decide = choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y");
        if (decide){
            int enemyHP = 75, enemyAtk = 15, userHP = 100, userAtk = 10, userPotions = 3, action;
            String actionPick ="What would you like to do? (Enter number of the action)\n1. Attack\n2. Drink Potion\n3. Escape!";
            String displayStats = "\n%s's Stats\nHP: %d\nAttack: %d\n\n%s's stats:\nHP: %d\nAttack: %d\nPotions: %d (adds 30 HP)\n\n";

            System.out.printf("A %s has appeared!\n", enemyName);
            do {
                System.out.format(displayStats, enemyName, enemyHP, enemyAtk, username, userHP, userAtk, userPotions);
                System.out.println(actionPick);
                action = scan.nextInt();
                if (action == 1) {
                    enemyHP = enemyHP - userAtk;

                }else if (action == 2){
                    if (userPotions > 0) {

                        if (userHP == 100){
                            System.out.println("You are already max HP");
                            continue;
                        }
                        userPotions--;
                        userHP = userHP + 30;

                        if (userHP > 100){
                            userHP = 100;
                        }
                    } else {
                        System.out.println("You have no more potions!");
                        continue;
                    }
                } else if (action == 3){
                    System.out.println("You chose to escape.");
                    escape = true;
                    break;
                }
                System.out.println("%s attacks you for %d damage");
                userHP = userHP - enemyAtk;


            } while(enemyHP > 0 && userHP > 0);


                if (enemyHP < 0 && escape){
                    System.out.printf("You have defeated the %s. Game will now end\n", enemyName);
                }else {
                    System.out.printf("The %s is victorious. Game will now end\n", enemyName);
                }

        } else {
            System.out.println("So, you don't want to play.\nSystem will now terminate.");
        }

    }// end main
}// end class
