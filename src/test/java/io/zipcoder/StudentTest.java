package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

    @Test
    public void constructorTest() {
        // Given
        String expectedFirstName = "Reese";
        String expectedLastName = "Watson";
        List<Double> expectedScores = new ArrayList<>();
        expectedScores.add(100.0);

        // When
        Student actualStudent = new Student(expectedFirstName, expectedLastName, expectedScores);

        // Then
        Assert.assertEquals(expectedFirstName, actualStudent.getFirstName());
        Assert.assertEquals(expectedLastName, actualStudent.getLastName());
        Assert.assertEquals(expectedScores, actualStudent.getScores());
    }

    @Test
    public void getNumberOfExmasTest() {
        //Given
        List<Double> examscore = new ArrayList();
        examscore.add(93.0);
        examscore.add(100.0);
        Student actualStudent = new Student("Ted", "Davis", examscore);
        int expectedvalue = 2;

        //When
        int actual = actualStudent.getNumberOfExamsTaken();

        //Then
        Assert.assertEquals(expectedvalue, actual);
    }

    @Test
    public void getNumberOfExamsTaken() {
    }

    @Test
    public void getExamScores() {
    }

    @Test
    public void getScores() {
    }

    @Test
    public void getExamScores2() {
    }

    @Test
    public void addExamScores() {
    }

    @Test
    public void setExamScore() {
    }

    @Test
    public void getAverageExamScore() {
    }
}