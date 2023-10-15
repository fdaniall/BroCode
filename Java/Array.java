
public class Array {

	public static void main(String[] args) {
		
		// Array = used to store multiple values in a single variable
		
		// STEP 1
		String[] cars = {"Camaro", "Corvette", "Tesla"};
		cars[0] = "Mustang";
		
		System.out.println(cars[0]);
		
		// STEP 2
		String[] games = new String [3];
		
		games[0] = "Valorant";
		games[1] = "CSGO";
		games[2] = "CS2";
		
		for(int i=0; i<games.length; i++) {
			System.out.println(games[i]);
		}
	}
}