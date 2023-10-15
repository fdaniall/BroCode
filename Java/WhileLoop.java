import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		// While loop = executes a block of code as a it's condition remains true
		
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
		// WHILE
		
		while(name.isBlank()) {
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}
		
		// DO WHILE
		
		do {
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		} while (name.isBlank());
		
		System.out.println("Hello " +name);
	}
}