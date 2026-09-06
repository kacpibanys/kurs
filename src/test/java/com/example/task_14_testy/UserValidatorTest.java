package com.example.task_14_testy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {
    private static UserValidator userValidator;

    @BeforeAll
    static void setup() {
        userValidator = new UserValidator();
    }

    @Test
    void shouldReturnEmail() {
        String email = "dupadupa@gmail.com";
        String validatedEmail = userValidator.validateEmail(email);
        assertEquals(email, validatedEmail);
    }

    @Test
    void shouldThrowExceptionWhenEmailHasNoAt() {
        String email = "dupadupagmail.com";
        assertThrows(IllegalArgumentException.class, () -> userValidator.validateEmail(email));
    }

    @Test
    void shouldThrowExceptionWhenEmailIsEmpty() {
        String email = "";
        assertThrows(IllegalArgumentException.class, () -> userValidator.validateEmail(email));
    }

    @Test
    void shouldThrowExceptionAndVerifyMessageWhenEmailIsNull() {
        String email = null;
        NullPointerException exception = assertThrows(NullPointerException.class, () -> userValidator.validateEmail(email));
        assertEquals("Null email address", exception.getMessage());
    }



}