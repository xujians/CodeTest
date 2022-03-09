package com.xujian.demo;

/**
 * 将要替换的字符串
 */
public class StringOfReplace extends StringOfOperate {

    /**
     * 使用替换的行为
     */
    public StringOfReplace() {
        charsModificationBehavior = new ReplaceChars();
    }

    public void display(String inputString) {
        System.out.println("notice: 将会替换 连续的 3个及以上数量的 相同的字符，替换成字典顺序的前一个字母，例如：bbb->a，ccc->b");
        System.out.println("input: " + inputString);
        System.out.println("output: ");
    }

}
