package Pets;

public class Cat {


    public void rest(int noOfHours) {
        for (int i = 0; i <= noOfHours; i += 1) {
            System.out.println("Zzzzzzz....");
        }
    }

    public void responseToCommand(String command) {
        System.out.println("Meow... coughs up hairball...");
    }
}
