package com.fulin.offer.problem9;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 毛福林
 * @title: JumpFloorTest
 * @projectName offer
 * @description: TODO
 * @date 2019/7/1221:14
 */
public class JumpFloorTest {

    @Test
    public void jumpFloor() {
        int n = 40;
        int[] result = {0,
                1,
                2,
                3,
                5,
                8,
                13,
                21,
                34,
                55,
                89,
                144,
                233,
                377,
                610,
                987,
                1597,
                2584,
                4181,
                6765,
                10946,
                17711,
                28657,
                46368,
                75025,
                121393,
                196418,
                317811,
                514229,
                832040,
                1346269,
                2178309,
                3524578,
                5702887,
                9227465,
                14930352,
                24157817,
                39088169,
                63245986,
                102334155,
                165580141,
                267914296,
                433494437,
                701408733};
        float errorCount = 0.0F;
        for(int i=0;i<n;i++){
            int rtn = JumpFloor.jumpFloor(i);
            if(rtn != result[i]){
                errorCount ++;
                System.out.println("n:"+i+",rtn:"+rtn+"result:"+result[i]);
            }

        }
        assert errorCount/40 == 0;
    }
}