public class MethodsExercises {

//    public static void main(String[] args) {
//        addition (10, 5);
//        return subtraction(10, 5);
////        multiply(10, 5);
////        division(10, 5);
//    }
    public static int addition(int a, int b){
        if (a > b) return a + b;
        return b + a;
//        System.out.println(a + b);
    }
    public static int subtraction(int a, int b){
        if (a > b) return a - b;
        return b - a;
    }
    public static int multiply(int a, int b){
        if (a > b) return a * b;
        return b * a;
    }
    public static int division(int a, int b){
        if (a > b) return a / b;
        return b / a;
    }
    public static int modulus(int a, int b){
        if (a > b) return a % b;
        return b % a;
    }
    public static void main(String[] args) {
        System.out.println(addition(5, 10));
        System.out.println(subtraction(5, 100));
        System.out.println(multiply(10, 5));
        System.out.println(division(10, 5));
        System.out.println(modulus(20, 5));
    }
}
