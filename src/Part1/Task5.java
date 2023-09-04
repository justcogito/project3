package Part1;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {

        // Project 3. Part1. Task 5

        Scanner in = new Scanner(System.in);

        int PredeterminedNumber = 25;
        int InputNumber;

        System.out.println("Predetermined number is 25. Enter a number to compare.");

        InputNumber = Integer.parseInt(in.nextLine());

        if (InputNumber > 25) {
            System.out.println("Input number > predetermined number (25)");
        }
        else {
            System.out.println("Input number < predetermined number (25)");
        }
    }
}
