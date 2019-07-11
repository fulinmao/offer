package com.fulin.offer.problem9;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 毛福林
 * @title: FibonacciTest
 * @projectName offer
 * @description: TODO
 * @date 2019/7/1120:11
 */
public class FibonacciTest {

    @Test
    public void fibonacci() {
        int n = 40;
        int[] result = {0,
                1,
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

        for(int i=0;i<=n;i++){
            int rtn = Fibonacci.fibonacci(i);
            if(result[i] != rtn){
                errorCount ++;
                System.out.println("n:"+i+",rtn:"+rtn+"result:"+result[i]);
            }
        }
        assert errorCount/40 == 0;
    }

    @Test
    public void fibonacci2() {
        int n = 40;
        int[] result = {0,
                1,
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

        for(int i=0;i<=n;i++){
            int rtn = Fibonacci.fibonacci2(i);
            if(result[i] != rtn){
                errorCount ++;
                System.out.println("n:"+i+",rtn:"+rtn+"result:"+result[i]);
            }
        }
        assert errorCount/40 == 0;
    }

    @Test
    public void fibonacci3() {
        int n = 40;
        int[] result = {0,
                1,
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

        for(int i=0;i<=n;i++){
            int rtn = Fibonacci.fibonacci3(i);
            if(result[i] != rtn){
                errorCount ++;
                System.out.println("n:"+i+",rtn:"+rtn+"result:"+result[i]);
            }
        }
        assert errorCount/40 == 0;
    }
}