package Consume;

public class Pill implements Consumable{
    private String medicationName;
    private String pharmacistInstructions;

//    Getters and setters
    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }


// Getter and setters
    public String getPharmacistInstructions() {
        return pharmacistInstructions;
    }

    public void setPharmacistInstructions(String pharmacistInstructions) {
        this.pharmacistInstructions = pharmacistInstructions;
    }



    // getters setters constructors...

    public void consume() {
        System.out.println("Drink down with fluid");
    }

    public void checkIfExpired() {
        System.out.println("Check expiration date on pill bottle");
    }

    public void throwAway() {
        System.out.println("Wash down sink...");
    }

}
