import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * 
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner2 {

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args) {
		Magpie2 maggie = new Magpie2();

		System.out.println(maggie.getGreeting());
		Scanner in = new Scanner(System.in);
		String statement = in.nextLine();

		while (!statement.equals("Bye")) {
			System.out.println(maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

	// When there is more than one keyword in an entered string, it prioritizes the
	// keyword that is stated first in the conditionals of keyword responses.

	// Question 1. The problem with statements with keywords inside another word, is that
	// because we set the conditional to recognize the keyword anywhere in the string,
	// it will respond with the response that the keyword calls for. 
}
