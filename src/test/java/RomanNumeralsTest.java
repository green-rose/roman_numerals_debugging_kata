import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RomanNumeralsTest {

    @Test
    public void threeThousandNineHundredAndNinetyNine() {
        assertRomanNumeralEquals("MMMCMXCIX", 3999);
    }

    @Test
    public void oneThousand() {
        assertRomanNumeralEquals("M", 1000);
    }

    @Test
    public void nineHundred() {
        assertRomanNumeralEquals("CM", 900);
    }

    @Test
    public void fiveHundred() {
        assertRomanNumeralEquals("D", 500);
    }

    @Test
    public void fourHundred() {
        assertRomanNumeralEquals("CD", 400);
    }

    @Test
    public void threeHundredAndNinetyNine() {
        assertRomanNumeralEquals("CCCXCIX", 399);
    }

    @Test
    public void ninety() {
        assertRomanNumeralEquals("XC", 90);
    }

    @Test
    public void eightyNine() {
        assertRomanNumeralEquals("LXXXIX", 89);
    }

    @Test
    public void sixty() {
        assertRomanNumeralEquals("LX", 60);
    }

    @Test
    public void fifty() {
        assertRomanNumeralEquals("L", 50);
    }

    @Test
    public void forty() {
        assertRomanNumeralEquals("XL", 40);
    }

    @Test
    public void fourtyOne() {
        assertRomanNumeralEquals("XLI", 41);
    }

    @Test
    public void one() {
        assertRomanNumeralEquals("I", 1);
    }

    @Test
    public void two() throws Exception {
        assertRomanNumeralEquals("II", 2);
    }

    @Test
    public void five() {
        assertRomanNumeralEquals("V", 5);
    }

    @Test
    public void four() {
        assertRomanNumeralEquals("IV", 4);
    }

    @Test
    public void six() {
        assertRomanNumeralEquals("VI", 6);
    }

    @Test
    public void nine() {
        assertRomanNumeralEquals("IX", 9);
    }

    @Test
    public void ten() {
        assertRomanNumeralEquals("X", 10);
    }

    @Test
    public void fourteen() {
        assertRomanNumeralEquals("XIV", 14);
    }

    @Test
    public void thirtyNine() {
        assertRomanNumeralEquals("XXXIX", 39);
    }

    private static void assertRomanNumeralEquals(String roman, int arab) {
        assertThat(new RomanNumerals().convertToRoman(arab), is(roman));
    }
}
