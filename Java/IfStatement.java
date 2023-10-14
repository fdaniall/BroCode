import java.util.*;

public class IfStatement {

	public static void main(String[] args) {

		// if statement = Menjalankan sebuah perintah ketika kondisinya dianggap benar / true
		
		int age = 19;
		
		if(age >= 19) {
			System.out.println("You're an adult!");
		} else if(age >= 75) {
			System.out.println("Okay Boomer!");
		} else if(age >=13) {
			System.out.println("You're a teenager!");
		}
		else {
			System.out.println("You're not an adult!");
		}
	}
}