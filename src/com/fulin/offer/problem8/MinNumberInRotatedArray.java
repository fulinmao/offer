package com.fulin.offer.problem8;

/**
 * 把一个数组最开始的若干个元素搬到数组的尾部，称之为数组的旋转
 * <p>
 * 输入一个递增排序的数组的一个旋转  输出旋转数组的最小元素。】
 * <p>
 * 例如：{3,4,5,1,2}   该数组的最小值为1
 * <p>
 * Created by fulin on 17-2-17.
 */
public class MinNumberInRotatedArray {

    public static void main(String[] args) {
//        int[] nums = {3,4,5,1,2};
//         int[] nums = {1,0,1,1,1};
        int[] nums = {1, 1, 1, 0, 1};
        int result = minNumberInRotateArray(nums);
        System.out.println(result);
    }


    public static int minNumberInRotateArray(int[] array) {
        // 如果数组长度为0，则返回0
        if (array == null || array.length == 0) {
            return 0;
        }
        int start = 0;                 // 寻找前部分的最大值
        int end = array.length - 1;    //后部分的最小值
        int middle = start;            //如果该数字没有旋转数组，

        while (array[start] >= array[end]) {
            if (end - start == 1) {
                // start 指向前部分的最大值，end指向后部分的最小值
                // 即 这两个值的差值为1的情况，end指向的值为最小值
                middle = end;
                return array[middle];
            }
            middle = start + (end - start) / 2;

            // 需要考虑一种特殊情况 1 0 1 1 1 1  或者  1 1 1 1 0 1
            // 这个情况，start end middle 三个指向的值完全相等下，无法确定怎么缩小查找范围
            // 对于这种情况，只能使用顺序查找的方式
            if (array[start] == array[end] && array[start] == array[middle] && array[middle] == array[end]) {
                return midInOrder(array, start, end);
            }

            if (array[start] <= array[middle]) {
                start = middle;
            } else if (array[start] >= array[middle]) {
                end = middle;
            }

        }
        return array[middle];
    }

    /**
     * 查找数组指定序列的最小值
     *
     * @param array
     * @param start
     * @param end
     * @return
     */
    public static int midInOrder(int[] array, int start, int end) {
        int result = array[start];
        for (int i = start + 1; i <= end; i++) {
            if (result > array[i]) {
                result = array[i];
            }
        }
        return result;
    }

}
