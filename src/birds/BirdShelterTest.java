package birds;

public class BirdShelterTest {
    public static void main(String[] args) {

//Polymorphic array:
        Bird[] birds = new Bird[3];
        birds[0] = new Finch();
        birds[0].setName("Lesser Finch");
        birds[1] = new Duck();
        birds[1].setName("Mallard");
        birds[2] = new Penguin();
        birds[2].setName("Emperor Penguin");

        BirdShelter healingWings = new BirdShelter();
        healingWings.visitShelterAndHearThePrettyBirdies(birds);
        healingWings.takeCareOfTheBirdie(birds[2]);
    }
}