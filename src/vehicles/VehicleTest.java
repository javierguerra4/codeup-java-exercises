package vehicles;

import birds.Duck;

public class VehicleTest {
    public static void main(String[] args) {
        Truck silverado = new Truck();
        silverado.setName("Silverado");
        System.out.println("A " + silverado.getName() + " goes:");
        silverado.makeNoise();

        Car cruze = new Car();
        cruze.setName("Cruze");
        System.out.println(cruze.getName() + " says:");
        cruze.makeNoise();

    }
    }

