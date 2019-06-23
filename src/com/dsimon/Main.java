package com.dsimon;

public class Main {

    public static void main(String[] args) {
        System.out.println(FirstAndLastDigitSums.sumFirstAndLastDigit(252) == 4);
        System.out.println(FirstAndLastDigitSums.sumFirstAndLastDigit(257) == 9);
        System.out.println(FirstAndLastDigitSums.sumFirstAndLastDigit(0) == 0);
        System.out.println(FirstAndLastDigitSums.sumFirstAndLastDigit(-30) == -1);
    }
}
