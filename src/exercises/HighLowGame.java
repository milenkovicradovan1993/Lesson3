package exercises;

import java.util.Random;
import java.util.Scanner;

public class HighLowGame {
	
	public static void main(String[] args) {
		int guess, answer;
		int count = 5;
		Random generator = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("What number do you guess between 0 and 20");
	
		do {
			guess = sc.nextInt();
			answer=generator.nextInt(20);
			if (guess==answer) {
				System.out.println("That is correct");
				
				break;
			} else if (guess<answer) {
				System.out.println("Higher number");
				System.out.println("Correct answer: " + answer);  
			} else if (guess>answer){
				System.out.println(" Lower number");
				System.out.println("Correct answer: " + answer);
			}
			count--;
			
		} while (count!=0);
		System.out.println("Better luck next time");
	
		
	}


}
