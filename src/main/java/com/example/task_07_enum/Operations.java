package com.example.task_07_enum;

import jdk.dynalink.Operation;

public class Operations {
    public enum Operation {
        ADD{
            @Override
            public int calculate(int a, int b){
                return a+b;
            }
        },
        SUBTRACT{
            @Override
            public int calculate(int a, int b){
                return a-b;
            }
        },
        MULTIPLY{
            @Override
            public int calculate(int a, int b){
                return a*b;
            }
        },
        DIVIDE{
            @Override
            public int calculate(int a, int b){
                if(b==0){
                    throw new ArithmeticException("Divide by zero");
                }else {
                    return a/b;
                }

            }
        };

        public abstract int calculate(int a, int b);
    }
    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        for (Operation op : Operation.values()){
            int result = op.calculate(a, b);
            System.out.println("Operation: " + op.name() + " " + result);
        }
    }
}

