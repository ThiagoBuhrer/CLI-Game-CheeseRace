package CheeseRace.GamePlay;

import CheeseRace.GameDesign.Design;
import CheeseRace.GameDesign.Text;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int option = -1;

        Design.Intro();
        System.out.println("\n");
        Design.Bar();
        System.out.println("\nPress ENTER");

        //wait until the player presses ENTER to continue
        while (true) {
            String input = scanner.nextLine();
            //if user presses ENTER (empty input) we leave the loop
            if (input.isEmpty()) {
                break;
            } else {
                System.out.println("Press ENTER to continue...");
            }
        }

        //display menu options to the user
        do {
            System.out.println("\n" + "\t\u001B[33m1\u001B[0m - Start a new Cheese Race");
            System.out.println("\t\u001B[33m2\u001B[0m - See credits");
            System.out.println("\t\u001B[33m0\u001B[0m - Exit \n");

            option = scanner.nextInt();
            switch (option) {
                case 0:    //option "Exit".
                    System.out.println();
                    Design.Bar();
                    System.out.println("\nNo cheese for you... Bye bye!\n");
                    Design.Bye();
                    System.out.println();
                    break;
                case 1:    //option "Cheese Race".
                    Play.gameOn();
                    break;
                case 2:    //option "See Credits".
                    Text.Credits();
                    break;
                default:   //in case user's input is not valid
                    System.out.println("Invalid option. Try again.");
            }

        }while (option != 0);
    }
}


