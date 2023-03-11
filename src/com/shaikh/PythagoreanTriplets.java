package com.shaikh;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        boolean result= trip(3,4,5);
        System.out.println(result);

    }
    static boolean trip(int num1,int num2,int num3){

        int H=Math.max(num3,(Math.max(num1,num2)));
        //System.out.println(H);

        if (H==num1){
            if (H*H==(num2*num2)+(num3*num3)){
                return true;
            }

        }
        else if (H==num2){
            if (H*H==(num1*num1)+(num3*num3)){
                return true;
            }

        }
        else {
            if (H*H==(num1*num1)+(num2*num2)){
                return true;
            }

        }
        return false;
    }
}
