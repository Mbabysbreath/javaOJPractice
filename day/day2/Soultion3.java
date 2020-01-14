package day.day2;

/**
 * 判断回文数
 * @author zhaomin
 * @date 2020/1/14 15:01
 */
public class Soultion3 {
    public boolean isPalindrome(int x) {
           // String s=String.valueOf(x);
             String s=Integer.toString(x);
            StringBuilder s1=new StringBuilder(s);

            String s2=s1.reverse().toString();
            if(s2.equals(s)){
                return true;
            }else{
                return false;
            }
    }

    public static void main(String[] args) {
        Soultion3 s = new Soultion3();
        System.out.println(s.isPalindrome(1234321));
    }
}
