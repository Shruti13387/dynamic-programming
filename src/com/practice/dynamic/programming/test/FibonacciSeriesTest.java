package com.practice.dynamic.programming.test;

import com.practice.dynamic.programming.src.FibonacciSeries;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSeriesTest {

    @org.junit.jupiter.api.Test
    void fibonacciForSix() {
        Long result = FibonacciSeries.fibonacci(6, new HashMap<>());
        System.out.println("Fibonacci number at "+6+" position is : "+result);
        assertEquals(8, result);
    }

    @org.junit.jupiter.api.Test
    void fibonacciForTen() {
        Long result = FibonacciSeries.fibonacci(10, new HashMap<>());
        System.out.println("Fibonacci number at "+10+" position is : "+result);
        assertEquals(55, result);
    }


    @org.junit.jupiter.api.Test
    void fibonacciForFiftyFive() {
        Long result = FibonacciSeries.fibonacci(55, new HashMap<>());
        System.out.println("Fibonacci number at "+55+" position is : "+result);
        assertEquals(139583862445L, result);
    }
}