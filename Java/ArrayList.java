import java.util.ArrayList;

public class ArrayList {

	public static void main(String[] args) {
		
		// ArrayList = A resizable array, elements can be added and removed after compilation phase store reference data types
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("Pizza");
		food.add("Hamburger");
		food.add("HotDog");
		
		food.set(0, "Sushi");	// => Mengubah food index ke 0 menjadi "Sushi"
		food.remove(2);			// => Menghapus food index ke 2
		food.clear();			// => Menghapus seluruh ArrayList food
		
		for(int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
	}
}