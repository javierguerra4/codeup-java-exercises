import java.util.Scanner;

public class MethodsExercises {
//
////*****************Exercise 1**************
//    public static int addition(int a, int b){
//        if (a > b) return a + b;
//        return b + a;
////        System.out.println(a + b);
//    }
//    public static int subtraction(int a, int b){
//        if (a > b) return a - b;
//        return b - a;
//    }
//    public static int multiply(int a, int b){
//        if (a > b) return a * b;
//        return b * a;
//    }
//    public static int division(int a, int b){
//        if (a > b) return a / b;
//        return b / a;
//    }
//    public static int modulus(int a, int b){
//        if (a > b) return a % b;
//        return b % a;
//    }
//    public static void main(String[] args) {
//        System.out.println(addition(5, 10));
//        System.out.println(subtraction(5, 100));
//        System.out.println(multiply(10, 5));
//        System.out.println(division(10, 5));
//        System.out.println(modulus(20, 21));
//    }


    //    ************Exercise 2************COME BACK TO UNDERSTAND THIS CODE
//    public static void main(String[] args) {
//        int userInput = getInteger(1, 10);
//        System.out.printf("You entered %d \n", userInput);
//    }
//    public static int getInteger(int min, int max) {
//        int input;
//        Scanner in = new Scanner(System.in);
//        do {
//            System.out.print("Enter a value between " + min + " and " + max + ": ");
//            input = in.nextInt();
//        } while (input < min || input > max);
//        return input;
//    }

//   *********** Exercise 3***********
    public static void main(String[] args) {
        int userInput = getInteger(1, 10);
        System.out.printf("You entered %d \n", userInput);
}
    public static int getInteger(int min, int max) {
        int input;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter a value between " + min + " and " + max + ": ");
            input = in.nextInt();
        } while (input < min || input > max);
        return input;
    }

}
