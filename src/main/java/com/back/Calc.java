package com.back;

public class Calc {

    public static int run(String exp) {


        if(exp.contains(" + ")) {
            String[] expBits = exp.trim().split(" \\+ ");
            int result = 0;
            for(String i : expBits) {
                if(i.contains(" - "))
                    result += run(i);
                else
                    result += Integer.parseInt(i);
            }
            return result;
        } else if(exp.contains(" - ")) {
            String[] expBits = exp.trim().split(" - ");
            int result = 0;
            for(int i=0; i<expBits.length; i++)
                result += Integer.parseInt(expBits[i]) * (i == 0 ? 1 : -1);
            return result;
        } else if(exp.contains(" * ")) {
            String[] expBits = exp.trim().split(" \\* ");
            int result = 1;
            for(int i=0; i<expBits.length; i++)
                result *= Integer.parseInt(expBits[i]);
            return result;
        }
        return 0;
    }
}
