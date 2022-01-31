package dev.paie;

import java.math.BigDecimal;

public class DemoBigDecimal {

    public static void main(String[] args) {

        double n1 = 1.0;
        double n2 = 0.9;

        double resultat1 = n1 - n2;

        System.out.println(resultat1);

        BigDecimal b1 = BigDecimal.valueOf(1.0);
        BigDecimal b2 = new BigDecimal("0.9");
        BigDecimal resultat2 = b1.subtract(b2);

        System.out.println(resultat2);

    }
}
