package Consume;

public class Main {
    public static void main(String[] args) {

        Carrot carrot = new Carrot(true);

        System.out.println(carrot.isPeeled());
        carrot.checkIfExpired();

    }
}
