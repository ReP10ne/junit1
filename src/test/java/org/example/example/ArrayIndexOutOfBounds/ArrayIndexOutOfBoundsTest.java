package org.example.example.ArrayIndexOutOfBounds;


import org.example.ArrayIndexOutOfBounds.ArrayIndexOutOfBounds_main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayIndexOutOfBoundsTest {
    @Test
    public void testMyCustomException() {
        ArrayIndexOutOfBoundsException thrown = Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, ArrayIndexOutOfBounds_main::getResult);
        Assertions.assertEquals("some message", thrown.getMessage());
    }
}
