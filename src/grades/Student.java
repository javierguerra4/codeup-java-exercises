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
//************

    public void addGrade(int studentGrade) {
        grades.add(studentGrade);
    }

        public String getGrades() {
            String newList = "";
            for (Integer x : this.grades) {
                if (this.grades.indexOf(x) != this.grades.size() - 1) {
                    newList += x + ", ";
                } else {
                    newList += x;
                }
            }
            return newList;
        }


    public double getGradeAverage() {
        double totalGrades = 0;
        int length = 0;
        for (Integer x : this.grades) {
            totalGrades = totalGrades + x;
            length += 1;
        }
        return totalGrades / length;
    }


    public static void main(String[] args) {

    }











}
