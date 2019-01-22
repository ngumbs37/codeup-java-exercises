package grades;

import java.util.ArrayList;

public class Students {
    private String name;
    private ArrayList<Integer> grades;

    public Students(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public ArrayList<Integer> getGrades(){
        return grades;
    }
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    public void addGrade(int grade, int grade2, int grade3){
        addGrade(grade);
        addGrade(grade2);
        addGrade(grade3);
    }

    public double getGradeAverage(){
        double avg = 0;
        for(int grade : getGrades()){
           avg = avg + grade;
        }
        return avg / getGrades().size();
    }
    public static Students addStudent(String name, int grade, int grade2,int grade3){
        Students newStudent = new Students(name);
        newStudent.addGrade(grade,grade2,grade3);
        return newStudent;
    }
}
