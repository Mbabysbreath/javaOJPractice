package day.day4;

import java.util.*;

/**
 * 你将会检查键盘输入的字符 typed。
 * 如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），
 * 那么就返回 True。
 * @author zhaomin
 * @date 2020/1/17 0:13
 */
public class Solution2 {
    public int lengthDuplicated(List list,char c){
        int j=0;
        if(!list.isEmpty()){
            while (c == (char) list.get(0)) {
                j++;
                list.remove(0);
                if (list.isEmpty()) {
                    break;
                }
            }
        }
        return j;
    }
    public boolean isLongPressedName(String name, String typed) {
        if(name.equals(typed)==true){
            return true;
        }
        char[] ch1=name.toCharArray();
        char[] ch2=typed.toCharArray();
        List list=new ArrayList();
        List list1=new ArrayList();
        for(char c:ch1){
            list.add(c);
        }
        for(char c:ch2){
            list1.add(c);
        }
        while(!list.isEmpty()||!list1.isEmpty()){
            char c=(char)list.get(0);
            int i=this.lengthDuplicated(list,c);
            int j=this.lengthDuplicated(list1,c);
            if(i>j){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String name="pyplr";
        String typed="ppyypllr";
        Solution2 s=new Solution2();
        System.out.println(s.isLongPressedName(name,typed));
    }
}
