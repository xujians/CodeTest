package com.xujian.demo;

/**
 * 将要删除的字符串
 */
public class StringOfRemove extends StringOfOperate {

    /**
     * 使用删除的行为
     */
    public StringOfRemove() {
        charsModificationBehavior = new RemoveChars();
    }

    /**
     * 提示信息
     */
    public void display(String inputString) {
        System.out.println("notice: 将会删除 连续的 3个及以上数量的 相同的字符");
        System.out.println("input: " + inputString);
        System.out.println("output: ");
    }

}
