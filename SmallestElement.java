import java.util.Scanner;

public class SmallestElement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		double[] numbers = new double[20]; 

		System.out.print("Enter twenty numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}

		System.out.println("The smallest element is " + min(numbers));
	}

	public static double min(double[] array) {
		double min = array[0];	
		for (double i: array) {
			if (i < min)
				min = i;
		}
		return min;
	}
}