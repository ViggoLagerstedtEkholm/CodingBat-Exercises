package com.company.Logic1;

public class NearTen {
    public boolean nearTen(int num) {
        int diff = num % 10;
        return diff <= 2 || diff >= 8;
    }
}
