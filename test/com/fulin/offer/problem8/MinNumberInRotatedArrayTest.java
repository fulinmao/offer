package com.fulin.offer.problem8;

import com.fulin.utils.ArrayUtils;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 毛福林
 * @title: MinNumberInRotatedArrayTest
 * @projectName offer
 * @description: TODO
 * @date 2019/7/919:55
 */
public class MinNumberInRotatedArrayTest {

    @Test
    public void minNumberInRotateArray() {
        int[][] nums = {{1,0,1,1,1,1},{1,1,1,1,0,1},{1,2,3,4,5},{3,4,5,1,2},{6501,6828,6963,7036,7422,7674,8146,8468,8704,8717,9170,9359,9719,9895,9896,9913,9962,154,293,334,492,1323,1479,1539,1727,1870,1943,2383,2392,2996,3282,3812,3903,4465,4605,4665,4772,4828,5142,5437,5448,5668,5706,5725,6300,6335}};
        int[] result = {0,0,1,1,154};
        float errorCount = 0;
        for(int i=0;i< nums.length;i++){
            int rtn = MinNumberInRotatedArray.minNumberInRotateArray(nums[i]);
            if(result[i] != rtn){
                errorCount ++;
                System.out.println("=======================================================");
                ArrayUtils.printArray(nums[i]);
                System.out.println("预期值："+result[i]+",实际值："+ rtn +"\t");
                System.out.println("=======================================================");
            }
        }
        assert errorCount/nums.length == 0.0;
    }
}