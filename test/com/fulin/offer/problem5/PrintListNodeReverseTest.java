package com.fulin.offer.problem5;

import com.fulin.utils.ListNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class PrintListNodeReverseTest {

    @Test
    public void printListNodeReverse() {
        ListNode list = new ListNode(2);
        list.next = new ListNode(3);
        list.next.next = new ListNode(5);
        list.next.next.next = new ListNode(7);
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(7,5,3,2));
        ArrayList<Integer> rtn = PrintListNodeReverse.printListNodeReverse(list);
        for(int i=0;i<result.size() ;i++ ){

            System.out.println("预期值："+result.get(i)+",实际值："+ rtn.get(i) +"\t");
            assert result.get(i) == rtn.get(i);
        }



    }
}