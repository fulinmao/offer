package com.fulin.offer.problem9;

/**
 * @author 毛福林
 * @title: RectCover
 * @projectName offer
 * @description: TODO
 * @date 2019/7/3020:31
 */
public class RectCover {
    public static int rectCover(int target) {
        if(target == 0){
            return 0;
        }
        int first = 1;
        if(target == 1){
            return first;
        }
        int second = 2;
        if(target == 2){
            return second;
        }
        for(int i= 3 ;i<= target;i++){
            first = first + second;
            int temp = second;
            second = first;
            first = temp ;
        }

        return second;
    }
}
