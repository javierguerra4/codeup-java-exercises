import grades.Student;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, String> students = new HashMap<String, String>();

        Student student1 = new Student("Shrek");
        student1.addGrade(91);
        student1.addGrade(80);
        student1.addGrade(85);


        Student student2 = new Student("Donkey");
        student2.addGrade(92);
        student2.addGrade(93);
        student2.addGrade(94);

    }
}
