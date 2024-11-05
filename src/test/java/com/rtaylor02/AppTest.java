package com.rtaylor02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
@ExtendWith(MockitoExtension.class)
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

        /*
        Other assertions
        //  Assert an exception is thrown
        assertThrows(NullPointerException.class, () -> systemUnderTest.method1(), "NPE is thrown!");
        assertThrowsExactly(NullPointerException.class, () -> systemUnderTest.method1(), "NPE is thrown!");

        //  Assert no exception is thrown
        assertDoesNotThrow(() -> systemUnderTest.method1());

        // Assert equality
        assertEquals(expected, actual);
        assertNotEquals(unexpected, actual);
        assertIterableEquals();

        // Assert timeout
        assertTimeout();
         */
    }
}
