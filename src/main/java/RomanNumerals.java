import java.util.*;

public class RomanNumerals {

    private List<RomanDigit> digits = new ArrayList<>();

    public RomanNumerals() {
        digits.add(new RomanDigit("M", 1000));
        digits.add(new RomanDigit("D", 500));
        digits.add(new RomanDigit("C", 100));
        digits.add(new RomanDigit("L", 50));
        digits.add(new RomanDigit("X", 10));
        digits.add(new RomanDigit("V", 5));
        digits.add(new RomanDigit("I", 1));
    }

    public String convertToRoman(int number) {
        StringBuilder sb = new StringBuilder();
        int remainingNumber = number;
        for (int i = 0; i < digits.size(); i++) {
            RomanDigit currentDigit = digits.get(i);
            remainingNumber = addLettersWithValueIfRequired(remainingNumber, currentDigit, sb);
            for (int j = i; j < digits.size(); j++) {
                RomanDigit digitToSubtract = digits.get(j);
                remainingNumber = addSubtractingFormulaIfRequired(remainingNumber, currentDigit, digitToSubtract, sb);
            }
        }
        return sb.toString();
    }

    private int addLettersWithValueIfRequired(int number, RomanDigit digit, StringBuilder sb) {
        int necessaryLetterCount = number / digit.getValue();
        if (necessaryLetterCount > 0) {
            for (int i = 0; i < necessaryLetterCount; i++) {
                sb.append(digit.getLetter());
                number -= digit.getValue();
            }
        }
        return number;
    }

    private int addSubtractingFormulaIfRequired(int remainingNumber, RomanDigit currentDigit, RomanDigit digitToSubtract, StringBuilder sb) {
        int subtractingFormulaValue = currentDigit.getValue() - digitToSubtract.getValue();
        if (remainingNumber >= subtractingFormulaValue) {
            String subtractingFormulaStr = digitToSubtract.getLetter() + currentDigit.getLetter();
            sb.append(subtractingFormulaStr);
            return remainingNumber - subtractingFormulaValue;
        }
        return remainingNumber;
    }
}
