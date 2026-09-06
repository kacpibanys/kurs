package com.example.task_14_testy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class StringUtilsTest {
    private static StringUtils stringUtils;

    @BeforeAll
    static void setup() {
        stringUtils = new StringUtils();
    }

    @Test
    void shouldReturnTrueForKajak(){
        String kajak = "kajak";
        boolean result = stringUtils.isPalindrome(kajak);
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueForKajakStartedWithCapital(){
        String kajak = "Kajak";
        boolean result = stringUtils.isPalindrome(kajak);
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseForJava(){
        String java = "java";
        boolean result = stringUtils.isPalindrome(java);
        assertFalse(result);
    }

    @Test
    void shouldReturnTrueForEmpty(){
        String empty = "";
        boolean result = stringUtils.isPalindrome(empty);
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueForNull(){
        String justNull = null;
        boolean result = stringUtils.isPalindrome(justNull);
        assertTrue(result);
    }

}