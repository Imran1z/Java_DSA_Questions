package com.shaikh;

public class GCDandLCM {
    public static void main(String[] args) {
        GCD(36,24);
    }
    static void GCD(int num1,int num2){
        int originalnum1=num1;
        int originalnum2=num2;
        while (num1%num2!=0){
            int rem=num1%num2;
            num1=num2;
            num2=rem;
        }
        int GCD=num2;
        System.out.println("GCD is: "+GCD);
        LCM(originalnum1,originalnum2,GCD);
    }
    static void LCM(int num1,int num2,int G){
        int LCM=(num1*num2)/G;
        System.out.println("LCM is: "+LCM);
    }
}
