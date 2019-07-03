package com.fulin.offer.problem5;

import com.fulin.utils.ListNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 输入一个链表的头结点，从尾到头打印出每一个i哦节点的值
 * <p>
 * 例如：输入 2 -> 3 -> 5 -> 7
 * <p>
 * 输出：7 -> 5 -> 3 -> 2
 * Created by fulin on 17-2-9.
 */
public class PrintListNodeReverse {

    public static void main(String[] args) {
        ListNode list = new ListNode(2);
        list.next = new ListNode(3);
        list.next.next = new ListNode(5);
        list.next.next.next = new ListNode(7);
        ArrayList<Integer> result = printListNodeReverse(list);
        for (Integer t : result) {
            System.out.println(t + ",\t");
        }
    }

    public static ArrayList<Integer> printListNodeReverse(ListNode list) {
        if (list == null) {
            return new ArrayList<Integer>();
        }
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode head = list;
        while (head != null) {
            stack.add(head);
            head = head.next;
        }
        ArrayList<Integer> result = new ArrayList<>();
        while (!stack.isEmpty()) {
            ListNode temp = stack.pop();
            result.add(temp.val);
        }
        return result;
    }


}

