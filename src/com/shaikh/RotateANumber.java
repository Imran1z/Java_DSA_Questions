package com.shaikh;

import java.util.Scanner;

public class RotateANumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num= sc.nextInt();
        int k=sc.nextInt();

        System.out.println(rotate(num,k));


    }
    static int rotate(int number,int k){
        int numberOfDigits=(int)(Math.log10(number))+1;

        k=k%numberOfDigits;
        if(k<0){
            k=k+numberOfDigits;
        }
        int divisor=1;
        int multiplier=1;

        for (int i = 1; i <=numberOfDigits; i++) {
            if (i<=k){
                divisor=divisor*10;
            }
            else{
                multiplier=multiplier*10;
            }

        }
        int qutient=number/divisor;
        int remainder=number%divisor;
        int rotatedNumber=remainder*multiplier + qutient;
        return rotatedNumber;


    }
}
