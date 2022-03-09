package com.xujian.demo;

import java.util.ArrayList;

/**
 * 从字符串中移除相同的字符
 */
public class RemoveChars implements CharsModificationBehavior {

    /**
     * 在字符串中，删除连续的3个及以上数量的相同的字符
     * @param inputString 输入的字符串
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
        // 遍历，将相同字符的字符串删除
        for (int i = 0; i < identicalCharsList.size(); i++) {
            inputString = inputString.replace(identicalCharsList.get(i), "");
        }

        // 递归
        if (recursionFlag) {
            System.out.println("-> " + inputString);
            modify(inputString);
        }
    }

}
