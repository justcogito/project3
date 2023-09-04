package Part2;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {

        // Project 3. Task 1

        Scanner in = new Scanner(System.in);

        int Age;

        System.out.println("Please tell me how old are you. In return I'll guess your current activity.");
        Age = Integer.parseInt(in.nextLine());

        if (Age < 6) {
            System.out.println("Seems like you are going to kindergarten");
        } else if ((Age > 7) && (Age < 17)) {
            System.out.println("You must be going to school");
        } else if ((Age > 18) && (Age < 22)) {
            System.out.println("You are a university student for sure");
        } else if ((Age > 23) && (Age < 60)) {
            System.out.println("I guess are a working adult");
        }
        else if (Age > 60) {
            System.out.println("Oh, you are probably retired");
        }
    }
}
