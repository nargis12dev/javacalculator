package javalab8;

import java.util.Scanner;
import java.util.Random;

public class randomnum {
public static void main(String[]args) {
	System.out.println("random numbers from 1-10:");
	Scanner scanner=new Scanner(System.in);
	int randomNumber=(int)(Math.random()*10+1);
	  System.out.println("A random number has been generated. Try to guess it!");
	int userInput = 0; 
    int attempts = 0;
	do {
		System.out.println("enter number from 1-10:");
		userInput = scanner.nextInt();
		attempts++;
		if (userInput == randomNumber) {
            System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
            break;
		 } else if (userInput < randomNumber) {
             System.out.println("Too low! Try again.");
         } else {
             System.out.println("Too high! Try again.");
	}
	}while(attempts<10);
	if (attempts == 10 && userInput != randomNumber) {
        System.out.println("Sorry, you've used all 10 attempts. The correct number was " + randomNumber + ".");
     }
   }
}
