package grades;

import java.util.ArrayList;

public class Student {

//    Properties
    private String name;
    private ArrayList<Integer> grades;

//    Constructor for class
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    //    Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGrade(int studentGrade){
        grades.add(studentGrade);


    }






}
