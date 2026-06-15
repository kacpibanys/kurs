package com.example.task_07_enum;

import java.math.BigDecimal;
import java.math.MathContext;

public class Task15 {
    public enum Planet {
        //wrzucone w llma zeby wygenerowal wartosci
        MERCURY("3.303e+23", "2.4397e+6"),
        VENUS("4.869e+24", "6.0518e+6"),
        EARTH("5.976e+24", "6.37814e+6"),
        MARS("6.421e+23", "3.3972e+6"),
        JUPITER("1.9e+27", "7.1492e+7"),
        SATURN("5.688e+26", "6.0268e+7"),
        URANUS("8.686e+25", "2.5559e+7"),
        NEPTUNE("1.024e+26", "2.4746e+7");

        private final BigDecimal mass;
        private final BigDecimal radius;

        Planet(String massStr, String radiusStr) {
            this.mass = new BigDecimal(massStr);
            this.radius = new BigDecimal(radiusStr);
        }

        public BigDecimal getDensity() {

            MathContext mc = MathContext.DECIMAL128;

            BigDecimal four = new BigDecimal("4");
            BigDecimal three = new BigDecimal("3");
            BigDecimal pi = new BigDecimal(String.valueOf(Math.PI));

            //v = (4/3) * pi * r^3
            BigDecimal fourThirds = four.divide(three, mc);
            BigDecimal rCubed = radius.pow(3, mc);
            BigDecimal volume = fourThirds.multiply(pi, mc).multiply(rCubed, mc);


            return mass.divide(volume, mc);
        }
        public BigDecimal getMass() {
            return mass;
        }

        public BigDecimal getRadius() {
            return radius;
        }
    }

    static void main() {
        for (Planet p : Planet.values()) {
            System.out.printf("Planeta: %-8s | Masa: %10.3e kg | Promień: %10.3e m | Gęstość: %8.2f kg/m^3%n",
                    p.name(),
                    p.getMass(),
                    p.getRadius(),
                    p.getDensity());
        }
    }
}
