package com.github.gdl;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {

    public static void main(String args[]) {
        System.out.println("Static method");

        String billerId = "";
        String ref1 = "";
        String ref2 = "";
        BigDecimal amount = BigDecimal.ONE;


        StringBuilder builder = new StringBuilder();
        builder.append("|");
        builder.append(billerId);
        builder.append("\n");
        builder.append(ref1);
        builder.append("\n");
        if (ref2 != null) {
            builder.append(ref2);
        }
        builder.append("\n");

        if (amount != null) {
            builder.append(amount.multiply(BigDecimal.valueOf(100)).setScale(0, RoundingMode.DOWN));
        } else {
            builder.append(0);
        }
        builder.toString();

        System.out.println(builder.toString());

    }


}
