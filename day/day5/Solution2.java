package day.day5;

import java.util.Stack;

/**
 * 给定一个字符串 S，返回 “反转后的” 字符串，
 * 其中不是字母的字符都保留在原地，而所有字母的位置发生反转。
 * @author zhaomin
 * @date 2020/1/17 17:27
 */
public class Solution2 {
    public String reverseOnlyLetters(String S) {
        Stack stack=new Stack();
        char[] ch=S.toCharArray();
        for(int i=0;i<S.length();i++){
            if(ch[i]>='A'&&ch[i]<='Z'||ch[i]>='a'&&ch[i]<='z'){
                stack.push(ch[i]);
            }
        }
        for(int i=0;i<S.length();i++){
            if (ch[i] >= 'A' && ch[i] <= 'Z' || ch[i] >= 'a' && ch[i] <= 'z') {
                char c=(char)stack.pop();
                ch[i] = c;
            }
        }
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        Solution2 s=new Solution2();
        String str="bjyxszd&&coolguy**zanzan";
        System.out.println(s.reverseOnlyLetters(str));
    }
}
