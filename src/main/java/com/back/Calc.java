package com.back;

public class Calc {

    public static int run(String exp) {
        String[] n = exp.trim().split(" \\+ ");

        return Integer.parseInt(n[0])+Integer.parseInt(n[1]);
    }
}
