package com.fulin.offer.problem6;

import com.fulin.utils.TreeNode;

public class ConstructBinaryTree1 {
    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null || pre.length != in.length) {
            return null;
        }
        TreeNode tree = new TreeNode(pre[0]);
        int index = findTreeNodeInArray(in, pre[0], 0, in.length - 1);
        if (index < 0) {
            return null;
        }
        int pLeftStart = 1;
        int pLeftEnd = index;
        int pRightStart = index +1;
        int pRightEnd = pre.length - 1;
        int iLeftStart = 0;
        int iLeftEnd = index - 1;
        int iRightStart = index + 1;
        int iRightEnd = in.length - 1;
        tree.left = constrictbinaryRec(pre, pLeftStart, pLeftEnd, in, iLeftStart, iLeftEnd);
        tree.right = constrictbinaryRec(pre, pRightStart, pRightEnd, in, iRightStart, iRightEnd);
        return tree;
    }

    public static TreeNode constrictbinaryRec(int[] pre, int pStart, int pEnd, int[] in, int iStart, int iEnd) {
        if (pStart > pEnd || iStart > iEnd) {
            return null;
        }
        TreeNode tree = new TreeNode(pre[pStart]);
        int index = findTreeNodeInArray(in, pre[pStart], iStart, iEnd);
        if (index < 0) {
            return null;
        }

        int pLeftStart = pStart+1;
        int pLeftEnd = index - iStart + pStart;
        int pRightStart = pLeftEnd +1;
        int pRightEnd = pEnd;

        int iLeftStart = iStart;
        int iLeftEnd = index - 1;
        int iRightStart = index + 1;
        int iRightEnd = iEnd;

        tree.left = constrictbinaryRec(pre, pLeftStart, pLeftEnd, in, iLeftStart, iLeftEnd);
        tree.right = constrictbinaryRec(pre, pRightStart, pRightEnd, in, iRightStart, iRightEnd);
        return tree;
    }


    // 查找中序遍历中 元素所在的位置
    public static int findTreeNodeInArray(int[] in, int target, int start, int end) {
        int index = -1;
        for (int i = start; i <= end; i++) {
            if (in[i] == target) {
                index = i;
                break;
            }
        }
        return index;
    }
}
