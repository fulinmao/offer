package com.fulin.offer.problem6;

import com.fulin.utils.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructBinaryTreeTest {

    @Test
    public void constructBinaryTree() {

        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        TreeNode tree = ConstructBinaryTree.constructBinaryTree(pre,in);
        System.out.print(tree.val);
    }
}