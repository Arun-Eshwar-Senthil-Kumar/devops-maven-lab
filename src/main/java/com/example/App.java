package com.example;

public class App {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        App calculator = new App();

        int result = calculator.add(5, 3);

        System.out.println("Addition Result: " + result);
    }
}