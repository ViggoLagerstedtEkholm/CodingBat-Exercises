package com.company.WarmUp.Simple.missingChar;

public class MissingChar {
    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }
}
