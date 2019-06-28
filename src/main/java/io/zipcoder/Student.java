package io.zipcoder;

import java.util.ArrayList;
import java.util.List;

public class Student {

    String firstName;
    String lastName;
    List<Double> examScores = new ArrayList<>();
    Double examScore;
    Student student;

    Student(String firstName, String lastName, List<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberOfExamsTaken() {
        return examScores.size();
    }

    public String getExamScores(Student student) {
        //To return the expected format, 1) establish a string result which will initially carry the header.
        // (\n) = a new line. Add this feature to the end of each string to move to the next line.
        // 2) Iterate through the list.
        // 3) Add each value at index "i" to the result string (carrying header).
        // 4) Include proper formatting (look at output).
        // 5) return result.

        String result = "Exam scores: /n";
        for (int i = 0; i < examScores.size(); i++) {
            //\t is used to tab the string in six spaces.
            //All formatting symbols must be typed within parentheses.
            result += " \tExam " + (i++) + " -> " + examScores.get(i) + "\n";
        } return result;
    }

    public List<Double> getScores(){
        return this.examScores;
    }

    //This method returns a list of exam scores without the string formatting.
    public String getExamScores2(Student student) {
        for (int i = 0; i < examScores.size(); i++) {
            return examScores.get(i).toString();
        } return null;
    }

    public void addExamScores(double examScore) {
        examScores.add(examScore);
        String result = "Exam scores: /n";
        result += " \tExam " + examScores.indexOf(examScore) + "-> "  + examScore;
        System.out.println(result.toString());
    }

    public void setExamScore(int examScore, double newScore) {
        String result = "Exam scores: /n";
        for (int i = 0; i < examScores.size(); i++) {
            if (examScores.get(i) == examScore) {
                    examScores.set(i, newScore);
                    result += " \tExam " + examScores.indexOf(newScore) + "-> " + newScore;
                System.out.println(result.toString());
            }
        }
    }

    public double getAverageExamScore(List<Double> examScores) {
        Double sum = 0.0;
        for (int i = 0; i < examScores.size(); i++) {
            sum += examScores.get(i);
        } return sum/examScores.size();
    }

    @Override
    public String toString() {
        return "Student Name: " + firstName + " " + lastName + "\n" +
                ">Average Score: " + this.getAverageExamScore(examScores) + "\n" +
                this.getAverageExamScore(examScores);

    }
}
