package com.generation.utils;

import static org.junit.jupiter.api.Assertions.*;

import com.generation.model.Course;
import com.generation.model.Module;
import com.generation.service.CourseService;

class CourseServiceTest {

    private final CourseService courseService = new CourseService();

    @Test
    void testRegisterAndGetCourse() {

        // Create a new Course
        Module testModule = new Module("TEST-MOD", "Test Module", "Test Module Description");
        Course testCourse = new Course("TEST-COURSE", "Test Course Name", 9, testModule);

        // Register the Course
        courseService.registerCourse(testCourse);

        // Get the registered Course
        Course retrievedCourse = courseService.getCourse("TEST-COURSE");
        assertNotNull(retrievedCourse);
        assertEquals(testCourse, retrievedCourse);
    }

}