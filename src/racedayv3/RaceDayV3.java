package racedayv3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Stephen Gregan
 */
public class RaceDayV3
{

    public static void main(String[] args)
    {
        // To use Scanner class import java.util.Scanner
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
        boolean isSameValue = true;

        // Decalre and initialize variable below, set value to an empty string
        String playerTwoName = "";

        // Do execute all code within the {} curly braces while isSameValue = true 
        do
        {
            // Player 2 name choice
            System.out.println("Player Two choose name below");
            System.out.print("Enter name: ");
            // Store user input in variable for player 2
            playerTwoName = keyboard.nextLine();

            // Check if player 2 enter the same name as player 1
            if (playerTwoName.equals(playerOneName))
            {
                System.out.println("You have chosen a name that has already been assigned to someone else");
                // Give him alternate name suggestions
                System.out.printf("Suggestions for alternate names\n%s, %s, %s, %s\n", playerTwoName.concat("123"),
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
                System.out.println("You have chosen a name that has already been assigned to someone else");
                // Give user alternate suggestions
                System.out.printf("Suggestions for alternate names\n%s, %s, %s, %s\n", playerThreeName.concat("123"),
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
                System.out.println("You have chosen a name that has already been assigned to someone else");
                // Give user alternate suggestions
                System.out.printf("Suggestions for alternate names\n%s, %s, %s, %s\n", playerFourName.concat("123"),
                        playerFourName.concat("25"), playerFourName.concat("99"), playerFourName.concat("55"));
                isSameValue = false;
                // Continue untill user enters a valid name
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

        // Declared and initialize the variable, set it to zero 
        int playerOneNumberChoice = 0;

        // specify that the input must be of type int
        while (keyboard.hasNextLine())
        {
            // If the input is of type int,
            if (keyboard.hasNextInt())
            {
                // store that number in this variable
                playerOneNumberChoice = keyboard.nextInt();
                // Invlid entry
            } else
            {
                // Print out that the number entered is not valid
                // and get the user to try again!
                System.out.println("Please enter a valid number");
                keyboard.next();
                // Continue until they input a valid number
                continue;
            }

            // Must be a number greater than zero!
            if (playerOneNumberChoice < 0)
            {
                System.out.println("Please enter a number greater than 0");
                // Continue until user inputs a valid number
                continue;
            }

            // Must be below the number 11! e.g 10 is vaild, 11 is invalid!
            if (playerOneNumberChoice > 10)
            {
                System.out.println("Please enter a number below 10");
                // Continue until user inputs a valid number
                continue;
            }

            // The user entered a valid value.
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

        // Input from user must be of type int
        while (keyboard.hasNextLine())
        {
            // If input is of type int,
            if (keyboard.hasNextInt())
            {
                // store that number in this variable
                playerTwoNumberChoice = keyboard.nextInt();
                // Invlid entry
            } else
            {
                // Print out that the number entered is not valid
                // and get the user to try again!
                System.out.println("Please enter a valid number");
                keyboard.next();
                // Continue until user inputs a valid number
                continue;
            }

            // Number must be greater than zero!
            if (playerTwoNumberChoice < 0)
            {
                System.out.println("Please enter a number greater than 0");
                // Continue until they input a valid number
                continue;
            }
            // Number must be less than or equal to 10
            if (playerTwoNumberChoice > 10)
            {
                System.out.println("Please enter a number below 10");
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

        // Decalre and initialize variable, set it to zero!
        int playerThreeNumberChoice = 0;

        // Input from user must be of type int
        while (keyboard.hasNextLine())
        {
            // If input is of type int,
            if (keyboard.hasNextInt())
            {
                // store the value in this variable
                playerThreeNumberChoice = keyboard.nextInt();
                // invalid input
            } else
            {
                // Print out that the number entered is not valid
                // and get the user to try again!
                System.out.println("Please enter a valid number");
                keyboard.next();
                // Continue until they input a valid number
                continue;
            }

            // Number must be greater than zero!
            if (playerThreeNumberChoice < 0)
            {
                System.out.println("Please enter a number greater than 0");
                // Continue until user inputs a value number
                continue;
            }

            // Number must be less than or equal to 10
            if (playerThreeNumberChoice > 10)
            {
                System.out.println("Please enter a number below 10");
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

        // Decalre and initialize variable, set it to zero
        int playerFourNumberChoice = 0;

        // Input from user must be of type int
        while (keyboard.hasNextLine())
        {
            // If input is of type int,
            if (keyboard.hasNextInt())
            {
                // store the value in this variable
                playerFourNumberChoice = keyboard.nextInt();
                // Invalid input
            } else
            {
                // Print out that the number entered is not valid
                // and get the user to try again!
                System.out.println("Please enter a valid number");
                keyboard.next();
                // Continue until user inputs a valid number
                continue;
            }

            // Number must be greater than zero!
            if (playerFourNumberChoice < 0)
            {
                System.out.println("Please enter a number greater than 0");
                // Continue until user inputs a valid number
                continue;
            }

            // Number must be less than or equal to 10
            if (playerFourNumberChoice > 10)
            {
                System.out.println("Please enter a number below 10");
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
        System.out.printf("Name: %s\tNumber: %d\nName: %s\tNumber: %d\nName: %s\tNumber: %d\nName: "
                + "%s\tNumber: %d\n", playerOneName, playerOneNumberChoice, playerTwoName, playerTwoNumberChoice,
                playerThreeName, playerThreeNumberChoice, playerFourName, playerFourNumberChoice);

        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println("Your turns will now be calculated randomly!");

        System.out.println("--------------------------------------------------------------------------------------------");

        // Set the value back to true
        isSameValue = true;

        // Random class: import java.util.Random;
        Random randomNumber = new Random();

        // Decalare and initalize variable, set it to one!
        int min = 1;

        // Decalare and initalize variable, set it to zero!
        int playerOneTotalTries = 0;

        // Decalare and initalize variable, set it to zero!
        int playerTwoTotalTries = 0;

        // Decalare and initalize variable, set it to zero!
        int playerThreeTotalTries = 0;

        // Decalare and initalize variable, set it to zero!
        int playerFourTotalTries = 0;

        // Keep running this code in the do {} until the variable
        // isSameValue changes to false!
        do
        {
            playerOneTotalTries = ThreadLocalRandom.current().nextInt(min, playerOneNumberChoice + 1) + playerFourName.length()
                    + randomNumber.nextInt(40) + 1;

            playerTwoTotalTries = ThreadLocalRandom.current().nextInt(min, playerTwoNumberChoice + 1) + playerThreeName.length()
                    + randomNumber.nextInt(40) + 1;

            playerThreeTotalTries = ThreadLocalRandom.current().nextInt(min, playerThreeNumberChoice + 1) + playerTwoName.length()
                    + randomNumber.nextInt(40) + 1;

            playerFourTotalTries = ThreadLocalRandom.current().nextInt(min, playerFourNumberChoice + 1) + playerOneName.length()
                    + randomNumber.nextInt(40) + 1;

            // Messy but effective code could be cleaned up!  Checks if any of the values are the same
            // Used for safe guarding against duplicate values!
            if (playerOneTotalTries == playerTwoTotalTries || playerOneTotalTries == playerThreeTotalTries
                    || playerOneTotalTries == playerFourTotalTries || playerTwoTotalTries == playerOneTotalTries
                    || playerTwoTotalTries == playerThreeTotalTries || playerTwoTotalTries == playerFourTotalTries
                    || playerThreeTotalTries == playerOneTotalTries || playerThreeTotalTries == playerTwoTotalTries
                    || playerThreeTotalTries == playerFourTotalTries || playerFourTotalTries == playerOneTotalTries
                    || playerFourTotalTries == playerTwoTotalTries || playerFourTotalTries == playerThreeTotalTries)
            {
                // For testing purposes.  Please dont show this to the users!
                System.out.println("Re-calculating numbers!");
                // Change the value to false!
                isSameValue = false;
                // Continue until there are no matches 
                continue;
            }
            // All numbers are different move on with the code
            break;
        } while (isSameValue = true);

        // Print out player 1's total tries represented as dots(...)
        for (int i = 0; i < playerOneTotalTries; i++)
        {
            System.out.print(".");
        }
        // Print player 1's name directly after the dots
        System.out.print(playerOneName + "\n");

        // Print out player 2's total tries represented as dots(...)
        for (int i = 0; i < playerTwoTotalTries; i++)
        {
            System.out.print(".");
        }
        // Print player 2's name directly after dots(...)
        System.out.print(playerTwoName + "\n");

        // Print out player 3's total tries represented as dots(...)
        for (int i = 0; i < playerThreeTotalTries; i++)
        {
            System.out.print(".");
        }
        // Print out player 3's name directly after dots(...)
        System.out.print(playerThreeName + "\n");

        // Print out player 4's total tries represented as dots(...)
        for (int i = 0; i < playerFourTotalTries; i++)
        {
            System.out.print(".");
        }
        // Print out player 3's name directly after dots(...)
        System.out.print(playerFourName + "\n");

        System.out.println("--------------------------------------------------------------------------------------------");

        // Decalre and initialize array with all the players total tries
        // You could write the code like this : int[] playersTotalTriesArray = new int[4];
        //                                      playersTotalTriesArray[0] = playerOneTotalTries etc
        // This way is better when you have the the information you want to store in the array now!
        int[] playersTotalTriesArray =
        {
            playerOneTotalTries, playerTwoTotalTries, playerThreeTotalTries, playerFourTotalTries
        };

        // Sort the array
        Arrays.sort(playersTotalTriesArray);

        // Declare variable and store the highest value in the variable below
        int highestValue = playersTotalTriesArray[playersTotalTriesArray.length - 1];

        // Declare variable and store the second highest value in the variable below
        int secondHighestValue = playersTotalTriesArray[playersTotalTriesArray.length - 2];

        // Declare variable and store the second lowest value in the variable below
        int secondLowestValue = playersTotalTriesArray[playersTotalTriesArray.length - 3];

        // Declare variable and store the lowest value in the varible below
        int lowestValue = playersTotalTriesArray[playersTotalTriesArray.length - 4];

        // If player 1's total tries equals the highest value they win
        if (playerOneTotalTries == highestValue)
        {
            System.out.printf("Winner %s with %d steps", playerOneName, playerOneTotalTries);
            System.out.println();
        } // If player 2's total tries equals the highest value they win
        else if (playerTwoTotalTries == highestValue)
        {
            System.out.printf("Winner %s with %d steps", playerTwoName, playerTwoTotalTries);
            System.out.println();
        } // If player 3's total tries equals the highest value they win
        else if (playerThreeTotalTries == highestValue)
        {
            System.out.printf("Winner %s with %d steps", playerThreeName, playerThreeTotalTries);
            System.out.println();
        } // If player 4's total tries equals the highest value they win
        else
        {
            System.out.printf("Winner %s with %d steps", playerFourName, playerFourTotalTries);
            System.out.println();
        }

        // If player 1's total tries equals the second highest value they came second
        if (playerOneTotalTries == secondHighestValue)
        {
            System.out.printf("Runner up %s with %d steps", playerOneName, playerOneTotalTries);
            System.out.println();
        } // If player 2's total tries equals the second highest value they came second
        else if (playerTwoTotalTries == secondHighestValue)
        {
            System.out.printf("Runner up %s with %d steps", playerTwoName, playerTwoTotalTries);
            System.out.println();
        } // If player 3's total tries equals the second highest value they came second
        else if (playerThreeTotalTries == secondHighestValue)
        {
            System.out.printf("Runner up %s with %d steps", playerThreeName, playerThreeTotalTries);
            System.out.println();
        } // If player 4's total tries equals the second highest value they came second
        else
        {
            System.out.printf("Runner up %s with %d steps", playerFourName, playerFourTotalTries);
            System.out.println();
        }

        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println("Leaderboard");

        System.out.println("-----------");

        // If player 1's total tries equals the highest value they came first
        if (playerOneTotalTries == highestValue)
        {
            System.out.printf("1st %s %d steps", playerOneName, playerOneTotalTries);
            System.out.println();
        } // If player 2's total tries equals the highest value they came first
        else if (playerTwoTotalTries == highestValue)
        {
            System.out.printf("1st %s %d steps", playerTwoName, playerTwoTotalTries);
            System.out.println();
        } // If player 3's total tries equals the highest value they came first
        else if (playerThreeTotalTries == highestValue)
        {
            System.out.printf("1st %s %d steps", playerThreeName, playerThreeTotalTries);
            System.out.println();
        } // If player 4's total tries equals the highest value they came first
        else
        {
            System.out.printf("1st %s %d steps", playerFourName, playerFourTotalTries);
            System.out.println();
        }

        // If player 1's total tries equals the second highest value they came second
        if (playerOneTotalTries == secondHighestValue)
        {
            System.out.printf("2nd %s %d steps", playerOneName, playerOneTotalTries);
            System.out.println();
        } // If player 2's total tries equals the second highest value they came second
        else if (playerTwoTotalTries == secondHighestValue)
        {
            System.out.printf("2nd %s %d steps", playerTwoName, playerTwoTotalTries);
            System.out.println();
        } // If player 3's total tries equals the second highest value they came second
        else if (playerThreeTotalTries == secondHighestValue)
        {
            System.out.printf("2nd %s %d steps", playerThreeName, playerThreeTotalTries);
            System.out.println();
        } // If player 4's total tries equals the second highest value they came second
        else
        {
            System.out.printf("2nd %s %d steps", playerFourName, playerFourTotalTries);
            System.out.println();
        }
        // If player 1's total tries equals the second lowest value they came third
        if (playerOneTotalTries == secondLowestValue)
        {
            System.out.printf("3rd %s %d steps", playerOneName, playerOneTotalTries);
            System.out.println();
        } // If player 2's total tries equals the second lowest value they came third
        else if (playerTwoTotalTries == secondLowestValue)
        {
            System.out.printf("3rd %s %d steps", playerTwoName, playerTwoTotalTries);
            System.out.println();
        } // If player 3's total tries equals the second lowest value they came third
        else if (playerThreeTotalTries == secondLowestValue)
        {
            System.out.printf("3rd %s %d steps", playerThreeName, playerThreeTotalTries);
            System.out.println();
        } // If player 4's total tries equals the second lowest value they came third
        else
        {
            System.out.printf("3rd %s %d steps", playerFourName, playerFourTotalTries);
            System.out.println();
        }

        // If player 1's total tries equals the lowest value they came last
        if (playerOneTotalTries == lowestValue)
        {
            System.out.printf("4th %s %d steps", playerOneName, playerOneTotalTries);
            System.out.println();
        } // If player 2's total tries equals the lowest value they came last
        else if (playerTwoTotalTries == lowestValue)
        {
            System.out.printf("4th %s %d steps", playerTwoName, playerTwoTotalTries);
            System.out.println();
        } // If player 3's total tries equals the lowest value they came last
        else if (playerThreeTotalTries == lowestValue)
        {
            System.out.printf("4th %s %d steps", playerThreeName, playerThreeTotalTries);
        } // If player 4's total tries equals the lowest value they came last
        else
        {
            System.out.printf("4th %s %d steps", playerFourName, playerFourTotalTries);
            System.out.println();
        }

        System.out.println("--------------------------------------------------------------------------------------------");

        // Declare an array that will contain the names of the two final players
        String[] finalContestantsArray = new String[2];

        // Player 1 advances to the final in first position
        if (playerOneTotalTries == highestValue)
        {
            System.out.printf("%s advances to the final", playerOneName);
            // Insert player 1's name into finalContestantsArray[0] to signify that
            // they have reached the final
            finalContestantsArray[0] = playerOneName;
            System.out.println();
        } // Player 2 advances to the final in first position
        else if (playerTwoTotalTries == highestValue)
        {
            System.out.printf("%s advances to the final", playerTwoName);
            // Insert player 2's name into finalContestantsArray[0] to signify that
            // they have reached the final
            finalContestantsArray[0] = playerTwoName;
            System.out.println();
        } // Player 3 advances to the final in first position
        else if (playerThreeTotalTries == highestValue)
        {
            System.out.printf("%s advances to the final", playerThreeName);
            // Insert player 3's name into finalContestantsArray[0] to signify that
            // they have reached the final
            finalContestantsArray[0] = playerThreeName;
            System.out.println();
        } // Player 4 advances to the final in first position
        else
        {
            System.out.printf("%s advances to the final", playerFourName);
            // Insert player 4's name into finalContestantsArray[0] to signify that
            // they have reached the final
            finalContestantsArray[0] = playerFourName;
            System.out.println();
        }

        // Player 1 advances to the final in second position
        if (playerOneTotalTries == secondHighestValue)
        {
            System.out.printf("%s advances to the final", playerOneName);
            // Insert player 1's name into finalContestantsArray[1] to signify that
            // they have reached the final
            finalContestantsArray[1] = playerOneName;
            System.out.println();
        } // Player 2 advances to the final in second position
        else if (playerTwoTotalTries == secondHighestValue)
        {
            System.out.printf("%s advances to the final", playerTwoName);
            // Insert player 2's name into finalContestantsArray[1] to signify that
            // they have reached the final
            finalContestantsArray[1] = playerTwoName;
            System.out.println();
        } // Player 3 advances to the final in second position
        else if (playerThreeTotalTries == secondHighestValue)
        {
            System.out.printf("%s advances to the final", playerThreeName);
            // Insert player 3's name into finalContestantsArray[1] to signify that
            // they have reached the final
            finalContestantsArray[1] = playerThreeName;
            System.out.println();
        } // Player 4 advances to the final in second position
        else
        {
            System.out.printf("%s advances to the final", playerFourName);
            // Insert player 4's name into finalContestantsArray[1] to signify that
            // they have reached the final
            finalContestantsArray[1] = playerFourName;
            System.out.println();
        }

        // Checks the second lowest score
        if (playerOneTotalTries == secondLowestValue)
        {
            // Print out a message to player 1 to state that they have not made 
            // it to round 2
            System.out.printf("Better luck next time %s.", playerOneName);
            System.out.println();
        } // Checks the second lowest score
        else if (playerTwoTotalTries == secondLowestValue)
        {
            // Print out a message to player 2 to state that they have not made 
            // it to round 2
            System.out.printf("Better luck next time %s.", playerTwoName);
            System.out.println();
        } // Checks the second lowest score
        else if (playerThreeTotalTries == secondLowestValue)
        {
            // Print out a message to player 3 to state that they have not made 
            // it to round 2
            System.out.printf("Better luck next time %s.", playerThreeName);
            System.out.println();
        } // Checks the second lowest score
        else
        {
            // Print out a message to player 4 to state that they have not made 
            // it to round 2
            System.out.printf("Better luck next time %s.", playerFourName);
            System.out.println();
        }
        // Checks the lowest score
        if (playerOneTotalTries == lowestValue)
        {
            // Print out a message to player 4 to state that they have not made 
            // it to round 2
            System.out.printf("Better luck next time %s.", playerOneName);
            System.out.println();
        } // Checks the lowest score
        else if (playerTwoTotalTries == lowestValue)
        {
            // Print out a message to player 4 to state that they have not made 
            // it to round 2
            System.out.printf("Better luck next time %s.", playerTwoName);
            System.out.println();
        } // Checks the lowest score
        else if (playerThreeTotalTries == lowestValue)
        {
            // Print out a message to player 4 to state that they have not made 
            // it to round 2
            System.out.printf("Better luck next time %s.", playerThreeName);
            System.out.println();
        } // Checks the lowest score
        else
        {
            // Print out a message to player 4 to state that they have not made 
            // it to round 2
            System.out.printf("Better luck next time %s.", playerFourName);
            System.out.println();
        }

        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Round 2");
        System.out.println("-------");

        // Enhanced for loop that loops through the finalContestantsArray
        // and welcomes the 2 finalists to round 2
        for (String finalContestants : finalContestantsArray)
        {
            System.out.printf("Welcome to the final %s!\n", finalContestants);
        }

        System.out.println("--------------------------------------------------------------------------------------------");

        // Asks player 1 who came first in the first round to pick a number between 1 - 10
        System.out.printf("%s please choose a number between 1 - 10: ", finalContestantsArray[0]);

        // Decalre and initialize variable, set it to zero!
        int finalistPlayer1Number = 0;

        // Specifies that the input must be of type int
        while (keyboard.hasNextLine())
        {
            // If the input is of type int,
            if (keyboard.hasNextInt())
            {
                // Set the value of variable below to the number the player
                // entered
                finalistPlayer1Number = keyboard.nextInt();
            } else
            {
                // Tell the player to enter a valid number
                System.out.println("Please enter a valid number");
                keyboard.next();
                // Continue until they do so
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
            // The user entered a valid value
            // We are now finished with the checks in the if / else statements
            // Now we can break out and move to the next section of the code!
            break;
        }
        System.out.println("User entered: " + finalistPlayer1Number);
        // Print out the number the player typed.
        System.out.printf("%s your number is : %d\n", finalContestantsArray[0], finalistPlayer1Number);

        System.out.println("--------------------------------------------------------------------------------------------");

        // Ask the next player to pick a number between 1 - 10
        System.out.printf("%s please choose a number between 1 - 10: ", finalContestantsArray[1]);

        // Declare and initialize a variable for player 2
        int finalistPlayer2Number = 0;

        // Specifies that the input must be of type int
        while (keyboard.hasNextLine())
        {
            // If the input is of type int,
            if (keyboard.hasNextInt())
            {
                // Set the value of variable below to the number the player
                // entered
                finalistPlayer2Number = keyboard.nextInt();
            } else
            {
                // Tell the player to enter a valid number
                System.out.println("Please enter a valid number");
                keyboard.next();
                // Continue until they do so
                continue;
            }
            // Must be a number greater than zero!
            if (finalistPlayer2Number < 0)
            {
                System.out.println("Please enter a number greater than 0");
                // Contine until they enter a number greater than zero
                continue;
            }
            // Must be below the number 10! e.g 10 is vaild, 11 is invalid!
            if (finalistPlayer2Number > 10)
            {
                System.out.println("Please enter a number below 10");
                continue;
            }
            // The user entered a valid value.
            // We are now finished with the checks in the if / else statements
            // Now we can move to the next section of the code!
            break;
        }

        System.out.println("User entered: " + finalistPlayer2Number);
        // Print out the number the player typed.
        System.out.printf("%s your number is : %d\n", finalContestantsArray[1], finalistPlayer2Number);

        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println("Your turns will now be calculated randomly!");

        System.out.println("--------------------------------------------------------------------------------------------");

        // Set the value of the variable below back to true
        isSameValue = true;

        // Declare And initalize variable below, set the value to zero!
        int finalistPlayerOneTotalTries = 0;

        // Declare And initalize variable below, set the value to zero!
        int finalistPlayerTwoTotalTries = 0;

        // Keep running this code in the do {} until the variable
        // isSameValue changes to false!
        do
        {
            finalistPlayerOneTotalTries = ThreadLocalRandom.current().nextInt(min, playerOneNumberChoice + 1) + playerFourName.length()
                    + randomNumber.nextInt(40) + 1;

            finalistPlayerTwoTotalTries = ThreadLocalRandom.current().nextInt(min, playerOneNumberChoice + 1) + playerFourName.length()
                    + randomNumber.nextInt(40) + 1;

            // Check if the calculated numbers are the same
            if (finalistPlayerOneTotalTries == finalistPlayerTwoTotalTries)
            {
                System.out.println("Re-calculating nuumbers");
                isSameValue = false;
                // Continue until the values are different!
                continue;
            }
            // The values are different move on with the code!
            break;
        } while (isSameValue = true);

        // Print out player 1's total tries representated as dots(...)
        for (int i = 0; i < finalistPlayerOneTotalTries; i++)
        {
            System.out.print(".");
        }
        // Print out player 1's name directly after the dots
        System.out.println(finalContestantsArray[0]);

        // Print out player 1's total tries representated as dots(...)
        for (int i = 0; i < finalistPlayerTwoTotalTries; i++)
        {
            System.out.print(".");
        }
        // Print out player 2's name directly after the dots
        System.out.println(finalContestantsArray[1]);

        System.out.println("--------------------------------------------------------------------------------------------");

        // Decalre and initialize an array and fill it with the numbers player 1 and player 2 have got 
        // for total tries.  For clarification remember player 1 from round one who came in first position
        // got assigned to the first element in the finalContestantsArray which equates to 
        // finalContestantsArray[0] element in the array.  Player 2 who came in secomd position in round 
        // one got assigned to the second element in thefinalContestantsArray which equates to 
        // finalContestantsArray[1] element in the array.
        int[] finalistTotalTriesArray =
        {
            finalistPlayerOneTotalTries, finalistPlayerTwoTotalTries
        };

        // Check if player 1's score is greater than player 2's score
        if (finalistPlayerOneTotalTries > finalistPlayerTwoTotalTries)
        {
            // Print out that player 1's score is greater than player 2's score and declare them the winner!
            System.out.printf("%s won with a final score of : %d congradulations", finalContestantsArray[0],
                    finalistPlayerOneTotalTries);
        } // Check if player 2's score is greater than player 1's score
        else
        {
            // Print out that player 2's score is greater than player 1's score and decalre them the winner!
            System.out.printf("%s won with a final score of : %d congradulations", finalContestantsArray[1],
                    finalistPlayerTwoTotalTries);
            System.out.println();
        }

        // Sort the finalistTotalTriesArray array
        Arrays.sort(finalistTotalTriesArray);

        // Assign the highest value to the variable below
        highestValue = finalistTotalTriesArray[finalistTotalTriesArray.length - 1];

        // Assign the second highest value to the variable 'secondHighestValue'
        // This code is now redundant as we dont need it!  With only two players 
        // up against eachother there is no need to assign the secondHighest value
        // in the array as you can just print the oposite element in the array to 
        // state who won and who came in second position.
        // secondHighestValue = finalistNumbersArray[finalistNumbersArray.length - 2];
        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println("Final Scoreboard");

        System.out.println("----------------");

        // Checks if player 1's total tries is the highest value in the array
        if (finalistPlayerOneTotalTries == highestValue)
        {
            // If it is print out that they won
            // Example: Winner Stephen with 1000 steps
            System.out.printf("Winner %s with %d steps", finalContestantsArray[0], finalistPlayerOneTotalTries);
            System.out.println();
            System.out.printf("Runner up %s with %d steps", finalContestantsArray[1], finalistPlayerTwoTotalTries);
            System.out.println();
        } // Check if player 2's total tries is the highest value in the array
        else
        {
            // If it is print out that they won
            // Example: Winner Stephen with 1000 steps
            System.out.printf("Winner %s with %d steps", finalContestantsArray[1], finalistPlayerTwoTotalTries);
            System.out.println();
            System.out.printf("Runner up %s with %d steps", finalContestantsArray[0], finalistPlayerOneTotalTries);
            System.out.println();
        }

        System.out.println("--------------------------------------------------------------------------------------------");
    }
}
