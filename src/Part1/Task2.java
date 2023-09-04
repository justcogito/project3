package Part1;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {

        // Project 3. Part1. Task 2

        Scanner in = new Scanner(System.in);

        int PredeterminedNumber = 25;
        int InputNumber;

        System.out.println("Predetermined number is 25. Enter a number to compare.");

        InputNumber = Integer.parseInt(in.nextLine());

        if (InputNumber == PredeterminedNumber) {
            System.out.println("Predetermined number = Input number");
        }
        else {
            if (InputNumber != 20) {
                System.out.println("Input number is not equal to 20");
            }
            else {
                System.out.println("Input number is equal to 20");
            }

            if (InputNumber > 10) {
                System.out.println("Input number > 10");
            }

            if (InputNumber >= 20) {
                System.out.println("Input number >= 20");
            }
            if (InputNumber < 8) {
                System.out.println("Input number < 8");
            }
            else {
                System.out.println("Input number is not < 8");
            }

            if (InputNumber <= 5) {
                System.out.println("Input number <= 5");
            }
            else {
                System.out.println("Input number is not <= 5");
            }
        }
    }
}
