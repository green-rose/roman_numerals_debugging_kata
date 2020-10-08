package com.gfa.kata.debugging.roman;

public class RomanDigit {
    private String letter;
    private Integer value;

    public RomanDigit(String letter, Integer value) {
        this.letter = letter;
        this.value = value;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
