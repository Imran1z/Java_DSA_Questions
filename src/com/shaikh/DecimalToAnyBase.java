package com.shaikh;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        int num =anytodec(172,8);
       int num2= dectoany(num,2);
        System.out.println(num);
        System.out.println(num2);


    }
    static int dectoany(int num,int base){
        int  rev=0;
        int power=0;
        while (num>0){
            int rem=num%base;
            rev=rev+rem*(int)(Math.pow(10,power));
            num=num/base;
            power++;
        }
        return rev;
    }
    static int anytodec(int num,int base){
        int  rev=0;
        int power=0;
        while (num>0){
            int rem=num%10;
            rev=rev+rem*(int)(Math.pow(base,power));
            num=num/10;
            power++;
        }
        return rev;
    }

}
