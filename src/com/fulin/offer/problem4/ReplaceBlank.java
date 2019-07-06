package com.fulin.offer.problem4;

/**
 * 实现一个函数 把字符串的中的所有空格替换为%20
 * <p>
 * 例如： We are Happy.
 * 输出：We%20are%20Happy.
 *
 * @author mfl4482
 */
public class ReplaceBlank {

    public static void main(String[] args) {
        String str = "We are Happy.";
        String target = "%20";
        System.out.println(replaceBlank(str, target));
    }

    public static String replaceBlank(String str, String target) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int length = 0;
        if (target == null || target.length() == 0) {
            // 删除所有的空格
            length = 0;
        } else {
            length = target.length();
        }
        int count = 0;
        int lastIndex = 0;
        char[] strArray = str.toCharArray();
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i] == ' ') {
                count++;
                lastIndex = i;
            }
        }
        int oldLength = strArray.length;
        int newLength = oldLength + count * (length - 1);
        if (newLength > strArray.length) {
            char[] temp = strArray;
            strArray = new char[newLength];
            System.arraycopy(temp, 0, str, 0, temp.length);
        }

        int copyLength = oldLength - lastIndex - 1;
        int updateIndex = newLength - copyLength;
        System.arraycopy(str, lastIndex + 1, str, updateIndex, copyLength);
        copyLength = target.length();
        updateIndex = updateIndex - copyLength;
        System.arraycopy(target.toCharArray(), 0, str, updateIndex, target.length());
        for (int i = lastIndex - 1; i >= 0; i--) {
            if (strArray[i] == ' ') {
                copyLength = lastIndex - i - 1;
                updateIndex = updateIndex - copyLength;
                System.arraycopy(str, i + 1, str, updateIndex, copyLength);
                copyLength = target.length();
                updateIndex = updateIndex - copyLength;
                System.arraycopy(target.toCharArray(), 0, str, updateIndex, target.length());
                lastIndex = i;
            }
        }
        return new String(strArray);
    }
}