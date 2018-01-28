import java.util.*;
import java.io.*;

public class Game{
	public static void main(String [] args){
		boolean hasWon = false;
		int random = (int) (Math.random() * 20) + 1;
		System.out.println("The random number is " + random);
		System.out.println("Try to guess a random number from 1 to 20: ");
		
		Scanner scanner = new Scanner(System.in);

		for (int i=10; i>0; i--){
			System.out.println("Left " + i + " guess(es)");
			int rand = scanner.nextInt();
			if (rand > random){
				System.out.println("Your number - " + rand + " is greater than random number. Try again.");
			}else if (random>rand){
				System.out.println("Your number - " + rand + " is less than random number. Try again.");
			}else {
				hasWon=true;
				break;
			} 
		}
		if (hasWon){
			System.out.println("You won!");
		} else{
			System.out.println("You lose. The number was - " + random);
		}

	}
}