package com.xujian.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

/**
 * 公共方法
 */
public class Common {

    /**
     * 获取相同字符组成的字符串的列表
     * @param inputString 输入的字符串
     * @return 字符串列表
     */
    public static ArrayList<String> fetchIdenticalCharsList(String inputString) {

        // 与当前字符 相同的字符的 个数
        int deinticalNum = 1;
        // 相同的字符的总个数，大于等于3个时，会被放入队列
        int limitNum = 3;
        // 存放相同的字符的列表
        ArrayList<String> identicalCharsList = new ArrayList();

        // 遍历，对字符串中的串两两比较
        for (int i = 0; i < inputString.length() - 1; i++) {
            char currentChar = inputString.charAt(i);
            char nextChar = inputString.charAt(i + 1);
            if (currentChar == nextChar) {
                // 当前字符与下一个字符相同，相同的字符个数加1
                deinticalNum++;
                // 如果下一个字符是字符串中最后一个字符，并且相同的字符大于3时，将相同的字符放入列表
                if ((i + 1) == (inputString.length() - 1) && deinticalNum >= limitNum) {
                    StringBuffer identicalChars = new StringBuffer();
                    for (int j = 0; j < deinticalNum; j++) {
                        identicalChars.append(currentChar);
                    }
                    identicalCharsList.add(identicalChars.toString());
                }
            } else {
                // 两两比较，当两个字母不同时，比较相同的字符是否大等于3，是的话，将相同的字符放入列表
                if (deinticalNum >= limitNum) {
                    StringBuffer identicalChars = new StringBuffer();
                    for (int j = 0; j < deinticalNum; j++) {
                        identicalChars.append(currentChar);
                    }
                    identicalCharsList.add(identicalChars.toString());
                }
                // 将相同的字符的个数重置为1
                deinticalNum = 1;
            }
        }

        return identicalCharsList;
    }

    /**
     * 校验输入
     * @param input 输入的字符串
     * @return true|false
     */
    public static boolean checkInput(String input) {
        boolean checkflag = false;
        String pattern = "([a-z]){0,}";
        if (input != null && input.length() > 0 && Pattern.matches(pattern, input)) {
            checkflag = true;
        }
        return checkflag;
    }

    /**
     * 随机的字符串列表生成器
     * @param num 列表长度
     * @return 字符串列表
     */
    public static List<String> randomStringListGenerator(int num) {
        List<String> list = new ArrayList(num);
        for (int i = 0; i < num; i++) {
            list.add(randomStringGenerator());
        }
        return list;
    }

    /**
     * 随机字符串生成器
     * @return 字符串
     */
    public static String randomStringGenerator() {

        String[] letters = {"a", "b", "c", "d", "e", "f", "g",
                "h", "i", "j", "k", "l", "m", "n",
                "o", "p", "q", "r", "s", "t",
                "u", "v", "w", "x", "y", "z"};
        Random random = new Random();

        // 产生一个15个字符以内的随机的字符串 [0,15)
        int strLength = random.nextInt(15) + 1;
        StringBuffer strBuffer = new StringBuffer();
        for (int i = 0; i < strLength; i++) {
            strBuffer.append(letters[random.nextInt(letters.length)]);
        }

        // 随机产生一个相同字符的字符串
        // 随机字母
        String sameLetter = letters[random.nextInt(letters.length)];
        // 随机长度 3-5之间 [0,3)
        int sameLength = random.nextInt(3) + 3;
        // 相同字符的字符串
        StringBuffer sameStrBuffer = new StringBuffer();
        for (int i = 0; i < sameLength; i++) {
            sameStrBuffer.append(sameLetter);
        }

        // 将相同的字符串插入随机字符串中
        // 随机位置
        int randomIndex = random.nextInt(strLength);
        strBuffer.insert(randomIndex, sameStrBuffer);

        return strBuffer.toString();
    }

}
