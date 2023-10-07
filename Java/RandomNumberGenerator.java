import java.util.*;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int x = random.nextInt(6)+1;	// => Contoh ketika ingin angka acak untuk dadu
		double y = random.nextDouble();
		boolean z = random.nextBoolean();
		
		System.out.println(x);
		
	}
}