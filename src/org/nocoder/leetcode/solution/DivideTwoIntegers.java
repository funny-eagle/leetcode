package org.nocoder.leetcode.solution;

public class DivideTwoIntegers {
    public static int divide(int dividend, int divisor) {
        if(divisor == 0){
            throw new IllegalArgumentException();
        }
        if(dividend == 0){
            return 0;
        }

        int count = 0;
        int res = 0;

        //  被除数绝对值
        int dividendABS = dividend;
        if(dividend < 0){
            dividendABS = -dividend;
            if(dividend <= -2147483648 && divisor <0){
                dividendABS = Integer.MAX_VALUE;
            }
        }


         // 除数绝对值
        int divisorABS = divisor;
        if(divisorABS == 1){
            count = dividendABS;
        }else{
            if(divisor < 0){
                divisorABS = -divisor;
            }

            res = dividendABS - divisorABS;
            if(res < 0){
                return count;
            }else{
                count = 1;
            }

            while(res >= divisorABS){
                res = res - divisorABS;
                count ++;
            }
        }


        if(dividend < 0 && divisor < 0){
            return count;
        }
        if((divisor < 0 && dividend > 0) || (divisor > 0 && dividend < 0)){
            count = -count;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(divide(2147483647, 1));
        System.out.println(divide(-2147483648, 1));
        System.out.println(divide(1, 2));
        System.out.println(divide(-1, 1));
        System.out.println(divide(7, -3));
    }
}
