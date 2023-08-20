package com.example.springtesting.contollers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllersTest {

    @Test
    void hello() {
        HelloControllers helloControllers = new HelloControllers();
        String response = helloControllers.hello("Mah");
        assertEquals("Hello Mah",response);
    }
}