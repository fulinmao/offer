package com.fulin.offer.problem9;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 毛福林
 * @title: JumpFloor2Test
 * @projectName offer
 * @description: TODO
 * @date 2019/7/3018:51
 */
public class JumpFloor2Test {

    @Test
    public void jumpFloorII() {
        int n = 10;
        float errorCount = 0.0F;
        int rtn = JumpFloor2.jumpFloorII(0);
        if(rtn != 0){
            errorCount++;
            System.out.println("n:" + 0 + ",rtn:" + rtn + "result:" + 0);
        }
        for (int i = 1; i < n; i++) {
            rtn = JumpFloor2.jumpFloorII(i);
            if (rtn != (int) Math.pow(2, i-1)) {
                errorCount++;
                System.out.println("n:" + i + ",rtn:" + rtn + "result:" + Math.pow(2, i-1));
            }

        }
        assert errorCount / 40 == 0;
    }

    @Test
    public void jumpFloorII2() {
        int n = 10;
        float errorCount = 0.0F;
        long rtn = JumpFloor2.jumpFloorII(0);
        if(rtn != 0){
            errorCount++;
            System.out.println("n:" + 0 + ",rtn:" + rtn + "result:" + 0);
        }
        for (int i = 1; i < n; i++) {
            rtn = JumpFloor2.jumpFloorII2(i);
            if (rtn != (int) Math.pow(2, i-1)) {
                errorCount++;
                System.out.println("n:" + i + ",rtn:" + rtn + "result:" +(int) Math.pow(2, i-1));
            }

        }
        assert errorCount / 40 == 0;
    }
}