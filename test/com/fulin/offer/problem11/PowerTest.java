package com.fulin.offer.problem11;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 毛福林
 * @title: PowerTest
 * @projectName offer
 * @description: TODO
 * @date 2019/8/619:51
 */
public class PowerTest {

    @Test
    public void power1() {
        double base = 2;
        int exponent = -3;
        double result = Power.power(base,exponent);
        assert 0.125 == result;
    }
}