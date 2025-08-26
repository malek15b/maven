package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void isEvent_shouldReturnTrue_WhenCalledWith2() {
        //Given
        int number = 10;
        boolean expected = true;
        //When
        boolean actual = Main.isEven(number);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void isEvent_shouldReturnFalse_WhenCalledWith3() {
        //Given
        int number = 3;
        //When
        boolean actual = Main.isEven(number);
        //then
        assertFalse(actual);
    }

    @Test
    void isPositive_shouldReturnTrue_WhenCalledWith5() {
        //Given
        int number = 5;
        //When
        boolean actual = Main.istPositive(number);
        //then
        assertTrue(actual);
    }

    @Test
    void multiply_shouldReturn10_WhenCalledWith2mal5() {
        //Given
        int number1 = 2;
        int number2 = 5;
        int except = 10;
        //When
        int actual = Main.multiply(number1, number2);
        //then
        assertEquals(except, actual);
    }

    @Test
    void divide_shouldReturnException_WhenCalledWith10div0() {
        //Given
        int number1 = 10;
        int number2 = 0;
        //then
        assertThrows(IllegalArgumentException.class, () -> {
            Main.divide(number1, number2);
        });
    }

    @Test
    void isPrime_shouldReturnTrue_WhenCalledWith97() {
        //Given
        int number = 97;
        //then
        assertTrue(Main.isPrime(number));
    }

    @Test
    void isPrime_shouldReturnTrue_WhenCalledWith101() {
        //Given
        int number = 101;
        //then
        assertTrue(Main.isPrime(number));
    }

    @Test
    void isPrime_shouldReturnFalse_WhenCalledWith15() {
        //Given
        int number = 15;
        //then
        assertTrue(Main.isPrime(number));
    }

    //TDD Red -> Green -> Refactor
    @Test
    void fizzBuzz_shouldReturnFizz_whenNumberIs3() {
        //Given
        String excepted = "Fizz";
        int n = 3;
        //When
        String actual = Main.fizzBuzz(n);
        //Then
        assertEquals(excepted, actual);
    }

    //TDD Red -> Green -> Refactor
    @Test
    void reverseString_shouldReturnCorrectResult() {
        //Given
        String text = "Java Bootcamp";
        String excepted = "pmactooB avaJ";
        //When
        String actual = Main.reverseString(text);
        //Then
        assertEquals(excepted, actual);
    }
}