package day.day9;

import day.day8.Solution2;

/**
 * @author zhaomin
 * @date 2020/1/21 13:18
 */
public class Solution1 {
    public int myAtoi(String str) {
        String s=str.trim();
       // return Integer.parseInt(s);
        char[] ch=s.toCharArray();
        if(ch.length==0){
            return 0;
        }
        if(ch.length==1&&ch[0]<'0'||ch[0]>'9'){
            return 0;
        }
        if(ch.length>2) {
            if (ch[1] < '0' || ch[1] > '9') {
                if (ch[0] >= '0' && ch[0] <= '9') {
                    return ch[0] - '0';
                } else {
                    return 0;
                }
            }
        }
        int i=1;
        String s1="";
        while(i<s.length()){
           // i++;
            //if(ch[i]!='-'){
                if(ch[i]>='0'&&ch[i]<='9') {
                    s1+=ch[i];
                    i++;
                }else {
                    break;
                }
        }

        if(ch[0]=='-'||(ch[0]>='0'&&ch[0]<='9')){
            s1=ch[0]+s1;
        }else if(ch[0]=='+'){
            s1=s1;
        }else{
            return 0;
        }
        long res=0;
        if(s1.charAt(0)!='-'){
        for(int j=0;j<s1.length();j++) {
            res = res * 10 + (s1.charAt(j) - '0');
            if (res > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
        }
        return (int)res;
        }else{
            for(int j=1;j<s1.length();j++){
                res = res * 10 + (s1.charAt(j) - '0');
                if(-1*res<Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }
            }
        }
        return (int)(-1*res);
    }

    public static void main(String[] args) {
        Solution1 s=new Solution1();
        String str="1";
        System.out.println(s.myAtoi(str));
    }
}
