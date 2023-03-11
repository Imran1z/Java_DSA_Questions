package com.shaikh;

public class InverseOfANumber {
    public static void main(String[] args) {
        System.out.println(Inv(521897634));

    }
    static int Inv(int n){
        int originalPlace=1;
        int inv=0;
        while (n!=0){
            int originalDigit=n%10;
            int inversePlace=originalDigit;
            int inverseDigit=originalPlace;
            inv=inv+inverseDigit*(int)Math.pow(10,inversePlace-1);

            n=n/10;
            originalPlace++;

        }
        return inv;
    }
}
