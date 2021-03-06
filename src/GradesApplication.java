import grades.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradesApplication {

    public static Map<String, Student> createStudents(){
        Map<String, Student> studentMap = new HashMap<>();

        Student student1 = new Student("Shrek");
        student1.addGrade(91);
        student1.addGrade(80);
        student1.addGrade(85);



        Student student2 = new Student("Donkey");
        student2.addGrade(92);
        student2.addGrade(93);
        student2.addGrade(94);


        Student student3 = new Student("Gingerbread man");
        student3.addGrade(88);
        student3.addGrade(75);
        student3.addGrade(81);

        Student student4 = new Student("Princess Fiona");
        student4.addGrade(84);
        student4.addGrade(93);
        student4.addGrade(88);

        studentMap.put("shrek23", student1);
        studentMap.put("donkey3", student2);
        studentMap.put("gingerMan2", student3);
        studentMap.put("princessFiona12", student4);
        return studentMap;
    }

    public static void main(String[] args) {
        System.out.println("Welcome!\n");
//Why did we create this?
        Map<String, Student> studentMap = createStudents();

        List<String> usernames = new ArrayList<String>(studentMap.keySet());

        System.out.println("Here are the GitHub usernames of our students:");

        String outputOfUsernames = "";
        for (String username : usernames){
            outputOfUsernames += String.format("|%s| ", username);
        }
        System.out.println(outputOfUsernames);
        }
    }

