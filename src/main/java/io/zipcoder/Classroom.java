package io.zipcoder;

import java.util.*;

public class Classroom {

    //What do student objects contain?
    //State:
    //1) first name
    //2) last name
    //3) double list of exam scores
    //Functionality/Behavior:
    //In order to "get/fetch" grades from a student you must use the getExamScores method.
    //In order to add an exam to the list you must use the addExamScore method.
    //If you wish to retrieve an average for "this" student's exam scores, use the getAverageExamScores method.
    List<Student> students = new ArrayList<>();
    Student[] studentArray = new Student[30];
    List<Double> examScores = new ArrayList<>();
    Student student;

    public Classroom() {
        Student[] studentArray = new Student[30];
        this.studentArray = studentArray;
    }

    public Classroom(int maxNumberOfStudents) {
        if (this.students.size() == maxNumberOfStudents) {
            throw new IllegalStateException("List is already at maximum size of " + maxNumberOfStudents);
        } else {
            students.add(student);
        }
        this.students = students;
    }

    public Classroom(Student[] studentArray) {
        List<Student> students = Arrays.asList(studentArray);
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public double getAverageExamScore() {
        for (Student current : students) {
            String allScores = current.getExamScores2(current);
            Double averageScore = Double.parseDouble(allScores);
        } return -1;
    }

    public void addStudent(Student student) {
        if (students.contains(student)) {
            throw new IllegalStateException("List already contains " + student);
        } else {
            students.add(student);
        }
    }

    public void removeStudent(String firstName, String lastName) {
        for (Student current : students) {
            if (current.getFirstName().equals(firstName) && (current.getLastName().equals(lastName))) {
                students.remove(current);
            }
        }
    }

    public Object[] getStudentsByScore() { return null;}

    public Object[] getstudentsByExamscore() {

        List<Student> students = new ArrayList<>();
        List<Double> examScores = (Arrays.asList(new Double[]{100.0, 98.0, 91.0, 95.0}));
        Student reese = new Student("Reese", "Watson", examScores);
        List<Double> examScores2 = (Arrays.asList(100.0, 99.0, 100.0, 100.0));
        Student joanna = new Student("Joanna", "Hsiao", examScores2);
        List<Double> examScores3 = (Arrays.asList(100.0, 100.0, 100.0, 100.0));
        Student eleanor = new Student("Eleanor", "Bart", examScores3);
        students.add(reese);
        students.add(joanna);
        students.add(eleanor);
        Object[] arr = students.toArray(new Object[students.size()]);
        Arrays.sort(arr);
        return arr;



    }

    public HashMap<Student, String> getGradeBook() {
        // Figure out what exactly you wish to do with this map.
        // Are you collecting grades?
        // How are you collecting grades?
        // Use the getExamScores method to retrieve grades from students.
        // Create a map to store grades.

        HashMap<Student, String> gradebook = new HashMap<Student,String>();
        Student[] grades = (Student[]) getStudentsByScore();
        Double percentile;
        Double classSize = new Double(grades.length);
        for (int i = 0; i < grades.length; i++) {
            percentile = (((classSize - i) / classSize) * 100.0);
            if (percentile >= 90) {
                gradebook.put(grades[i], "A"); }
            if (percentile >= 71) {
                gradebook.put(grades[i], "B"); }
            if (percentile >= 50) {
                gradebook.put(grades[i], "C"); }
            if (percentile >= 11) {
                gradebook.put(grades[i], "D"); }
            else { gradebook.put(grades[i], "F"); }
        } return gradebook;
    }

}

