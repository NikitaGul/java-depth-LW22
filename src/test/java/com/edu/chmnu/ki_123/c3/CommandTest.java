package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CommandTest {
    @Test
    void testGetDescriptionForward() {
        assertEquals("Forward", Command.FORWARD.getDescription());
    }

    @Test
    void testGetDescriptionBackward() {
        assertEquals("Backward", Command.BACKWARD.getDescription());
    }

    @Test
    void testGetDescriptionLeft() {
        assertEquals("Left", Command.LEFT.getDescription());
    }
}