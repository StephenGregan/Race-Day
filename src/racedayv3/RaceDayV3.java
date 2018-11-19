package racedayv3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Stephen Gregan
 */
public class RaceDayV3
{

    public static void main(String[] args)
    {
        // Set up a scanner to take in user input!
        Scanner keyboard = new Scanner(System.in);

        System.out.println("--------------------------------------------------------------------------------------------");

        // Welcome message
        System.out.println("Welcome to Race Day!");

        System.out.println("--------------------------------------------------------------------------------------------");

        // Player 1 name choice
        System.out.println("Player One choose name below");
        System.out.print("Enter name: ");
        // Store user input in variable for player 1
        String playerOneName = keyboard.nextLine();
        // Welcome player 1
        System.out.println("Welcome: " + playerOneName + " you are player 1");

        System.out.println("--------------------------------------------------------------------------------------------");

        // Declare and initialize variable below, set the value to true
        // The default value for a boolean is false!
        boolean isSameValue = true;

        // Declare and initialize variable below, set value to an empty string
        String playerTwoName = "";

        // Do execute all code within the {} curly braces while isSameValue = true 
        do
        {
            // Player 2 name choice
            System.out.println("Player Two choose name below");
            System.out.print("Enter name: ");
            // Store user input in variable for player 2
            playerTwoName = keyboard.nextLine();

            // Check if player 2 enters the same name as player 1
            if (playerTwoName.equals(playerOneName))
            {
                System.out.println("The name you entered has already been assigned to another player");
                // Give user alternate suggestions
                System.out.printf("Suggestions for alternate names:\n%s, %s, %s, %s\n", playerTwoName.concat("123"),
                        playerTwoName.concat("25"), playerTwoName.concat("99"), playerTwoName.concat("55"));
                isSameValue = false;
                // Continue until user enters a valid name
                continue;
            }
            // Welcome player 2
            System.out.println("Welcome: " + playerTwoName + " you are player 2");
            // User entered a valid name move on with code!
            break;
        } while (isSameValue = true);

        System.out.println("--------------------------------------------------------------------------------------------");

        // Set the value back to true
        isSameValue = true;

        // Declare and initialize variable below, set its value to an empty string
        String playerThreeName = "";

        // Do execute all code within the {} curly braces while isSameValue = true 
        do
        {
            // Player 3 name choice
            System.out.println("Player Three choose name below");
            System.out.print("Enter name: ");
            // Store user input in variable for player 3
            playerThreeName = keyboard.nextLine();

            // Check if user entered a name that has already been assigned to another player
            if (playerThreeName.equals(playerOneName) || playerThreeName.equals(playerTwoName))
            {
                System.out.println("The name you entered has already been assigned to another player");
                // Give user alternate suggestions
                System.out.printf("Suggestions for alternate names:\n%s, %s, %s, %s\n", playerThreeName.concat("123"),
                        playerThreeName.concat("25"), playerThreeName.concat("99"), playerThreeName.concat("55"));
                isSameValue = false;
                // Continue until user enters a valid name
                continue;
            }
            // Welcome player 3
            System.out.println("Welcome: " + playerThreeName + " you are player 3");
            // User entered a valid name move on with code!
            break;
        } while (isSameValue = true);

        System.out.println("--------------------------------------------------------------------------------------------");

        // Set the value back to true
        isSameValue = true;

        // Declare and initalize variable below, set value to an empty string
        String playerFourName = "";

        // Do execute all code within the {} curly braces while isSameValue = true 
        do
        {
            // Player 4 name choice
            System.out.println("Player Four choose name below");
            System.out.print("Enter name: ");
            // Store user input in variable for player 4
            playerFourName = keyboard.nextLine();

            // Check if user entered a name that has already been assigned to another player
            if (playerFourName.equals(playerOneName) || playerFourName.equals(playerTwoName)
                    || playerFourName.equals(playerThreeName))
            {
                System.out.println("The name you entered has already been assigned to another player");
                // Give user alternate suggestions
                System.out.printf("Suggestions for alternate names:\n%s, %s, %s, %s\n", playerFourName.concat("123"),
                        playerFourName.concat("25"), playerFourName.concat("99"), playerFourName.concat("55"));
                isSameValue = false;
                // Continue until user enters a valid name
                continue;
            }
            // Welcome player 4
            System.out.println("Welcome: " + playerFourName + " you are player 4");
            // User entered a valid name move on with code!
            break;
        } while (isSameValue = true);

        System.out.println("--------------------------------------------------------------------------------------------");

        // Prints out the players names to the console
        System.out.printf("Welcome to Race Day: \n%s\n%s\n%s\n"
                + "%s\n", playerOneName, playerTwoName, playerThreeName, playerFourName);

        System.out.println("--------------------------------------------------------------------------------------------");

        // (The name player 1 entered above) choose a number between 1 - 10
        System.out.printf("%s choose a number between 1 - 10: ", playerOneName);

        // Declare and initialize the variable, set it to zero 
        int playerOneNumberChoice = 0;

        // Specify that the input must be of type int
        // If it is not the user will get the message
        // "Please enter a valid number"
        while (keyboard.hasNextLine())
        {
            // If the input is of type int,
            if (keyboard.hasNextInt())
            {
                // store that number in this variable
                playerOneNumberChoice = keyboard.nextInt();     
            } // Invlid entry
            else
            {
                // Print out that the number entered is not valid
                // and get the user to try again!
                System.out.printf("%s please enter a valid number: ", playerOneName);
                keyboard.next();
                // Continue until they input a valid number
                continue;
            }

            // Must be a number greater than zero!
            if (playerOneNumberChoice <= 0)
            {
                System.out.printf("%s please enter a number greater than 0: ", playerOneName);
                // Continue until user inputs a valid number
                continue;
            }

            // Must be below the number 11! e.g 10 is vaild, 11 is invalid!
            if (playerOneNumberChoice > 10)
            {
                System.out.printf("%s please enter a number less than 11: ", playerOneName);
                // Continue until user inputs a valid number
                continue;
            }

            // The user entered a valid value
            // We are now finished with the checks in the if / else statements
            // The number is an int greater than 0 and less than 11
            System.out.println("User entered: " + playerOneNumberChoice);
            // User entered a valid number move on with the code!
            break;
        }

        // Print out the name and number for player 1
        System.out.printf("%s your number is : %d\n", playerOneName, playerOneNumberChoice);

        System.out.println("--------------------------------------------------------------------------------------------");

        // (The name player 2 entered above) choose a number between 1 - 10
        System.out.printf("%s choose a number between 1 - 10: ", playerTwoName);

        // Declare and initialize the variable, set it to zero!
        int playerTwoNumberChoice = 0;

        // Specify that the input must be of type int
        // If it is not the user will get the message
        // "Please enter a valid number"
        while (keyboard.hasNextLine())
        {
            // If input is of type int,
            if (keyboard.hasNextInt())
            {
                // store that number in this variable
                playerTwoNumberChoice = keyboard.nextInt();
            } // Invlid entry
            else
            {
                // Print out that the number entered is not valid
                // and get the user to try again!
                System.out.printf("%s please enter a valid number: ", playerTwoName);
                keyboard.next();
                // Continue until user inputs a valid number
                continue;
            }

            // Number must be greater than zero!
            if (playerTwoNumberChoice <= 0)
            {
                System.out.printf("%s please enter a number greater than 0: ", playerTwoName);
                // Continue until they input a valid number
                continue;
            }
            // Must be below the number 11! e.g 10 is vaild, 11 is invalid!
            if (playerTwoNumberChoice > 10)
            {
                System.out.printf("%s please enter a number less than 11: ", playerTwoName);
                // Continue until user inputs a valid number
                continue;
            }

            // The user entered a valid value.
            // We are now finished with the checks in the if / else statements
            // The number is an int greater than 0 and less than 11
            System.out.println("User entered: " + playerTwoNumberChoice);
            // User entered a valid number move on with the code!
            break;
        }

        // Print out the name and number for player 2
        System.out.printf("%s your number is : %d\n", playerTwoName, playerTwoNumberChoice);

        System.out.println("--------------------------------------------------------------------------------------------");

        // (The name player 3 entered above) choose a number between 1 - 10
        System.out.printf("%s choose a number between 1 - 10: ", playerThreeName);

        // Declare and initialize variable, set it to zero!
        int playerThreeNumberChoice = 0;

        // Specify that the input must be of type int
        // If it is not the user will get the mesaage
        // "Please enter a valid number"
        while (keyboard.hasNextLine())
        {
            // If input is of type int,
            if (keyboard.hasNextInt())
            {
                // store that number in this variable
                playerThreeNumberChoice = keyboard.nextInt();
            } // invalid input
            else
            {
                // Print out that the number entered is not valid
                // and get the user to try again!
                System.out.printf("%s please enter a valid number: ", playerThreeName);
                keyboard.next();
                // Continue until they input a valid number
                continue;
            }

            // Number must be greater than zero!
            if (playerThreeNumberChoice <= 0)
            {
                System.out.printf("%s please enter a number greater than 0: ", playerThreeName);
                // Continue until user inputs a value number
                continue;
            }

            // Must be below the number 11! e.g 10 is vaild, 11 is invalid!
            if (playerThreeNumberChoice > 10)
            {
                System.out.printf("%s please enter a number less than 11: ", playerThreeName);
                // Continue until user inputs a valid number
                continue;
            }

            // The user entered a valid value.
            // We are now finished with the checks in the if / else statements
            // The number is an int greater than 0 and less than 11
            System.out.println("User entered: " + playerThreeNumberChoice);
            // User entered a valid number move on with the code!
            break;
        }

        // Print out the name and number for player 3
        System.out.printf("%s your number is : %d\n", playerThreeName, playerThreeNumberChoice);

        System.out.println("--------------------------------------------------------------------------------------------");

        // (The name player 4 entered above) choose a number between 1 - 10
        System.out.printf("%s choose a number between 1 - 10: ", playerFourName);

        // Declare and initialize variable, set it to zero
        int playerFourNumberChoice = 0;

        // Specify that the input must be of type int
        // If it is not the user will get the message
        // "Please enter a valid number"
        while (keyboard.hasNextLine())
        {
            // If input is of type int,
            if (keyboard.hasNextInt())
            {
                // store that number in this variable
                playerFourNumberChoice = keyboard.nextInt();
            } // Invalid input
            else
            {
                // Print out that the number entered is not valid
                // and get the user to try again!
                System.out.printf("%s please enter a valid number: ", playerFourName);
                keyboard.next();
                // Continue until user inputs a valid number
                continue;
            }

            // Number must be greater than zero!
            if (playerFourNumberChoice <= 0)
            {
                System.out.printf("%s please enter a number greater than 0: ", playerFourName);
                // Continue until user inputs a valid number
                continue;
            }

            // Must be below the number 11! e.g 10 is vaild, 11 is invalid!
            if (playerFourNumberChoice > 10)
            {
                System.out.printf("%s please enter a number less than 11: ", playerFourName);
                // Continue until user inputs a valid number
                continue;
            }

            // The user entered a valid value.
            // We are now finished with the checks in the if / else statements
            // The number is an int greater than 0 and less than 11
            System.out.println("User entered: " + playerFourNumberChoice);
            // User entered a valid number move on with the code!
            break;
        }

        // Print out the name and number for player 4
        System.out.printf("%s your number is : %d\n", playerFourName, playerFourNumberChoice);

        System.out.println("--------------------------------------------------------------------------------------------");

        // Print out all players names and numbers
        System.out.printf("Name: %s\t\tNumber: %d\nName: %s\t\tNumber: %d\nName: %s\t\tNumber: %d\nName: "
                + "%s\t\tNumber: %d\n", playerOneName, playerOneNumberChoice, playerTwoName, playerTwoNumberChoice,
                playerThreeName, playerThreeNumberChoice, playerFourName, playerFourNumberChoice);

        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println("Your turns will now be calculated randomly!");

        System.out.println("--------------------------------------------------------------------------------------------");

        // Set the value back to true
        isSameValue = true;

        // Random class: import java.util.Random;
        Random randomNumber = new Random();

        // Declare and initalize variable, set it to 20 * 2 = 40!
        int numberCalculation = 20 * 2;

        // Declare and initalize variable, set it to zero!
        int playerOneTotalSteps = 0;

        // Declare and initalize variable, set it to zero!
        int playerTwoTotalSteps = 0;

        // Declare and initalize variable, set it to zero!
        int playerThreeTotalSteps = 0;

        // Declare and initalize variable, set it to zero!
        int playerFourTotalSteps = 0;

        // Keep running this code in the do {} until the variable
        // isSameValue changes to false!
        do
        {
            playerOneTotalSteps = (playerOneNumberChoice + randomNumber.nextInt(playerOneNumberChoice) + 1) + playerFourName.length()
                    + randomNumber.nextInt(numberCalculation) + 1;

            playerTwoTotalSteps = (playerTwoNumberChoice + randomNumber.nextInt(playerTwoNumberChoice) + 1) + playerThreeName.length()
                    + randomNumber.nextInt(numberCalculation) + 1;

            playerThreeTotalSteps = (playerThreeNumberChoice + randomNumber.nextInt(playerThreeNumberChoice) + 1) + playerTwoName.length()
                    + randomNumber.nextInt(numberCalculation) + 1;

            playerFourTotalSteps = (playerFourNumberChoice + randomNumber.nextInt(playerFourNumberChoice) + 1) + playerOneName.length()
                    + randomNumber.nextInt(numberCalculation) + 1;

            // Checks if any of the values are the same
            // Used for safe guarding against duplicate values!
            if (playerOneTotalSteps == playerTwoTotalSteps || playerOneTotalSteps == playerThreeTotalSteps
                    || playerOneTotalSteps == playerFourTotalSteps || playerTwoTotalSteps == playerOneTotalSteps
                    || playerTwoTotalSteps == playerThreeTotalSteps || playerTwoTotalSteps == playerFourTotalSteps
                    || playerThreeTotalSteps == playerOneTotalSteps || playerThreeTotalSteps == playerTwoTotalSteps
                    || playerThreeTotalSteps == playerFourTotalSteps || playerFourTotalSteps == playerOneTotalSteps
                    || playerFourTotalSteps == playerTwoTotalSteps || playerFourTotalSteps == playerThreeTotalSteps)
            {
                // For testing purposes.  Please dont show this to the users!
                // System.out.println("Re-calculating numbers!");
                // Change the value to false!
                isSameValue = false;
                // Continue until there are no matches...
                continue;
            }
            // All numbers are different move on with the code!
            break;
        } while (isSameValue = true);

        // Print out player 1's total steps represented as dots(...)
        for (int i = 0; i < playerOneTotalSteps; i++)
        {
            System.out.print(".");
        }
        // Print player 1's name directly after the dots
        System.out.print(playerOneName + "\n");

        // Print out player 2's total steps represented as dots(...)
        for (int i = 0; i < playerTwoTotalSteps; i++)
        {
            System.out.print(".");
        }
        // Print player 2's name directly after dots(...)
        System.out.print(playerTwoName + "\n");

        // Print out player 3's total steps represented as dots(...)
        for (int i = 0; i < playerThreeTotalSteps; i++)
        {
            System.out.print(".");
        }
        // Print out player 3's name directly after dots(...)
        System.out.print(playerThreeName + "\n");

        // Print out player 4's total tries represented as dots(...)
        for (int i = 0; i < playerFourTotalSteps; i++)
        {
            System.out.print(".");
        }
        // Print out player 4's name directly after dots(...)
        System.out.print(playerFourName + "\n");

        System.out.println("--------------------------------------------------------------------------------------------");

        // Declare and initialize array with all the players total steps
        // You could write the code like this : int[] playersTotalStepsArray = new int[4];
        //                                      playersTotalStepsArray[0] = playerOneTotalSteps; etc
        // This way is better when you have the the information you want to store in the array now!
        int[] playersTotalStepsArray =
        {
            playerOneTotalSteps, playerTwoTotalSteps, playerThreeTotalSteps, playerFourTotalSteps
        };

        // Sort the array
        Arrays.sort(playersTotalStepsArray);

        // Declare variable and store the highest value in the variable below
        int highestValue = playersTotalStepsArray[playersTotalStepsArray.length - 1];

        // Declare variable and store the second highest value in the variable below
        int secondHighestValue = playersTotalStepsArray[playersTotalStepsArray.length - 2];

        // Declare variable and store the second lowest value in the variable below
        int secondLowestValue = playersTotalStepsArray[playersTotalStepsArray.length - 3];

        // Declare variable and store the lowest value in the varible below
        int lowestValue = playersTotalStepsArray[playersTotalStepsArray.length - 4];

        // If player 1's total steps equals the highest value they win
        if (playerOneTotalSteps == highestValue)
        {
            System.out.printf("Winner %s with %d steps", playerOneName, playerOneTotalSteps);
            System.out.println();
        } // If player 2's total steps equals the highest value they win
        else if (playerTwoTotalSteps == highestValue)
        {
            System.out.printf("Winner %s with %d steps", playerTwoName, playerTwoTotalSteps);
            System.out.println();
        } // If player 3's total steps equals the highest value they win
        else if (playerThreeTotalSteps == highestValue)
        {
            System.out.printf("Winner %s with %d steps", playerThreeName, playerThreeTotalSteps);
            System.out.println();
        } // If player 4's total steps equals the highest value they win
        else
        {
            System.out.printf("Winner %s with %d steps", playerFourName, playerFourTotalSteps);
            System.out.println();
        }

        // If player 1's total steps equals the second highest value they came second
        if (playerOneTotalSteps == secondHighestValue)
        {
            System.out.printf("Runner up %s with %d steps", playerOneName, playerOneTotalSteps);
            System.out.println();
        } // If player 2's total steps equals the second highest value they came second
        else if (playerTwoTotalSteps == secondHighestValue)
        {
            System.out.printf("Runner up %s with %d steps", playerTwoName, playerTwoTotalSteps);
            System.out.println();
        } // If player 3's total steps equals the second highest value they came second
        else if (playerThreeTotalSteps == secondHighestValue)
        {
            System.out.printf("Runner up %s with %d steps", playerThreeName, playerThreeTotalSteps);
            System.out.println();
        } // If player 4's total steps equals the second highest value they came second
        else
        {
            System.out.printf("Runner up %s with %d steps", playerFourName, playerFourTotalSteps);
            System.out.println();
        }

        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println("Leaderboard");

        System.out.println("-----------");

        // If player 1's total steps equals the highest value they came first
        if (playerOneTotalSteps == highestValue)
        {
            System.out.printf("1st %s %d steps", playerOneName, playerOneTotalSteps);
            System.out.println();
        } // If player 2's total steps equals the highest value they came first
        else if (playerTwoTotalSteps == highestValue)
        {
            System.out.printf("1st %s %d steps", playerTwoName, playerTwoTotalSteps);
            System.out.println();
        } // If player 3's total steps equals the highest value they came first
        else if (playerThreeTotalSteps == highestValue)
        {
            System.out.printf("1st %s %d steps", playerThreeName, playerThreeTotalSteps);
            System.out.println();
        } // If player 4's total steps equals the highest value they came first
        else
        {
            System.out.printf("1st %s %d steps", playerFourName, playerFourTotalSteps);
            System.out.println();
        }

        // If player 1's total steps equals the second highest value they came second
        if (playerOneTotalSteps == secondHighestValue)
        {
            System.out.printf("2nd %s %d steps", playerOneName, playerOneTotalSteps);
            System.out.println();
        } // If player 2's total steps equals the second highest value they came second
        else if (playerTwoTotalSteps == secondHighestValue)
        {
            System.out.printf("2nd %s %d steps", playerTwoName, playerTwoTotalSteps);
            System.out.println();
        } // If player 3's total steps equals the second highest value they came second
        else if (playerThreeTotalSteps == secondHighestValue)
        {
            System.out.printf("2nd %s %d steps", playerThreeName, playerThreeTotalSteps);
            System.out.println();
        } // If player 4's total steps equals the second highest value they came second
        else
        {
            System.out.printf("2nd %s %d steps", playerFourName, playerFourTotalSteps);
            System.out.println();
        }
        // If player 1's total steps equals the second lowest value they came third
        if (playerOneTotalSteps == secondLowestValue)
        {
            System.out.printf("3rd %s %d steps", playerOneName, playerOneTotalSteps);
            System.out.println();
        } // If player 2's total steps equals the second lowest value they came third
        else if (playerTwoTotalSteps == secondLowestValue)
        {
            System.out.printf("3rd %s %d steps", playerTwoName, playerTwoTotalSteps);
            System.out.println();
        } // If player 3's total steps equals the second lowest value they came third
        else if (playerThreeTotalSteps == secondLowestValue)
        {
            System.out.printf("3rd %s %d steps", playerThreeName, playerThreeTotalSteps);
            System.out.println();
        } // If player 4's total steps equals the second lowest value they came third
        else
        {
            System.out.printf("3rd %s %d steps", playerFourName, playerFourTotalSteps);
            System.out.println();
        }

        // If player 1's total steps equals the lowest value they came last
        if (playerOneTotalSteps == lowestValue)
        {
            System.out.printf("4th %s %d steps", playerOneName, playerOneTotalSteps);
            System.out.println();
        } // If player 2's total steps equals the lowest value they came last
        else if (playerTwoTotalSteps == lowestValue)
        {
            System.out.printf("4th %s %d steps", playerTwoName, playerTwoTotalSteps);
            System.out.println();
        } // If player 3's total steps equals the lowest value they came last
        else if (playerThreeTotalSteps == lowestValue)
        {
            System.out.printf("4th %s %d steps", playerThreeName, playerThreeTotalSteps);
        } // If player 4's total steps equals the lowest value they came last
        else
        {
            System.out.printf("4th %s %d steps", playerFourName, playerFourTotalSteps);
            System.out.println();
        }

        System.out.println("--------------------------------------------------------------------------------------------");

        // Declare an array that will contain the names of the two final players
        String[] finalContestantsNamesArray = new String[2];

        // Player 1 advances to the final in first position
        if (playerOneTotalSteps == highestValue)
        {
            System.out.printf("%s advances to the final", playerOneName);
            // Insert player 1's name into finalContestantsNamesArray[0] to signify that
            // they have reached the final
            finalContestantsNamesArray[0] = playerOneName;
            System.out.println();
        } // Player 2 advances to the final in first position
        else if (playerTwoTotalSteps == highestValue)
        {
            System.out.printf("%s advances to the final", playerTwoName);
            // Insert player 2's name into finalContestantsNamesArray[0] to signify that
            // they have reached the final
            finalContestantsNamesArray[0] = playerTwoName;
            System.out.println();
        } // Player 3 advances to the final in first position
        else if (playerThreeTotalSteps == highestValue)
        {
            System.out.printf("%s advances to the final", playerThreeName);
            // Insert player 3's name into finalContestantsNamesArray[0] to signify that
            // they have reached the final
            finalContestantsNamesArray[0] = playerThreeName;
            System.out.println();
        } // Player 4 advances to the final in first position
        else
        {
            System.out.printf("%s advances to the final", playerFourName);
            // Insert player 4's name into finalContestantsNamesArray[0] to signify that
            // they have reached the final
            finalContestantsNamesArray[0] = playerFourName;
            System.out.println();
        }

        // Player 1 advances to the final in second position
        if (playerOneTotalSteps == secondHighestValue)
        {
            System.out.printf("%s advances to the final", playerOneName);
            // Insert player 1's name into finalContestantsNamesArray[1] to signify that
            // they have reached the final
            finalContestantsNamesArray[1] = playerOneName;
            System.out.println();
        } // Player 2 advances to the final in second position
        else if (playerTwoTotalSteps == secondHighestValue)
        {
            System.out.printf("%s advances to the final", playerTwoName);
            // Insert player 2's name into finalContestantsNamesArray[1] to signify that
            // they have reached the final
            finalContestantsNamesArray[1] = playerTwoName;
            System.out.println();
        } // Player 3 advances to the final in second position
        else if (playerThreeTotalSteps == secondHighestValue)
        {
            System.out.printf("%s advances to the final", playerThreeName);
            // Insert player 3's name into finalContestantsNamesArray[1] to signify that
            // they have reached the final
            finalContestantsNamesArray[1] = playerThreeName;
            System.out.println();
        } // Player 4 advances to the final in second position
        else
        {
            System.out.printf("%s advances to the final", playerFourName);
            // Insert player 4's name into finalContestantsNamesArray[1] to signify that
            // they have reached the final
            finalContestantsNamesArray[1] = playerFourName;
            System.out.println();
        }

        // Checks the second lowest score
        if (playerOneTotalSteps == secondLowestValue)
        {
            // Print out a message to player 1 to state that they have not made 
            // it to round 2
            System.out.printf("Better luck next time %s", playerOneName);
            System.out.println();
        } // Checks the second lowest score
        else if (playerTwoTotalSteps == secondLowestValue)
        {
            // Print out a message to player 2 to state that they have not made 
            // it to round 2
            System.out.printf("Better luck next time %s", playerTwoName);
            System.out.println();
        } // Checks the second lowest score
        else if (playerThreeTotalSteps == secondLowestValue)
        {
            // Print out a message to player 3 to state that they have not made 
            // it to round 2
            System.out.printf("Better luck next time %s", playerThreeName);
            System.out.println();
        } // Checks the second lowest score
        else
        {
            // Print out a message to player 4 to state that they have not made 
            // it to round 2
            System.out.printf("Better luck next time %s", playerFourName);
            System.out.println();
        }
        // Checks the lowest score
        if (playerOneTotalSteps == lowestValue)
        {
            // Print out a message to player 1 to state that they have not made 
            // it to round 2
            System.out.printf("Better luck next time %s", playerOneName);
            System.out.println();
        } // Checks the lowest score
        else if (playerTwoTotalSteps == lowestValue)
        {
            // Print out a message to player 2 to state that they have not made 
            // it to round 2
            System.out.printf("Better luck next time %s", playerTwoName);
            System.out.println();
        } // Checks the lowest score
        else if (playerThreeTotalSteps == lowestValue)
        {
            // Print out a message to player 3 to state that they have not made 
            // it to round 2
            System.out.printf("Better luck next time %s", playerThreeName);
            System.out.println();
        } // Checks the lowest score
        else
        {
            // Print out a message to player 4 to state that they have not made 
            // it to round 2
            System.out.printf("Better luck next time %s", playerFourName);
            System.out.println();
        }

        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Round 2");
        System.out.println("-------");

        // Enhanced for loop that loops through the finalContestantsNamesArray
        // and welcomes the 2 finalists to round 2
        for (String finalContestants : finalContestantsNamesArray)
        {
            System.out.printf("Welcome to the final %s!\n", finalContestants);
        }

        System.out.println("--------------------------------------------------------------------------------------------");

        // Asks player 1 who came first in the first round to pick a number between 1 - 10
        System.out.printf("%s please choose a number between 1 - 10: ", finalContestantsNamesArray[0]);

        // Declare and initialize variable, set it to zero!
        int finalistPlayerOneNumber = 0;

        // Specify that the input must be of type int
        // If it is not the user will get the mesaage
        // "Please enter a valid number"
        while (keyboard.hasNextLine())
        {
            // If the input is of type int,
            if (keyboard.hasNextInt())
            {
                // store that number in this variable
                finalistPlayerOneNumber = keyboard.nextInt();
            } // Invalid input
            else
            {
                // Print out that the number entered is not valid
                // and get the user to try again!
                System.out.printf("%s please enter a valid number: ", finalContestantsNamesArray[0]);
                keyboard.next();
                // Continue until user inputs a valid number
                continue;
            }
            // Must be a number greater than zero!
            if (finalistPlayerOneNumber <= 0)
            {
                System.out.printf("%s please enter a number greater than 0: ", finalContestantsNamesArray[0]);
                continue;
            }
            // Must be below the number 11! e.g 10 is vaild, 11 is invalid!
            if (finalistPlayerOneNumber > 10)
            {
                System.out.printf("%s please enter a number less than 11: ", finalContestantsNamesArray[0]);
                continue;
            }
            // The user entered a valid value
            // We are now finished with the checks in the if / else statements
            // Now we can break out and move to the next section of the code!
            break;
        }
        System.out.println("User entered: " + finalistPlayerOneNumber);
        // Print out the number the player typed
        System.out.printf("%s your number is : %d\n", finalContestantsNamesArray[0], finalistPlayerOneNumber);

        System.out.println("--------------------------------------------------------------------------------------------");

        // Ask the next player to pick a number between 1 - 10
        System.out.printf("%s please choose a number between 1 - 10: ", finalContestantsNamesArray[1]);

        // Declare and initialize a variable for player 2
        int finalistPlayerTwoNumber = 0;

        // Specify that the input must be of type int
        // If it is not the user will get the mesaage
        // "Please enter a valid number"
        while (keyboard.hasNextLine())
        {
            // If the input is of type int,
            if (keyboard.hasNextInt())
            {
                // store that number in this variable
                finalistPlayerTwoNumber = keyboard.nextInt();
            } // Invalid input
            else
            {
                // Print out that the number entered is not valid
                // and get the user to try again!
                System.out.printf("%s please enter a valid number: ", finalContestantsNamesArray[1]);
                keyboard.next();
                // Continue until user inputs a valid number
                continue;
            }
            // Must be a number greater than zero!
            if (finalistPlayerTwoNumber <= 0)
            {
                System.out.printf("%s please enter a number greater than 0: ", finalContestantsNamesArray[1]);
                // Contine until they enter a number greater than zero
                continue;
            }
            // Must be below the number 11! e.g 10 is vaild, 11 is invalid!
            if (finalistPlayerTwoNumber > 10)
            {
                System.out.printf("%s please enter a number less than 11: ", finalContestantsNamesArray[1]);
                continue;
            }
            // The user entered a valid value.
            // We are now finished with the checks in the if / else statements
            // Now we can move to the next section of the code!
            break;
        }

        System.out.println("User entered: " + finalistPlayerTwoNumber);
        // Print out the number the player typed.
        System.out.printf("%s your number is : %d\n", finalContestantsNamesArray[1], finalistPlayerTwoNumber);

        System.out.println("--------------------------------------------------------------------------------------------");

        // Print out the finalists names and numbers!
        System.out.printf("Name: %s \t\tNumber: %d\nName: %s \t\tNumber: %d\n", finalContestantsNamesArray[0], finalistPlayerOneNumber,
                finalContestantsNamesArray[1], finalistPlayerTwoNumber);

        System.out.println("--------------------------------------------------------------------------------------------");

        // Tell the finalists that their numbers will now be randomised!
        System.out.println("Your turns will now be calculated randomly!");

        System.out.println("--------------------------------------------------------------------------------------------");

        // Set the value of the variable below back to true
        isSameValue = true;

        // Declare And initalize variable below, set the value to zero!
        int finalistPlayerOneTotalSteps = 0;

        // Declare And initalize variable below, set the value to zero!
        int finalistPlayerTwoTotalSteps = 0;

        // Keep running this code in the do {} until the variable
        // isSameValue changes to false!
        do
        {
            finalistPlayerOneTotalSteps = (finalistPlayerOneNumber + randomNumber.nextInt(finalistPlayerOneNumber) + 1) + playerOneName.length()
                    + randomNumber.nextInt(numberCalculation) + 1;

            finalistPlayerTwoTotalSteps = (finalistPlayerTwoNumber + randomNumber.nextInt(finalistPlayerTwoNumber) + 1) + playerOneName.length()
                    + randomNumber.nextInt(numberCalculation) + 1;

            // Check if the calculated numbers are the same
            if (finalistPlayerOneTotalSteps == finalistPlayerTwoTotalSteps)
            {
                // System.out.println("Re-calculating nuumbers");
                isSameValue = false;
                // Continue until the values are different!
                continue;
            }
            // The values are different move on with the code!
            break;
        } while (isSameValue = true);

        // Print out player 1's total steps representated as dots(...)
        for (int i = 0; i < finalistPlayerOneTotalSteps; i++)
        {
            System.out.print(".");
        }
        // Print out player 1's name directly after the dots
        System.out.println(finalContestantsNamesArray[0]);

        // Print out player 2's total steps representated as dots(...)
        for (int i = 0; i < finalistPlayerTwoTotalSteps; i++)
        {
            System.out.print(".");
        }
        // Print out player 2's name directly after the dots
        System.out.println(finalContestantsNamesArray[1]);

        System.out.println("--------------------------------------------------------------------------------------------");

        // Declare and initialize an array and fill it with the numbers player 1 and player 2 have got 
        // for total steps.  For clarification remember player 1 from round one who came in first position
        // got assigned to the first element in the finalContestantsNamesArray which equates to 
        // finalContestantsNamesArray[0] element in the array.  Player 2 who came in second position in round 
        // one got assigned to the second element in thefinalContestantsNamesArray which equates to 
        // finalContestantsNamesArray[1] element in the array.
        int[] finalistTotalStepsArray =
        {
            finalistPlayerOneTotalSteps, finalistPlayerTwoTotalSteps
        };

        // Sort the finalistTotalStepsArray array
        Arrays.sort(finalistTotalStepsArray);

        // Assign the highest value in the array to the variable below
        // With only two players up against eachother there is no need to assign the 
        // secondHighest value in the array as you can just print the opposite element 
        // in the array to state who won and who came in second position.
        highestValue = finalistTotalStepsArray[finalistTotalStepsArray.length - 1];

        // Checks if player 1's total steps is the highest value in the array
        if (finalistPlayerOneTotalSteps == highestValue)
        {
            // If it is print out that they won
            // Example: Winner Stephen with 1000 steps
            System.out.printf("Winner %s with %d steps", finalContestantsNamesArray[0], finalistPlayerOneTotalSteps);
            System.out.println();
            System.out.printf("Runner up %s with %d steps", finalContestantsNamesArray[1], finalistPlayerTwoTotalSteps);
            System.out.println();
        } // Check if player 2's total tries is the highest value in the array
        else
        {
            // If it is print out that they won
            // Example: Winner Calvin with 1000 steps
            System.out.printf("Winner %s with %d steps", finalContestantsNamesArray[1], finalistPlayerTwoTotalSteps);
            System.out.println();
            System.out.printf("Runner up %s with %d steps", finalContestantsNamesArray[0], finalistPlayerOneTotalSteps);
            System.out.println();
        }

        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println("Final Scoreboard");

        System.out.println("----------------");
        // If this condition is true,
        if (finalistPlayerOneTotalSteps == highestValue)
        {
            // print out these statements
            System.out.printf("1st %s %d steps\n", finalContestantsNamesArray[0], finalistPlayerOneTotalSteps);
            System.out.printf("2nd %s %d steps\n", finalContestantsNamesArray[1], finalistPlayerTwoTotalSteps);
        } // If the condition is false,
        else
        {
            // print out these statements
            System.out.printf("1st %s %d steps\n", finalContestantsNamesArray[1], finalistPlayerTwoTotalSteps);
            System.out.printf("2nd %s %d steps\n", finalContestantsNamesArray[0], finalistPlayerOneTotalSteps);
        }

        System.out.println("--------------------------------------------------------------------------------------------");

        // Check if player 1's score is greater than player 2's score
        if (finalistPlayerOneTotalSteps > finalistPlayerTwoTotalSteps)
        {
            // Print out that player 1's score is greater than player 2's score and declare them the winner!
            System.out.printf("%s won with a final score of: %d congratulations", finalContestantsNamesArray[0],
                    finalistPlayerOneTotalSteps);
            System.out.println();
        } // Check if player 2's score is greater than player 1's score
        else
        {
            // Print out that player 2's score is greater than player 1's score and declare them the winner!
            System.out.printf("%s won with a final score of: %d congratulations", finalContestantsNamesArray[1],
                    finalistPlayerTwoTotalSteps);
            System.out.println();
        }

        System.out.println("--------------------------------------------------------------------------------------------");
    }
}
