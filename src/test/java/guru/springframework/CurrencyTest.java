package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CurrencyTest {
    @Test
    void dollarMultiplication() {
        // Given:
        Franc five = new Franc(5);
        // When:
        five.times(2);
        // Then:
        assertEquals(10, five.getTotal());

        // Given:
        Franc twenty = new Franc(20);
        // When:
        five.times(0);
        // Then:
        assertEquals(0, twenty.getTotal());

        // Given:
        Franc half = new Franc(0.50);
        // When:
        half.times(7);
        // Then:
        assertEquals(3.5, half.getTotal());

        // Given:
        Franc ten = new Franc(10);
        // When:
        ten.times(3);
        // Then:
        assertEquals(30, ten.getTotal());
    }

    @Test
    void dollarEquality() {
        // Given:
        Franc five$1 = new Franc(5);
        Franc five$2 = new Franc(5);
        // Then:
        assertEquals(five$1, five$2);

        // Given:
        Franc ten = new Franc(10);
        Franc twenty = new Franc(20);
        // Then:
        assertNotEquals(ten, twenty);
    }

    @Test
    void francMultiplication() {
        // Given:
        Franc five = new Franc(5);
        // When:
        five.times(2);
        // Then:
        assertEquals(10, five.getTotal());

        // Given:
        Franc twenty = new Franc(20);
        // When:
        five.times(0);
        // Then:
        assertEquals(0, twenty.getTotal());

        // Given:
        Franc half = new Franc(0.50);
        // When:
        half.times(7);
        // Then:
        assertEquals(3.5, half.getTotal());

        // Given:
        Franc ten = new Franc(10);
        // When:
        ten.times(3);
        // Then:
        assertEquals(30, ten.getTotal());
    }

    @Test
    void francEquality() {
        // Given:
        Franc five$1 = new Franc(5);
        Franc five$2 = new Franc(5);
        // Then:
        assertEquals(five$1, five$2);

        // Given:
        Franc ten = new Franc(10);
        Franc twenty = new Franc(20);
        // Then:
        assertNotEquals(ten, twenty);
    }
}
