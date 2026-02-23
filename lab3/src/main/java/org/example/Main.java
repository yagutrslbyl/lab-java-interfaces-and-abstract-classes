package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        System.out.println("Salam");
    }
    public static double convertDoubleAndRound(BigDecimal number){
        BigDecimal numberRounded=number.setScale(2, RoundingMode.HALF_UP);
        return numberRounded.doubleValue();
    }
    public static BigDecimal reserveSignAndRound(BigDecimal number){
        BigDecimal reserved=number.negate();
        return  reserved.setScale(1,RoundingMode.HALF_UP);
    }
}
