import java.util.Arrays;
import java.util.List;

public class JavaDrills {
//    Working progress
    public static String flipOuterCase(String text)
    {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if (Character.isUpperCase(c))
            {
                chars[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c))
            {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }
//**********************
//    In `codeup-java-exercises`, in `JavaDrills`:
//    Create a static method, returnTotalDifference, that takes in two lists of integers and returns the difference between the sum of all integers in the first list minus the sum of all integers in the second list.
//    returnTotalDifference(Arrays.asList(10, 2, 3), Arrays.asList(1, 2, 3)); // returns 9
//    returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7)); // returns 3
//    returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7, 1)); // returns 2

//    Working progress************
public static int returnTotalDifference(List<Integer> listOne, List<Integer> listTwo) {
    int sum = 0;
    for (int i : listOne) {
        sum += i;
    }
    return sum;
}
List<Integer> ints = Arrays.asList(1, 2, 3);
int sum = MathUtils.sum(ints);

};








    public static void main(String[] args){
        System.out.println(JavaDrills.flipOuterCase("CaT"));
    }








}
