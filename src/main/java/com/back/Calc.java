package com.back;

public class Calc {

    public static int run(String exp) {


        if(exp.contains("+")) {
            String[] expBits = exp.trim().split(" \\+ ");
            int result = 0;
            for(String i : expBits)
                result += Integer.parseInt(i);
            return result;
        } else if(exp.contains("-")) {
            String[] expBits = exp.trim().split(" - ");
            int result = 0;
            for(int i=0; i<expBits.length; i++)
                result += Integer.parseInt(expBits[i]) * (i == 0 ? 1 : -1);
            return result;
        }
        return 0;
    }
}
