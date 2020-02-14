package ictgradschool.industry.controlflow.coderunner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCodeRunner {
    private CodeRunner cr;

    @BeforeEach
    void setUp() {
        cr = new CodeRunner();
    }

    @Test
    public void testReverseInt() {
        assertEquals(cr.reverseInt(1234), 4321);
        assertEquals(cr.reverseInt(111), 111);
        assertEquals(cr.reverseInt(9), 9);
        assertEquals(cr.reverseInt(10102361), 16320101);
        assertEquals(cr.reverseInt(-987123), -321789);
    }

    @Test
    public void testConvertIntToColTitle() {
        assertEquals("A", cr.convertIntToColTitle(1));
        assertEquals("Z", cr.convertIntToColTitle(26));
        assertEquals("CI", cr.convertIntToColTitle(87));
    }

    @Test
    public void testConvertIntToColTitleInvalid() {
        assertEquals("Input is invalid", cr.convertIntToColTitle(0));
        assertEquals("Input is invalid", cr.convertIntToColTitle(-1));
    }

    @Test
    public void testIsStringPalindromeTrue() {
        assertTrue(cr.isStringPalindrome("kayak"));
        assertTrue(cr.isStringPalindrome("101"));
        assertTrue(cr.isStringPalindrome("i did, did i"));
    }

    @Test
    public void testIsStringPalindromeFalse() {
        assertFalse(cr.isStringPalindrome("hello world"));
        assertFalse(cr.isStringPalindrome("java is fun"));
        assertFalse(cr.isStringPalindrome("if this is true i'll eat my hat"));
    }

    @Test
    public void testPrintPrimeNumbers() {
        assertEquals("2 3 5 7 11 13 17 19", cr.printPrimeNumbers(20));
        assertEquals("2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 101", cr.printPrimeNumbers(101));
        assertEquals("2 3 5 7", cr.printPrimeNumbers(8));
    }

    @Test
    public void testPrintPrimeNumbersNoPrimeNumbersFound() {
        assertEquals("No prime number found", cr.printPrimeNumbers(1));
        assertEquals("No prime number found", cr.printPrimeNumbers(0));
        assertEquals("No prime number found", cr.printPrimeNumbers(-1));
    }

}