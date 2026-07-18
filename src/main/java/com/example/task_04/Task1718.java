package com.example.task_04;

public class Task1718 {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        System.out.println(GCDiter(a, b));
        System.out.println(GCDrec(a, b));
    }

    public static int GCDiter(int a, int b){
        while(b!=0){
            int currentGCB = b;
            b = a % b;
            a = currentGCB;
        }
        return a;
    }

    public static int GCDrec(int a, int b){
        if(b==0){
            return a;
        }
        return GCDrec(b, a%b);
    }
}
