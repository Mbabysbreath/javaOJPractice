package day.day2;

import java.util.ArrayList;
/**
 * 判断magazine中的字母能否组成ransomNote中的字符串
 * @author zhaomin
 * @date 2020/1/14 14:10
 */
public class Solution2 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        char[] ch=ransomNote.toCharArray();
        char[] ch1=magazine.toCharArray();
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<ransomNote.length();i++){
            list.add(ch[i]);
        }
        for(int i=0;i<magazine.length();i++){
            if(list.contains(ch1[i])){
                list.remove((Character) ch1[i]);
            }
        }
        if(list.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Solution2 s=new Solution2();
        String s1="abca";
        String s2="bdeaowac";
        System.out.println(s.canConstruct(s1,s2));
    }
}
