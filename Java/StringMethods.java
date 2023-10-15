
public class StringMethods {

	public static void main(String[] args) {
		
		// String = a reference data type that can store one or more characters reference data types have access to useful methods
		
		String name = "Alpha";
		
		boolean resultA = name.equals("Alpha");		// => memeriksa isi variable name apakah true or false
		int resultB = name.length();				// => mencari berapa panjang dari isi variable name
		char resultC = name.charAt(0);				// => mencari huruf pertama dari isi variable name
		int resultD = name.indexOf("A");			// => mencari huruf "A" berada di index ke berapa, jika not found outputnya -1
		boolean resultE = name.isEmpty();			// => memeriksa apakah variable name isinya kosong dengan output true or false
		String resultF = name.toUpperCase();		// => mengubah isi dari variable name dengan huruf kapital semua
		String resultG = name.toLowerCase();		// => mengubah isi dari variable name dengan huruf kecil semua
		String resultH = name.trim();				// => menghapus spasi tidak penting pada akhir di isi variable name
		String resultI = name.replace('a', 'o');	// => mengubah keseluruhan char 'a' menjadi 'o' (case sensitive)
		
		System.out.println(resultI);
	}
}