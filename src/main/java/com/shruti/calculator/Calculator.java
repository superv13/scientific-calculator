package com.shruti.calculator;

public class Calculator {
    public double sqrt(double a) {
        if(a<0)
            throw new IllegalArgumentException("Cannot compute square root of negative number");
        return Math.sqrt(a);
    }

    public long factorial(int n) {
        if(n<0)
            throw new IllegalArgumentException("Cannot compute factorial of negative number");
        long result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public double naturalLog(double a) {
        if(a<=0)
            throw new IllegalArgumentException("Cannot compute natural log of non-positive number");
        return Math.log(a);
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }
}
