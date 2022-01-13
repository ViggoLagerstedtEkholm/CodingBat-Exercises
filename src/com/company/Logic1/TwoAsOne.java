package com.company.Logic1;

public class TwoAsOne {
    public boolean twoAsOne(int a, int b, int c) {
        boolean abEQc = a + b == c;
        boolean bcEQa = b + c == a;
        boolean acEQb = a + c == b;
        return bcEQa || acEQb || abEQc;
    }
}
