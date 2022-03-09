package com.xujian.demo;

/**
 * 替换操作的入口
 * 替换连续的 3个及以上数量的 相同的字符
 * 替换规则：
 *      按字典顺序，替换成该字母的前一个字母
 *      如果该字母是"a"，则替换成空串
 */
public class EntranceOfReplace {

    public static void main(String[] args) {
        // 输入
        var input = "abcccbadinksdv";
        if (!Common.checkInput(input)) {
            System.out.println("error: " + input + " 格式错误");
            return;
        }
        // 字符串要执行的操作是 替换
        StringOfOperate stringOfOperate = new StringOfReplace();
        // 显示提示信息
        stringOfOperate.display(input);
        // 执行操作
        stringOfOperate.executeModification(input);
    }

}
