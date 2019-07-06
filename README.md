# offer
剑指offer相关算法


## 问题6 重建二叉树（ [在线编程链接-牛客网](https://www.nowcoder.com/practice/8a19cbe657394eeaac2f6ea9b0f6fcf6) ）
    ### 题目描述:
        输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
        假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
        例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回
    
    ### 解题思路:
        树的基本解题思路都是使用递归的方式解题
        前序遍历序列为 根   左子树 右子树
        中序遍历序列为 左子树 根   右子树
        > 1.前序遍历序列第一个元素为根节点，
        > 2.中序遍历序列中找到该节点值所在的位置，该节点前部分为根的左子树，后部分为根的右子树
        > 3.根据中序遍历序列中左子树的个数和右子树的个数确定前序遍历数列中左子树和右子树的序列部分
        > 4.分别递归左子树的前序遍历序列和中序遍历序列  右子树的前序遍历序列和中序遍历序列
        > 5.直到前序遍历序列和中序遍历序列为空结束遍历
