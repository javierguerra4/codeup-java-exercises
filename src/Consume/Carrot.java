package Consume;

public class Carrot implements Consumable{
    private boolean isPeeled;

//    Constructor**********
    public Carrot(boolean isPeeled){
        this.isPeeled = isPeeled;
    }

    public boolean isPeeled() {
        return this.isPeeled;
    }

    public void setPeeled(boolean peeled) {
        isPeeled = peeled;
    }



    // getters setters constructors...

    public void consume() {
        System.out.println("Eat, bite by bite");
    }

    public void checkIfExpired() {
        System.out.println("Observe color and smell");
    }

    public void throwAway() {
        System.out.println("Throw into compost pile");
    }

}