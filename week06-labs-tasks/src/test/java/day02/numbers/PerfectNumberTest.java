package day02.numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PerfectNumberTest {

    PerfectNumbers perfectNumbers;

    @BeforeEach
            void initPerfectNumbers() {
        perfectNumbers = new PerfectNumbers();
    }
    @Test
    void testPerfectNumbersTrue() {
        assertTrue(perfectNumbers.isPerfectNumber(6));
        assertTrue(perfectNumbers.isPerfectNumber(8128));
    }

    @Test
    void testPerfectNumbersFalse() {
        assertFalse(perfectNumbers.isPerfectNumber(7246));
        assertFalse(perfectNumbers.isPerfectNumber(9));
    }
}
