import java.util.Scanner;

public class RandomNumber {

    static final int SIZE = 5;
    public static void main(String[] args) {

        int[] numbers = new int[SIZE];
        Scanner input = new Scanner(System.in);

        System.out.print("Enter five numbers to exclude from random (1-54): ");
        for (int i = 0; i < numbers.length; i++) numbers[i] = input.nextInt();

        System.out.println("Number generated: " + getRandom(numbers));
    }

    public static int getRandom(int... numbers) {

        int random = (int)(Math.random() * 54 + 1);
        for (int i = 0; i < numbers.length; i++) {
            if (random == numbers[i]) {
                random = (int)(Math.random() * 54 + 1);
                i = -1;
            }
        }
        return random;
    }



}