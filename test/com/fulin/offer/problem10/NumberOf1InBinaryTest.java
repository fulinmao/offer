package com.fulin.offer.problem10;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 毛福林
 * @title: NumberOf1InBinaryTest
 * @projectName offer
 * @description: TODO
 * @date 2019/8/29:43
 */
public class NumberOf1InBinaryTest {

    public static int count1Number(String t){
        int result = 0;
        for(char temp: t.toCharArray()){
            result += (temp - 48);
        }
        return result;
    }

    @Test
    public void numberof1InBinary() {
        int n = -10;
        int result = NumberOf1InBinary.numberof1InBinary(n);
        System.out.println("num:"+ n + " bin: " + Integer.toBinaryString(n)+" nums of 1:"+result+" actual:"+ count1Number(Integer.toBinaryString(n)));
        assert count1Number(Integer.toBinaryString(n)) == result;
    }
}