package com.dsimon;

public class FirstAndLastDigitSums {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int firstNumber = number % 10;
        int secondNumber = 0;
        while (number > 0) {
            secondNumber = number % 10;
            number /= 10;
        }
        return firstNumber + secondNumber;
    }
}
