package Part1;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {

        // Project 3. Part1. Task 4

        Scanner in = new Scanner(System.in);

        int InputNumberA, InputNumberB;

        System.out.println("Please enter a number A.");
        InputNumberA = Integer.parseInt(in.nextLine());

        System.out.println("Please enter a number B.");
        InputNumberB = Integer.parseInt(in.nextLine());

        if ((InputNumberA > 5) && (InputNumberB > 5)) {
            System.out.println("Both number A and number B > 5");
        }
        if ((InputNumberA == 1) ||  (InputNumberB == 1))  {
            System.out.println("Number A or number B = 1");
        }
        if (!(InputNumberA > InputNumberB)) {
            System.out.println("Number A is not > number B");
        }
        else {
            System.out.println("Number A > number B");
        }
    }
}
