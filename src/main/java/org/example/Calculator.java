package org.example;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
    public double wurzel (double a){
        return Math.sqrt(a);
    }
    public double square (double a){
        return a*a;

    }
    public double sin(double a) {
        return Math.sin(a);
    }
    public double cos(double a) {
        return Math.cos(a);
    }
}
