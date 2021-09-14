import java.util.Arrays;

public class ArraysExercises {
    public static Person[] addPerson(Person[] people, Person newPerson){
        Person[] output = Arrays.copyOf(people, people.length + 1);
        output[people.length] = newPerson;
        return output;
    }
    public static void main(String[] args) {
        Person[] people = new Person [3];
        people[0] = new Person ("Luis");
        people[1] = new Person ("Miguel");
        people[2] = new Person ("Javier");

        for (Person person : people){
            System.out.println(person.getName());
        }
        System.out.println(Arrays.toString(people));
//        ******This adds another person to the array and creates a copy of the array.
           people = addPerson(people, new Person("Ryan"));
        System.out.println(Arrays.toString(people));
    }












//    public static void main(String[] args) {
//        Person bob = new Person("Bob");
//        Person [] person= {
//                new Person("Antonio"),
//                new Person("Dakota"),
//                new Person("Troy")
//
//                };
//        addPerson(person, bob);
//        for(Person p : addPerson)
//
//        System.out.println(Arrays.toString(person));
//    }
//
//    private static void addPerson(Person[] person, Person bob) {
//    }
}




 /*   Create an array that holds 3 Person objects.
 Assign a new instance of the Person class to each element.
  Iterate through the array and print out the name of each person in the array.
  */