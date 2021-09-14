import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        Person [] people= {
                new Person("Tony"),
                new Person("Dakota"),
                new Person("Troy")

                };

        System.out.println(Arrays.toString(people));
    }
}




 /*   Create an array that holds 3 Person objects.
 Assign a new instance of the Person class to each element.
  Iterate through the array and print out the name of each person in the array.
  */