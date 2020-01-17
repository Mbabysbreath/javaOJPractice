package day.day3;

import day.day2.Soultion3;

/**
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。
 * @author zhaomin
 * @date 2020/1/15 15:36
 */
public class Solution1 {
    public int lengthOfLastWord(String s) {
        if(s.length()==0||s==null){
            return 0;
        }
        String[] str=s.split(" ");
        if(str.length==0){
            return 0;
        }
        return str[str.length-1].length();
    }

    public static void main(String[] args) {
        Solution1 s=new Solution1();
        System.out.println(s.lengthOfLastWord("Hello world"));
    }
}
