package Part1;
import java.util.Random;
public class Task1_1 {
    public static void main(String[] args) {

        // Project 3. Part1. Task 1.1

        Random random = new Random();
        int RandomNumber = random.nextInt(2);

        if (RandomNumber == 1) {
            System.out.println("Random number = 1.");
        }
        else if (RandomNumber == 2) {
            System.out.println("Random number = 2.");
        }
        else {
            System.out.println("Random number = " + RandomNumber + ".");
        }
    }
}