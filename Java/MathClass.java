import java.util.*;

public class MathClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// MATH CLASS
		
		double x = 3.14;
		double y = -10;
		
		double a = Math.max(x, y);	// => Mencari nilai paling tinggi antara x dan y
		double b = Math.min(x, y);	// => Mencari nilai paling rendah antara x dan y
		double c = Math.abs(y);		// => Mencari nilai murni tanpa negatif dari y
		double d = Math.sqrt(x);	// => Mencari nilai akar pangkat 2 dari x
		double e = Math.round(x);	// => Mencari nilai pembulatan dari x
		double f = Math.ceil(x);	// => Mencari nilai pembulatan ke atas dari x
		double g = Math.floor(x);	// => Mencari nilai pembulatan ke bawah dari x
		
		
		System.out.println(a);
		
		// Contoh Soal Mencari Nilai Phytagoras
		
		double X;
		double Y;
		double Z;
		
		System.out.print("Enter side of X: ");
		X = scanner.nextDouble();
		
		System.out.print("Enter side of Y: ");
		Y = scanner.nextDouble();
		
		double temp;
		temp = (X*X) + (Y*Y);
		
		Z = Math.sqrt(temp);
		System.out.println("The Answer is: " +Z);
		
	}
}