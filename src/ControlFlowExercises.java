public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//while( i <= 15){
//    System.out.println(i);
//    i++;
//        **************Count by 2 backwards***********

//        int i = 0;
//        do {
//            i = i + 2;
//            System.out.println("This is the next number in the loop"+ " " + i);
//
//        } while (i < 100);
//        System.out.println("This is the last number in the loop" + " " + i);

//        **************Count by 5 backwards***********
//        int i = 100;
//        System.out.println("We're starting our loop with" + " " + i + "." + "Now let's start our loop.");
//        do {
//            i = i - 5;
//            System.out.println("This is the next number in the loop,"+ " " + i);
//
//        } while (i > -10);
//        System.out.println("This is the last number in the loop," + " " + i);

//        **************Count by 2 squared***********

//        int i = 2;
//        System.out.println("We're starting our loop with" + " " + i + "." + "Now let's start our loop.");
//        do {
//            i = i * i;
//            System.out.println("This is the next number in the loop,"+ " " + i);
//
//        } while (i < 1000000);
//        System.out.println("This is the last number in the loop," + " " + i);

//     *************FizzBuzz***************
//        int i = 0;
//        while (i <= 100) {
//            i++;
//            if ( i / 3 == 0){
//                System.out.println("Fizz");
//            System.out.println("i is " + i );
//            i++;
//            if ( i / 3 == 0){
//            System.out.println("Fizz");
        for (int i = 1; i <= 100; i++){
            if (((i % 3) == 0) && ((i % 5) == 0 ))
                System.out.println("FizzBuzz");
                else if ((i % 3) == 0)
                    System.out.println("Fizz");
                else if ((i % 5) == 0)
                    System.out.println("Buzz");
                else
                    System.out.println(i);
        }


    }
}

//    Create a while loop that runs so long as i is less than or equal to 15