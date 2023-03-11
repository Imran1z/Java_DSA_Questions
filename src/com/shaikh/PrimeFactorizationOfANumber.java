package com.shaikh;

public class PrimeFactorizationOfANumber {
    public static void main(String[] args) {
        int num=1440;

        for (int div = 2; div*div <=num ; div++) {
            while(num%div==0){
                System.out.print(div+" ");
                num=num/div;}
        }
        if (num!=1){
            System.out.print(num);
        }

        }

    }

