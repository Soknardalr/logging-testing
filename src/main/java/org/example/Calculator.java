package org.example;

import java.util.Arrays;

public class Calculator implements Calc {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        return a / b;
    }

    @Override
    public int[] sortArr(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}
