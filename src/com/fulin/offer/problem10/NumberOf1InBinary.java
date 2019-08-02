package com.fulin.offer.problem10;

/**
 * Created by fulin on 17-2-19.
 */
public class NumberOf1InBinary {


    public static int numberof1InBinary(int n){
        int result = 0;

        while(n != 0){
            n = n & (n -1);
            result ++;
        }

        return result;
    }
}
