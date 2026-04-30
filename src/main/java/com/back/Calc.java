package com.back;

public class Calc {

    public static int run(String exp) {
        if(exp.contains("+")) {
            String[] n = exp.trim().split(" \\+ ");
            return Integer.parseInt(n[0])+Integer.parseInt(n[1]);
        } else if(exp.contains("-")) {
            String[] n = exp.trim().split(" - ");
            return Integer.parseInt(n[0])-Integer.parseInt(n[1]);
        }
        return 0;
    }
}
