public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//while( i <= 15){
//    System.out.println(i);
//    i++;

        int i = 0;
        do {
            i = i + 2;
            System.out.println("This is the next number in the loop"+ " " + i);

        } while (i < 100);
        System.out.println("This is the last number in the loop" + " " + i);
    }
}

//    Create a while loop that runs so long as i is less than or equal to 15