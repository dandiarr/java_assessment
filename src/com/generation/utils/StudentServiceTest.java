package com.generation.utils;

import com.generation.service.StudentService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentServiceTest {

    private final StudentService studentService = new StudentService();                    // create an instance of Calculator



    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
        // this tearDown operation is mainly used to reset all initialisations
        // e.g. closing database connections, and etc
    }

    @Test
    @DisplayName("Find student that does not exist.")
    void findStudent_studentDoesNotExist_shouldReturnNull() {
        assertNull(studentService.findStudent("xxxx"));
    }

}
