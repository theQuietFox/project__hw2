package ru.qa.irakulikova;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    void exampleTest() {
        Assertions.assertTrue(new Random().nextInt() > 1);
    }
    @Test
    void exampleTest() {
        Assertions.assertTrue(new Random().nextInt() > 5);
    }

 }
