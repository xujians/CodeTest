package com.xujian.demo;

/**
 * 删除操作的入口
 * 删除连续的 3个及以上数量的 相同的字符
 */
public class EntranceOfRemove {

    public static void main(String[] args) {
        // 输入
        var input = "abeeedfffddsfwwwww";
        if (!Common.checkInput(input)) {
            System.out.println("error: " + input + " 格式错误");
            return;
        }
        // 字符串要执行的操作是 删除
        StringOfOperate stringOfOperate = new StringOfRemove();
        // 显示提示信息
        stringOfOperate.display(input);
        // 执行操作
        stringOfOperate.executeModification(input);
    }

}
