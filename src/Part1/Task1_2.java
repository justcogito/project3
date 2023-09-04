package Part1;
import java.util.Scanner;
public class Task1_2 {
    public static void main(String[] args) {

        // Project 3. Part1. Task 1.2

        Scanner in = new Scanner(System.in);

        boolean result_bool;

        System.out.println("Enter a character. If the character is \"a\" or \"b\" then result will be true.");
        String result_string = in.nextLine();

        switch (result_string) {
            case "a":
                result_bool = true;
                break;
            case "b":
                result_bool = true;
                break;
            default:
                result_bool = false;
        }
        System.out.println(result_bool);

    }
}
