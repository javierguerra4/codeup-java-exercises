import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        System.out.print("Ask Bob the teenager a question:");
        String userInput = answer.nextLine().toLowerCase();
        if (userInput.endsWith("?")){
            System.out.println("Sure");
        } else if (userInput.endsWith("!")){
            System.out.println("Whoa, chill out boomer!");
        } else if (userInput.equals("")){
            System.out.println("Fine, Be that way!");
        } else {
            System.out.println("Whatever");
        }
    }
}
