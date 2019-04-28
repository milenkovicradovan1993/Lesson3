package optional;

import java.util.Scanner;

public class BirthdayReminder {

	public static void main(String[] args) {
		
		// 1. correct the birthdays for your family below
		String momsBirthday = "May 28th";
		String dadsBirthday = "May 23rd";
		String myBirthday = "January 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		Scanner input = new Scanner (System.in);
		System.out.println("Which birthday do you want to know family");
		String answer = input.nextLine();
		if (answer.contains("mom")) {
			System.out.println(answer + " - her birthday is: ");
			System.out.println(momsBirthday);
		} else if (answer.contains("dad")) {
			System.out.println(answer + " - his birthday is: ");
			System.out.println(dadsBirthday);
		} else if (answer.contains("Radovan")) {
			System.out.println(answer + " - your birthday is: ");
			System.out.println(myBirthday);
		} else {
			System.out.println("Sorry, i don't remember that person's birthday!");
		}
	
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	}
}
