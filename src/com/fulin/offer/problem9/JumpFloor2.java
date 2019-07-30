package com.fulin.offer.problem9;

/**
 * @author 毛福林
 * @title: JumpFloor2
 * @projectName offer
 * @description: 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 *              求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @date 2019/7/3018:50
 */
public class JumpFloor2 {

    public static int jumpFloorII(int target) {
        if(target == 0){
            return 0;
        }
        if(target == 1){
            return 1;
        }

        return 2 * jumpFloorII(target - 1);
    }

    /**
     * 通过之前数组的方式求解target,可以看出，
     * target = n时，该值为 2^(n-1)
     * @param target
     * @return
     */
    public static int jumpFloorII2(int target){
        if(target == 0){
            return 0;
        }
        if(target == 1){
            return 1;
        }
        return 1 << (target - 1);
    }
}
