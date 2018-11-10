/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racedayv3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Stephen
 */
public class RaceDayV3 
{

    public static void main(String[] args) 
    {
//        String playerOneName;
//        String playerTwoName;
//        String playerThreeName;
//        String playerFourName;

//        int playerOneNumberChoice = 0;
//        int playerTwoNumberChoice = 0;
//        int playerThreeNumberChoice = 0;
//        int playerFourNumberChoice = 0;
//
//        int playerOneTotalTries = 0;
//        int playerTwoTotalTries = 0;
//        int playerThreeTotalTries = 0;
//        int playerFourTotalTries = 0;
//        
//        int min = 0;
//        int playerOneMaxValue = 0;
//        int playerTwoMaxValue = 0;
//        int playerThreeMaxValue = 0;
//        int playerFourMaxValue = 0;
//        
//        int finalistPlayer1Number = 0;
//        int finalistPlayer2Number = 0;
//        int finalistPlayer1TotalTries = 0;
//        int finalistPlayer2TotalTries = 0;
//        
//        String[] finalContestantsArray = new String[2];
        // To use Scanner class import java.util.Scanner.
        Scanner keyboard = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to Race Day!\n");

        // Player 1 name choice
        System.out.println("Player one choose name below\n");
        System.out.print("Enter name: ");
        String playerOneName = keyboard.nextLine();
        System.out.println("Welcome: " + playerOneName + " you are player 1.");

        // Player 2 name choice
        System.out.println("\nPlayer Two choose name below\n");
        System.out.print("Enter name: ");
        String playerTwoName = keyboard.nextLine();
        System.out.println("Welcome: " + playerTwoName + " you are player 2.");

        // Player 3 name choice
        System.out.println("\nPlayer Three choose name below\n");
        System.out.print("Enter name: ");
        String playerThreeName = keyboard.nextLine();
        System.out.println("Welcome: " + playerThreeName + " you are player 3.");

        // Player 4 name choice
        System.out.println("\nPlayer Four choose name below\n");
        System.out.print("Enter name: ");
        String playerFourName = keyboard.nextLine();
        System.out.println("Welcome: " + playerFourName + " you are player 4.");

        // Prints out the players names to the console
        System.out.printf("\nWelcome to Race Day: \n%s\n%s\n%s\n"
                + "%s\n", playerOneName, playerTwoName, playerThreeName, playerFourName);

        // (The name player 1 entered above) choose a number between 1 - 10
        System.out.printf("\n%s choose a number between 1 - 10: ", playerOneName);

//        // Declared and initialize / set the variable to zero 
//        playerOneNumberChoice;
        int playerOneNumberChoice = 0;

        while (keyboard.hasNextInt()) 
        {
            if (keyboard.hasNextInt()) 
            {
                playerOneNumberChoice = keyboard.nextInt();
            }
            else 
            {
                System.out.println("Please enter a valid number");
                keyboard.next();
                continue;
            }
            // Must be a number greater than zero!
            if (playerOneNumberChoice < 0) 
            {
                System.out.println("Please enter a number greater than 0");
                continue;
            }
            // Must be below the number 10! e.g 10 is vaild, 11 is invalid!
            if (playerOneNumberChoice > 10) 
            {
                System.out.println("Please enter a number below 10");
                continue;
            }
            // The user entered a valid value.
//            System.out.println("User entered: " + playerOneNumber);
            // We are now finished with the checks in the if / else statements
            break;
        }
        // Print out the number the player typed.
        System.out.printf("%s your number is : %d\n", playerOneName, playerOneNumberChoice);

        // (The name player 2 entered above) choose a number between 1 - 10
        System.out.printf("\n%s choose a number between 1 - 10: ", playerTwoName);

        int playerTwoNumberChoice = 0;

        while (keyboard.hasNextInt()) 
        {

            if (keyboard.hasNextInt()) 
            {
                playerTwoNumberChoice = keyboard.nextInt();
            } 
            else 
            {
                System.out.println("Please enter a valid number");
                keyboard.next();
                continue;
            }

            if (playerTwoNumberChoice < 0) 
            {
                System.out.println("Please enter a number greater than 0");
                continue;
            }

            if (playerTwoNumberChoice > 10) 
            {
                System.out.println("Please enter a number below 10");
                continue;
            }

            if (playerTwoNumberChoice == playerOneNumberChoice) 
            {
                System.out.println("Number already taken.  Please pick a different number!");
                System.out.printf("\n%s choose a number between 1 - 10: ", playerTwoName);
                continue;
            }

            //At this stage, the number is an int >= 0
            System.out.println("User entered: " + playerTwoNumberChoice);
            break;
        }

        System.out.printf("%s your number is : %d\n", playerTwoName, playerTwoNumberChoice);

        // (The name player 3 entered above) choose a number between 1 - 10
        System.out.printf("\n%s choose a number between 1 - 10: ", playerThreeName);

        int playerThreeNumberChoice = 0;

        while (keyboard.hasNextInt()) 
        {

            if (keyboard.hasNextInt()) 
            {
                playerThreeNumberChoice = keyboard.nextInt();
            } 
            else 
            {
                System.out.println("Please enter a valid number");
                keyboard.next();
                continue;
            }

            if (playerThreeNumberChoice < 0) 
            {
                System.out.println("Please enter a number greater than 0");
                continue;
            }

            if (playerThreeNumberChoice > 10) 
            {
                System.out.println("Please enter a number below 10");
                continue;
            }

            if (playerThreeNumberChoice == playerOneNumberChoice
                    || playerThreeNumberChoice == playerTwoNumberChoice) 
            {
                System.out.println("Number already taken.  Please pick a different number!");
                System.out.printf("\n%s choose a number between 1 - 10: ", playerThreeName);
                continue;
            }

            //At this stage, the number is an int >= 0
            System.out.println("User entered: " + playerThreeNumberChoice);
            break;
        }

        System.out.printf("%s your number is : %d\n", playerThreeName, playerThreeNumberChoice);

        // (The name player 4 entered above) choose a number between 1 - 10
        System.out.printf("\n%s choose a number between 1 - 10: ", playerFourName);

        int playerFourNumberChoice = 0;
//        // Dodgy nothing specific!!!
        while (keyboard.hasNextInt()) 
        {
            if (keyboard.hasNextInt()) {
                playerFourNumberChoice = keyboard.nextInt();
            } else {
                System.out.println("Please enter a valid number");
                keyboard.next();
                continue;
            }

            if (playerFourNumberChoice < 0) 
            {
                System.out.println("Please enter a number greater than 0");
                continue;
            }

            if (playerFourNumberChoice > 10) 
            {
                System.out.println("Please enter a number below 10");
                continue;
            }

            if (playerFourNumberChoice == playerOneNumberChoice || playerFourNumberChoice == playerTwoNumberChoice
                    || playerFourNumberChoice == playerThreeNumberChoice) 
            {
                System.out.println("Number already taken.  Please pick a different number!");
                System.out.printf("\n%s choose a number between 1 - 10: ", playerFourName);
                continue;
            }

            //At this stage, the number is an int >= 0
            System.out.println("User entered: " + playerFourNumberChoice);
            break;
        }

        System.out.printf("%s your number is : %d\n", playerFourName, playerFourNumberChoice);

        System.out.printf("\nName: %s\tNumber: %d\tName: %s\tNumber: %d\tName: %s\tNumber: %d\tName: "
                + "%s\tNumber: %d\n", playerOneName, playerOneNumberChoice, playerTwoName, playerTwoNumberChoice,
                playerThreeName, playerThreeNumberChoice, playerFourName, playerFourNumberChoice);

        System.out.println("\nYour turns will now be calculated randomly!\n");

        // Random class: import java.util.Random;
        Random random = new Random();

        //Set the minimum value to 1.
        int min = 1;
//        // Set the max value to 10.
//        int max = 10;
//        playerOneMaxValue = playerOneTotalTries;
//        playerTwoMaxValue = playerTwoTotalTries;
//        playerThreeMaxValue = playerThreeTotalTries;
//        playerFourMaxValue = playerFourTotalTries;
//        
//        System.out.println(playerOneMaxValue + playerTwoMaxValue + playerThreeMaxValue + playerFourMaxValue);
//        
//        playerOneTotalTries = random.nextInt(playerOneMaxValue - min + playerOneName.length());
//        playerTwoTotalTries = random.nextInt(playerTwoMaxValue - min + playerOneName.length());
//        playerThreeTotalTries = random.nextInt(playerThreeMaxValue - min + playerOneName.length());
//        playerFourTotalTries = random.nextInt(playerFourMaxValue - min + playerOneName.length());

//        playerOneTotalTries = random.nextInt((playerOneMaxValue - min) + 1) + min;
//        playerTwoTotalTries = random.nextInt((playerTwoMaxValue - min) + 1) + min;
//        playerThreeTotalTries = random.nextInt((playerThreeMaxValue - min) + 1) + min;
//        playerFourTotalTries = random.nextInt((playerFourMaxValue - min) + 1) + min;
        int playerOneTotalTries = ThreadLocalRandom.current().nextInt(min, playerOneNumberChoice)
                + min + playerOneName.length();
        System.out.printf("\n%s you have %d number of tries!", playerOneName, playerOneTotalTries);

        int playerTwoTotalTries = ThreadLocalRandom.current().nextInt(min, playerTwoNumberChoice)
                + min + playerTwoName.length();
        System.out.printf("\n%s you have %d number of tries!", playerTwoName, playerTwoTotalTries);

        int playerThreeTotalTries = ThreadLocalRandom.current().nextInt(min, playerThreeNumberChoice)
                + min + playerThreeName.length();
        System.out.printf("\n%s you have %d number of tries", playerThreeName, playerThreeTotalTries);

        int playerFourTotalTries = ThreadLocalRandom.current().nextInt(min, playerFourNumberChoice)
                + min + playerFourName.length();
        System.out.printf("\n%s you have %d number of tries!\n", playerFourName, playerFourTotalTries);

        System.out.println("------------------------------------------------------------------------");

        for (int i = 0; i < playerOneTotalTries; i++) 
        {

            System.out.print(".");

        }
        
        System.out.print(playerOneName + "\n");

        for (int i = 0; i < playerTwoTotalTries; i++) 
        {
            System.out.print(".");
        }
        
        System.out.print(playerTwoName + "\n");

        for (int i = 0; i < playerThreeTotalTries; i++) 
        {
            System.out.print(".");
        }
        
        System.out.print(playerThreeName + "\n");

        for (int i = 0; i < playerFourTotalTries; i++) 
        {
            System.out.print(".");
        }
        
        System.out.print(playerFourName + "\n");

        System.out.println("------------------------------------------------------------------------");

        // String[] placesArray = {"1st", "2nd", "3rd", "4th"};
        int[] stephensNumberArray = {playerOneTotalTries, playerTwoTotalTries, playerThreeTotalTries, playerFourTotalTries};

        Arrays.sort(stephensNumberArray);
        //System.out.println("Array: " + numbers);
        int first = stephensNumberArray[stephensNumberArray.length - 1];
        int second1 = stephensNumberArray[stephensNumberArray.length - 2];

        if (playerOneTotalTries == first) 
        {
            System.out.printf("Winner %s with %d steps", playerOneName, playerOneTotalTries);
            System.out.println();
        } 
        else if (playerTwoTotalTries == first) 
        {
            System.out.printf("Winner %s with %d steps", playerTwoName, playerTwoTotalTries);
            System.out.println();
        } 
        else if (playerThreeTotalTries == first) 
        {
            System.out.printf("Winner %s with %d steps", playerThreeName, playerThreeTotalTries);
            System.out.println();
        } 
        else 
        {
            System.out.printf("Winner %s with %d steps", playerFourName, playerFourTotalTries);
            System.out.println();
        }

        if (playerOneTotalTries == second1) 
        {
            System.out.printf("Runner up %s with %d steps", playerOneName, playerOneTotalTries);
            System.out.println();
        } 
        else if (playerTwoTotalTries == second1) 
        {
            System.out.printf("Runner up %s with %d steps", playerTwoName, playerTwoTotalTries);
            System.out.println();
        } 
        else if (playerThreeTotalTries == second1) 
        {
            System.out.printf("Runner up %s with %d steps", playerThreeName, playerThreeTotalTries);
            System.out.println();
        } 
        else 
        {
            System.out.printf("Runner up %s with %d steps", playerFourName, playerFourTotalTries);
            System.out.println();
        }

        System.out.println("----------------------------------------------------------------------");

        Arrays.sort(stephensNumberArray);
        first = stephensNumberArray[stephensNumberArray.length - 1];
        second1 = stephensNumberArray[stephensNumberArray.length - 2];
        int third = stephensNumberArray[stephensNumberArray.length - 3];
        int forth = stephensNumberArray[stephensNumberArray.length - 4];

        System.out.println("Leaderboard");

        System.out.println("------------");

        if (playerOneTotalTries == first) 
        {
            System.out.printf("1st %s %d steps", playerOneName, playerOneTotalTries);
            System.out.println();
        } 
        else if (playerTwoTotalTries == first) 
        {
            System.out.printf("1st %s %d steps", playerTwoName, playerTwoTotalTries);
            System.out.println();
        } 
        else if (playerThreeTotalTries == first) 
        {
            System.out.printf("1st %s %d steps", playerThreeName, playerThreeTotalTries);
            System.out.println();
        } 
        else 
        {
            System.out.printf("1st %s %d steps", playerFourName, playerFourTotalTries);
            System.out.println();
        }

        if (playerOneTotalTries == second1) 
        {
            System.out.printf("2nd %s %d steps", playerOneName, playerOneTotalTries);
            System.out.println();
        } 
        else if (playerTwoTotalTries == second1) 
        {
            System.out.printf("2nd %s %d steps", playerTwoName, playerTwoTotalTries);
            System.out.println();
        } 
        else if (playerThreeTotalTries == second1) 
        {
            System.out.printf("2nd %s %d steps", playerThreeName, playerThreeTotalTries);
            System.out.println();
        } 
        else 
        {
            System.out.printf("2nd %s %d steps", playerFourName, playerFourTotalTries);
            System.out.println();
        }

        if (playerOneTotalTries == third) 
        {
            System.out.printf("3rd %s %d steps", playerOneName, playerOneTotalTries);
            System.out.println();
        } 
        else if (playerTwoTotalTries == third) 
        {
            System.out.printf("3rd %s %d steps", playerTwoName, playerTwoTotalTries);
            System.out.println();
        } 
        else if (playerThreeTotalTries == third) 
        {
            System.out.printf("3rd %s %d steps", playerThreeName, playerThreeTotalTries);
            System.out.println();
        } 
        else 
        {
            System.out.printf("3rd %s %d steps", playerFourName, playerFourTotalTries);
            System.out.println();
        }

        if (playerOneTotalTries == forth) 
        {
            System.out.printf("4th %s %d steps", playerOneName, playerOneTotalTries);
            System.out.println();
        } 
        else if (playerTwoTotalTries == forth) 
        {
            System.out.printf("4th %s %d steps", playerTwoName, playerTwoTotalTries);
            System.out.println();
        } 
        else if (playerThreeTotalTries == forth) 
        {
            System.out.printf("4th %s %d steps", playerThreeName, playerThreeTotalTries);
        } 
        else 
        {
            System.out.printf("4th %s %d steps", playerFourName, playerFourTotalTries);
            System.out.println();
        }

        System.out.println("------------------------------------------------------------");

        String[] finalContestantsArray = new String[2];

        if (playerOneTotalTries == first) 
        {
            System.out.printf("%s advances to the final", playerOneName);
            finalContestantsArray[0] = playerOneName;
            System.out.println();
        } 
        else if (playerTwoTotalTries == first) 
        {
            System.out.printf("%s advances to the final", playerTwoName);
            finalContestantsArray[0] = playerTwoName;
            System.out.println();
        } 
        else if (playerThreeTotalTries == first) 
        {
            System.out.printf("%s advances to the final", playerThreeName);
            finalContestantsArray[0] = playerThreeName;
            System.out.println();
        } 
        else 
        {
            System.out.printf("%s advances to the final", playerFourName);
            finalContestantsArray[0] = playerFourName;
            System.out.println();
        }

        if (playerOneTotalTries == second1) 
        {
            System.out.printf("%s advances to the final", playerOneName);
            finalContestantsArray[1] = playerOneName;
            System.out.println();
        } 
        else if (playerTwoTotalTries == second1) 
        {
            System.out.printf("%s advances to the final", playerTwoName);
            finalContestantsArray[1] = playerTwoName;
            System.out.println();
        } 
        else if (playerThreeTotalTries == second1) 
        {
            System.out.printf("%s advances to the final", playerThreeName);
            finalContestantsArray[1] = playerThreeName;
            System.out.println();
        } 
        else 
        {
            System.out.printf("%s advances to the final", playerFourName);
            finalContestantsArray[1] = playerFourName;
            System.out.println();
        }

        if (playerOneTotalTries == third) 
        {
            System.out.printf("Better luck next time %s.", playerOneName);
            System.out.println();
        } 
        else if (playerTwoTotalTries == third) 
        {
            System.out.printf("Better luck next time %s.", playerTwoName);
            System.out.println();
        } 
        else if (playerThreeTotalTries == third) 
        {
            System.out.printf("Better luck next time %s.", playerThreeName);
            System.out.println();
        } 
        else 
        {
            System.out.printf("Better luck next time %s.", playerFourName);
            System.out.println();
        }

        if (playerOneTotalTries == forth) 
        {
            System.out.printf("Better luck next time %s.", playerOneName);
            System.out.println();
        } 
        else if (playerTwoTotalTries == forth) 
        {
            System.out.printf("Better luck next time %s.", playerTwoName);
            System.out.println();
        } 
        else if (playerThreeTotalTries == forth) 
        {
            System.out.printf("Better luck next time %s.", playerThreeName);
            System.out.println();
        } 
        else 
        {
            System.out.printf("Better luck next time %s.", playerFourName);
            System.out.println();
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("Round 2");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < finalContestantsArray.length; i++) {
            System.out.printf("Welcome to the final %s!\n", finalContestantsArray[i]);
        }

        System.out.println("------------------------------------------------------------");

        System.out.printf("%s please choose a number between 1 - 10: ", finalContestantsArray[0]);

        int finalistPlayer1Number = 0;

        while (keyboard.hasNextInt()) 
        {
            if (keyboard.hasNextInt()) 
            {
                finalistPlayer1Number = keyboard.nextInt();
            } 
            else 
            {
                System.out.println("Please enter a valid number");
                keyboard.next();
                continue;
            }
            // Must be a number greater than zero!
            if (finalistPlayer1Number < 0) 
            {
                System.out.println("Please enter a number greater than 0");
                continue;
            }
            // Must be below the number 10! e.g 10 is vaild, 11 is invalid!
            if (finalistPlayer1Number > 10) 
            {
                System.out.println("Please enter a number below 10");
                continue;
            }
            // The user entered a valid value.
//            System.out.println("User entered: " + playerOneNumber);
            // We are now finished with the checks in the if / else statements
            break;
        }
        // Print out the number the player typed.
        System.out.printf("%s your number is : %d\n", finalContestantsArray[0], finalistPlayer1Number);

        System.out.printf("%s please choose a number between 1 - 10: ", finalContestantsArray[1]);

        int finalistPlayer2Number = 0;

        while (keyboard.hasNextInt()) 
        {
            if (keyboard.hasNextInt()) 
            {
                finalistPlayer2Number = keyboard.nextInt();
            }
            else 
            {
                System.out.println("Please enter a valid number");
                keyboard.next();
                continue;
            }
            // Must be a number greater than zero!
            if (finalistPlayer2Number < 0) 
            {
                System.out.println("Please enter a number greater than 0");
                continue;
            }
            // Must be below the number 10! e.g 10 is vaild, 11 is invalid!
            if (finalistPlayer2Number > 10) 
            {
                System.out.println("Please enter a number below 10");
                continue;
            }
            // The user entered a valid value.
//            System.out.println("User entered: " + playerOneNumber);
            // We are now finished with the checks in the if / else statements
            break;
        }
        // Print out the number the player typed.
        System.out.printf("%s your number is : %d\n", finalContestantsArray[1], finalistPlayer2Number);

        System.out.println("\nYour turns will now be calculated randomly!\n");

        int finalistPlayer1TotalTries = ThreadLocalRandom.current().nextInt(min, playerOneNumberChoice)
                + min + playerOneName.length();
        System.out.printf("\n%s you have %d number of tries!", finalContestantsArray[0], finalistPlayer1TotalTries);

        int finalistPlayer2TotalTries = ThreadLocalRandom.current().nextInt(min, playerTwoNumberChoice)
                + min + playerTwoName.length();
        System.out.printf("\n%s you have %d number of tries!", finalContestantsArray[1], finalistPlayer2TotalTries);

        System.out.println();

        System.out.println("------------------------------------------------------------------------");

        int[] finalistNumbersArray = {finalistPlayer1TotalTries, finalistPlayer2TotalTries};

        if (finalistPlayer1TotalTries > finalistPlayer2TotalTries) 
        {
            System.out.printf("%s won with a final score of : %d congradulations", finalContestantsArray[0], finalistPlayer1TotalTries);
        } 
        else 
        {
            System.out.printf("%s won with a final score of : %d congradulations", finalContestantsArray[1], finalistPlayer2TotalTries);

            System.out.println();
        }

        Arrays.sort(finalistNumbersArray);
        //System.out.println("Array: " + numbers);
        first = finalistNumbersArray[finalistNumbersArray.length - 1];
        second1 = finalistNumbersArray[finalistNumbersArray.length - 2];

        System.out.println("----------------------------------------------------------------------");

        System.out.println("Final Scoreboard");

        System.out.println("----------------------------------------------------------------------");

        if (finalistPlayer1TotalTries == first) 
        {
            System.out.printf("Winner %s with %d steps", finalContestantsArray[0], finalistPlayer1TotalTries);
            System.out.println();
        } 
        else 
        {
            System.out.printf("Winner %s with %d steps", finalContestantsArray[1], finalistPlayer2TotalTries);
            System.out.println();
        }

        if (finalistPlayer1TotalTries == second1) 
        {
            System.out.printf("Runner up %s with %d steps", finalContestantsArray[0], finalistPlayer1TotalTries);
            System.out.println();
        } 
        else 
        {
            System.out.printf("Runner up %s with %d steps", finalContestantsArray[1], finalistPlayer1TotalTries);
            System.out.println();
        }

        System.out.println("----------------------------------------------------------------------");
    }
}
