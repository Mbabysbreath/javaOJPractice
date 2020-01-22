package day.day8;

/**
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。

 输入为非空字符串且只包含数字 1 和 0。
 * @author zhaomin
 * @date 2020/1/20 22:47
 */
public class Solution2 {
    public String addBinary1(String a, String b) {
        int ca=0;
        StringBuilder ans=new StringBuilder();
        for(int i=a.length()-1,j=b.length()-1;i>=0||j>=0;i--,j--){
           int sum=ca;
            sum += i >= 0 ? a.charAt(i) - '0' : 0;
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            ans.append(sum%2);
            ca=sum/2;
        }
        ans.append(ca==1?ca:"");
        return ans.reverse().toString();
    }
    public String addBinary(String a, String b) {
        String a1="";
        String b1="";
        if(a.length()<=b.length()){
            a1=a;
            b1=b;
        }else{
            a1=b;
            b1=a;
        }
        int len=a1.length();
        for(int i=0;i<b1.length()-len;i++){
            a1="0"+a1;
        }
        char[] chars=new char[a1.length()];
        for(int i=0;i<chars.length;i++){
            chars[i]='0';
        }
        boolean flag=false;
        System.out.println("");
        for(int i=a1.length()-1;i>=0;i--){
             char c1=a1.charAt(i);
             char c2=b1.charAt(i);
             int c=((c1-'0')+(c2-'0')+(chars[i]-'0'));
             if(c>1){
                 if(c>2){
                     chars[i]='1';
                 }else {
                     chars[i] = '0';
                 }
                 if(i==0){
                     flag=true;
                     break;
                 }
               chars[i-1]='1';
             }else{
                 chars[i]=(char)(c+'0');
             }
        }
        String str=new String(chars);
        if(flag){
            str="1"+str;
        }
        return str;
    }

    public static void main(String[] args) {
        String a="11";
        String b="1";
        Solution2 s=new Solution2();
        System.out.println(s.addBinary1(a,b));
    }
}
