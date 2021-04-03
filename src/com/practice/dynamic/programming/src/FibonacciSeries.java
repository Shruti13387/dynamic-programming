package com.practice.dynamic.programming.src;

import java.util.Map;

public class FibonacciSeries {

    public static Long fibonacci(int n, Map<Integer, Long> memo){
        Long tempSum = 0L;
        if(n <= 2){
            return 1L;
        }

        if(!memo.containsKey(n)){
            tempSum = fibonacci(n-1, memo)+fibonacci(n-2,memo);
            memo.put(n, tempSum);
        }

        return memo.get(n);
    }
}
