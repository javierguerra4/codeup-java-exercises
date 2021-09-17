package Consume;

public class Main {
    public static void main(String[] args) {

        Carrot carrot = new Carrot(true);

        System.out.println(carrot.isPeeled());
//        This had to be called as a function because
        carrot.checkIfExpired();

    }
}
