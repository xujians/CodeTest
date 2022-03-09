package com.xujian.demo;

import java.util.ArrayList;

/**
 * 从字符串中替换相同的字符
 */
public class ReplaceChars implements CharsModificationBehavior {

    /**
     * 在字符串中，替换连续的3个及以上数量的相同的字符
     * 替换规则：
     *      按字典顺序，替换成该字母的前一个字母
     *      如果该字母是"a"，则替换成空串
     *
     * @param inputString 输入的目标字符串
     */
    public void modify(String inputString) {

        // 递归标识，默认为不递归
        boolean recursionFlag = false;
        // 得到input中相同字符的字符串的列表
        ArrayList<String> identicalCharsList = Common.fetchIdenticalCharsList(inputString);
        if (identicalCharsList.size() > 0) {
            recursionFlag = true;
        } else {
            System.out.println("-> " + "该字符串无法再操作");
        }
        // 遍历，将相同字符的字符串替换，替换成该字母的前一个字母，如果该字母是"a",则替换成空串
        for (int i = 0; i < identicalCharsList.size(); i++) {
            String identicalChars = identicalCharsList.get(i);
            char oldChar = identicalChars.charAt(0);
            char newChar = (char) (oldChar - 1);
            String replaceStr = "";
            String resultStr = "empty string";
            if (oldChar != 'a') {
                replaceStr = String.valueOf(newChar);
                resultStr = replaceStr;
            }
            inputString = inputString.replace(identicalChars, replaceStr);
            System.out.println("-> " + inputString + ", " + identicalChars + " is replaced by " + resultStr);
        }

        // 递归
        if (recursionFlag) {
            modify(inputString);
        }
    }

}
