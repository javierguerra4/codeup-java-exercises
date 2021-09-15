package vehicles;

//public class Garage {
//    public void garageForVehicles(Vehicle[] allTheVehicles){
//        for (Vehicle garage : allTheVehicles){
//
//        }
//    }
//}


public class Garage {
    Vehicle[] vehicles;

    public void alarmCascade(){
        for (Vehicle vehicle: vehicles){
            System.out.println(vehicle.getName() + " goes whoo whoo");
        }
    }

    public Vehicle findVehicle(String name, Vehicle[] vehicles){
        for (Vehicle vehicle: vehicles) {
            if (vehicle.getName().equalsIgnoreCase(name)){
                return vehicle;
            }
        }
        Vehicle notHere = new Vehicle();
        notHere.setName(null);
        return notHere;
    }
}
