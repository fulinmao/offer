package com.fulin.offer.problem4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceBlankTest {

    @Test
    public void replaceBlank() {
        String[] str = {null,"","We Are Happy"};
        String[] result = {null,"","We%20Are%20Happy"};
        String target = "%20";
        float count = 0.0F;
        for(int i = 0; i< str.length;i++){
            String rtn = new String(ReplaceBlank.replaceBlank(str[i],target));
            if(result[i].equals(rtn)){
                count ++;
            }else{
                System.err.print("str:"+str[i] +",实际结果:"+rtn+"，预期结果："+result[i]);
            }
        }
        System.out.print("正确率："+count / str.length);
    }
}