package com.xujian.demo;

/**
 * 将要操作的字符串，包括：
 *      将要删除的字符串
 *      将要替换的字符串
 */
public abstract class StringOfOperate {

    // 修改字符的行为
    CharsModificationBehavior charsModificationBehavior;

    /**
     * 执行修改，包含删除、替换
     * @param inputString 输入的字符串
     */
    public void executeModification(String inputString) {
        charsModificationBehavior.modify(inputString);
    }

    /**
     * 显示一些提示的信息
     */
    public abstract void display(String inputString);

}
