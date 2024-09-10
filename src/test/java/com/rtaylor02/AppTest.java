package com.rtaylor02;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @InjectMocks
    private App systemUnderTest;

    /*
    Canary test
     */
    @Test
    public void shouldJustWork() {
        assertFalse(false);
        assertTrue(true);
    }
}
