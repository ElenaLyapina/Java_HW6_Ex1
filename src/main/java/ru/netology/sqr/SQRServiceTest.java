package ru.netology.sqr;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SQRServiceTest {

    @Test

    void shouldCalculate_100_200(){
        SQRService calcSqr = new SQRService();
        int ourMin = 100;
        int ourMax = 200;
        int expected = 5;

        int result = calcSqr.calculate(ourMin,ourMax);
        assertEquals(expected, result);
    }

    @Test
    void shouldCalculate_200_400(){
        SQRService calcSqr = new SQRService();
        int ourMin = 200;
        int ourMax = 400;
        int expected = 6;

        int result = calcSqr.calculate(ourMin,ourMax);
        assertEquals(expected, result);
    }

    @Test
    void shouldCalculate_200_500(){
        SQRService calcSqr = new SQRService();
        int ourMin = 200;
        int ourMax = 500;
        int expected = 8;

        int result = calcSqr.calculate(ourMin,ourMax);
        assertEquals(expected, result);
    }
}
