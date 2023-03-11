package com.shaikh;

public class FrequencyOfANumber {
    public static void main(String[] args) {
        System.out.println(Digits(994543234,4));

    }

    static int Digits(int n,int x){
        int count =0;
        while (n!=0){
            int rem=n%10;
            if (rem==x){
                count++;
            }
            n=n/10;
        }
        return count;
    }
}
