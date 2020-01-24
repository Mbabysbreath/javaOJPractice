package day.day10;

import day.day8.Solution2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author zhaomin
 * @date 2020/1/22 11:57
 */
public class Solution1 {
    public boolean isPalindrome(String s) {
        if(s.length()==0){
            return true;
        }
       String s1= s.toLowerCase();
        List<Character> list=new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            if((c>='0'&&c<='9')||(c>='a'&&c<='z')||(c>='A'&&c<='Z')){
                list.add(c);
            }
        }

        for(int i=0,j=list.size()-1;i<j;i++,j--){
            if(list.get(i)!=list.get(j)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution1 s=new Solution1();
        String str="A man, a plan, a canal: Panama";
        System.out.println(s.isPalindrome(str));
    }
}
