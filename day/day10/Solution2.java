package day.day10;



/**
 * 压缩数组
 * @author zhaomin
 * @date 2020/1/22 13:12
 */
public class Solution2 {
    public int compress(char[] chars) {
        if(chars.length<2){
            return 1;
        }
        String s="";
        int i=0;
        int j=1;
       while(true){
            if(chars[i]==chars[j]){
                if(j+1<chars.length){
                    j++;
                }else{
                    j++;
                    s+=chars[i];
                    if(j-i>1){
                        s+=(j-i);
                    }
                    break;
                }
            }else {
                s += chars[i];
                if (j - i != 1) {
                    s += (j - i);
                }
                i=j;
            }
        }
       for(int m=0;m<s.length();m++){
           chars[m]=s.charAt(m);
       }
        System.out.println(s);
        return s.length();
    }

    public static void main(String[] args) {
        Solution2 s=new Solution2();
        char[] chars={'a'};
        System.out.println(s.compress(chars));
    }
}
