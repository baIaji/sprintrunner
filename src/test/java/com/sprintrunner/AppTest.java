package com.sprintrunner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
        assertEquals(true, true);
        assertTrue(true);
    }

    @Test
    void greetWithName() {
        Greet greet = new Greet();
        assertEquals("Hello Balaji", greet.sayHello("Balaji"));
        assertEquals("Hello World!", greet.sayHello(""));
    }
}

