package Part1;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {

        // Project 3. Part1. Task 3

        Scanner in = new Scanner(System.in);

        String result_string;

        System.out.println("Please say \"HELLO\".");

        result_string = in.nextLine();

        if (result_string.equals("HELLO")) {
            System.out.println("You actually said \"HELLO\"! Thank you.");
        }
        else {
            System.out.println("You didn't say \"HELLO\"...");
        }
    }
}
