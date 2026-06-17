package com.example.task_07_enum;

import java.time.Month;

public class Currencies {
    public enum Currency{
        PLN("zł"),
        USD("$"),
        EUR("€");

        final String symbol;

        Currency(String symbol) {
            this.symbol = symbol;
        }

        public String getSymbol() {
            return this.symbol;
        }
    }

    static void main(String[] args) {
        for(Currency currency : Currency.values()){
            System.out.println(currency);
            System.out.println(currency.getSymbol());
        }
    }
}
