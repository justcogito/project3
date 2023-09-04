package Part1;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {

        // Project 3. Part1. Task 6

        Scanner in = new Scanner(System.in);

        int InputNumberA, InputNumberB;

        System.out.println("Please enter a number A.");
        InputNumberA = Integer.parseInt(in.nextLine());

        System.out.println("Please enter a number B.");
        InputNumberB = Integer.parseInt(in.nextLine());

        if (InputNumberA > InputNumberB) {
            System.out.println("Number A > number B");

            if (InputNumberA > 10) {
                System.out.println("Number A > 10");
            }
        } else {
            if (InputNumberB < 5) {
                System.out.println("Number B < 5");
            }
        }
    }
}
