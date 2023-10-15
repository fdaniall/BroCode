import java.util.ArrayList;

public class ArrayList2D {

	public static void main(String[] args) {
		
		// ArrayList 2D = A dynamic list of lists, you can change the size of these lists during runtime
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();	// => Mendeklarasikan ArrayList 2D
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("Pasta");
		bakeryList.add("Garlic Bread");
		bakeryList.add("Donuts");
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("Tomatoes");
		produceList.add("Zucchini");
		produceList.add("Peppers");
		
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("Soda");
		drinksList.add("Coffee");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		System.out.println(groceryList.get(0));			// => Mengambil keseluruhan isi dari salah satu list
		System.out.println(groceryList.get(1).get(2));	// => Mengambil isi ke 3 dari list ke 2
	}
}