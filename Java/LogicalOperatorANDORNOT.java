import java.util.Scanner;

public class LogicalOperatorANDORNOT {

	public static void main(String[] args) {
		
		// Logical Operators = used to connect two or more expressions
		//
		// && (AND) => both condition must be true
		// || (OR)	=> either condition must be true
		// !  (NOT) => reverses boolean value of condition
		
		// EXAMPLE 1
		
		int temp = 25;
		
		if(temp > 30) {
			System.out.println("It's hot outside");
		} else if(temp >= 20 &&temp <= 30) {
			System.out.println("It's warm outside");
		} else {
			System.out.println("It's cold outside");
		}
		
		// EXAMPLE 2
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You're playing a game!");
		System.out.println("Press q or Q to quit");
		String response = scanner.next();
		
		if(response.equals("q") || response.equals("Q")) {
			System.out.println("You quit the game");
		} else {
			System.out.println("You're still playing the game *pew pew*");
		}
		
	}
}