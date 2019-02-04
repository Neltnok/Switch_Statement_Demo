//Create a program that has a variable called number that holds an integer between one and 10 inclusive.
//        Get the number from the user.
//        Use a switch statement to display the name for that number in a language other than English.

//        Example: the user enters 2
//        The screen should display: The number 2 is deux in French.

// create an integer variable initialized to 5
// create an object of type scanner to read the users input
// create a loop that does the following
// prompt the user to enter an integer between 1 and 10
// parse the user input and translate to the number in Japanese
// repeat until the user enters a zero to exit the program

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	// create the integer variable and initialize it to 5
    int inputNumber = 5;

    // create an object of type scanner
    Scanner scanner = new Scanner(System.in);

    // create a loop to parse the user entered numbers and terminate if user enters 0
        while(inputNumber != 0){
          // prompt the user to enter a number between 1 and 10
            System.out.println("Enter an integer between 1 and 10 or 0 to exit");
            // get the input from the user
            inputNumber = scanner.nextInt();

            // parse the user input and translate to the number in Japanese
            switch(inputNumber){
                case 1:
                    System.out.println("The number 1 is Ich in Japanese");
                    break;
                case 2:
                    System.out.println("The number 2 is Ni in Japanese");
                    break;
                case 3:
                    System.out.println("The number 3 is San in Japanese");
                    break;
                case 4:
                    System.out.println("The number 4 is Shi in Japanese");
                    break;
                case 5:
                    System.out.println("The number 5 is Go in Japanese");
                    break;
                case 6:
                    System.out.println("The number 6 is Roke in Japanese");
                    break;
                case 7:
                    System.out.println("The number 7 is Shich in Japanese");
                    break;
                case 8:
                    System.out.println("The number 8 is Hach in Japanese");
                    break;
                case 9:
                    System.out.println("The number 9 is Ku in Japanese");
                    break;
                case 10:
                    System.out.println("The number 10 is Ju in Japanese");
                    break;
                default:
                    System.out.println("You did not enter an integer number between 1 and 10");

            }

        }
        System.out.println("Good Bye");
    }
}
