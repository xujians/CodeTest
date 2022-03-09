# CodeTest

#### 本demo介绍
* 包含2个功能，删除和替换相同的字符串
* 使用了策略模式，继承、多态，递归
* 使用Maven构建
* 使用JUnit做单元测试，测试用例为随机生成的字符串，可生成指定个数
* 使用Lambda var
* 程序入口为 EntranceOfRemove 和 EntranceOfReplace

![code_test.png](https://www.paperkite.net/img/code_test.png)

#### 思路
* 在字符串中，对字符两两比较
* 记录当前字符 currentChar<br/>
    下一个字符 nextChar<br/>
    与当前字符相同的字符的个数 identicalNum，默认为1
* 比较currentChar nextChar
  + currentChar == nextChar
    - identicalNum++
    - 如果nextChar是最后一个字符，判断identicalNum是否大等于3，是的话，将该字符组成的字符串保存至list
  + currentChar != nextChar
    - 判断identicalNum是否大等于3，是的话，将该字符组成的字符串保存至list
    - identicalNum重置为1
* 获得相同的字符的字符串的list，在原有的字符串中将它们去除，或替换

