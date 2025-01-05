package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    private Map<String, Double> grades = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId )
    {
        if ( students.containsKey( studentId ) )
        {
            return students.get( studentId );
        }
        return null;
    }

    public boolean isSubscribed( String studentId )
    {
        return students.containsKey( studentId );
    }

    public void gradeStudent(String studentId, String courseCode, double grade)
    {
        // TODO Implement
        if (grade < 0 || grade > 10) {
            System.out.println("Invalid grade. Grade must be between 0 and 10.");
            return;
        }

        grades.put(courseCode, grade);

        String msg = "Your result: ";                   // Initialise strings to form the results
        String result;

        if (grade < 5)                            // if grade <= 3 return "Failed"
            result = "Failed\n";
        else if (grade >= 5 && grade <= 6)      // else if grade > 3 && grade <= 5 return "Insufficient"
            result = "Insufficient\n";
        else if (grade > 6 && grade <= 8)     // else if grade > 5 && grade <= 8 return "Good"
            result = "Good\n";
        else if (grade == 9 || grade == 10)   // else if grade == 9 || grade == 10 return "Excellent"
            result = "Excellent\n";
        else                                            // else return "Invalid entry" (for all other scenario)
            result = "Invalid entry\n";
    }

    public void showSummary()
    {
        //TODO implement
        System.out.println("Available Students:");

        for (Student student : students.values()) {
            System.out.println(student);
        }
    }

    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }

}
