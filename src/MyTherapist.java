import java.util.Locale;
import java.util.Scanner;
public class MyTherapist {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        System.out.print("How are you feeling today? Good or bad?");
        String userInput = answer.next();
        if (userInput == "good");{
            System.out.println("I'm glad you're feeling well! This session is over.");
        } else if ( userInput == "bad");{
            System.out.println("Let's talk about your feelings and stuff.");

        } else {
            System.out.println("That's not a valid answer.");
        }
    }
}
