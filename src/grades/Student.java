package grades;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

//we want to keep the name private so we don't have another piece of code changing the student's name
private String name;
private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }
        return sum/grades.size();

    }

    public String getGrades(){
//        for (int grade: grades) {
//            System.out.print(grade + " ");
//        }
            return grades.toString().replaceAll("\\[|\\]", "");
//        System.out.println();
    }
}
