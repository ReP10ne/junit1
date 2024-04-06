package org.example.example.ArithmeticException;

import org.example.ArithmeticException.ArithmeticException_main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ArithmeticExceptionTest {
    @Test
    @DisplayName("Проверка доступа к исключению")
        public void testMyCustomException() {
        ArithmeticException thrown = Assertions.assertThrows(ArithmeticException.class, ArithmeticException_main::getResult);
        assertNotNull(thrown.getMessage());
        Assertions.assertEquals("some message", thrown.getMessage());
        }
    }
