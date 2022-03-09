package com.xujian.demo;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class EntranceOfReplaceTest {

    @Test
    public void main() {
        // 随机生成多少个字符串
        var strNum = 8;
        // 随机字符串列表
        List<String> randomStringList = Common.randomStringListGenerator(strNum);
        // 遍历 替换操作
        randomStringList.forEach(n -> {
            business(n);
            System.out.println();
        });
    }

    public void business(String input) {
        // 校验
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