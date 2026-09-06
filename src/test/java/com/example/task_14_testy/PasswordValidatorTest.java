package com.example.task_14_testy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {
    @ParameterizedTest
    @CsvSource({
            "Password1, true",
            "pass, false",
            "password, false",
            "password1, false",
            "PASSWORD1, true",
            "Pass1234, true",
            "Aa1, false"
    })
    void shouldValidatePassword(String password, boolean expectedResult) {
        boolean isValid = PasswordValidator.isValid(password);
        assertEquals(expectedResult, isValid);
    }
}