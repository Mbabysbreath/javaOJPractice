package nowCode;

import java.util.Scanner;

/**
 * @author ZhaoMin
 * @date 2019/11/14 22:25
 */
public class Main19 {
    public static String reverseStr(int n){
        String str=String.valueOf(n);
        char[] ch=str.toCharArray();
        for(int i=str.length()-1;i>=0;i--){
            ch[str.length()-1-i]=str.charAt(i);
        }
        String str1=new String(ch);
        return str1;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(reverseStr(n));
    }
}
