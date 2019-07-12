package com.fulin.offer.problem9;

/**
 * @author 毛福林
 * @title: JumpFloor
 * @projectName offer
 * @description: TODO
 * @date 2019/7/1220:46
 */
public class JumpFloor {

    public static int jumpFloor(int target) {
        //当target 为0，则有0种方法
        if(target == 0){
            return 0;
        }
        // 当跳上1级的台阶，共有一种方法
        if(target == 1){
            return 1;
        }
        int first = 1;
        int second = 1;
        int result = 0;
        for(int i=2;i <= target;i++){
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }
}
