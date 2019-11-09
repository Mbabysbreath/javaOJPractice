package nowCode;

import java.util.Scanner;

/**
 * @author ZhaoMin
 * @date 2019/11/8 22:09
 */
public class Main10 {
    public static String delString(String s1,String s2){
        String s="";
        for(int i=0;i<s2.length();i++){
            if(s1.contains(s2.substring(i,i+1))){
              s=s1.replace(s2.substring(i,i+1),",");
              s1=s;

            }
        }
          char[] arr=s.toCharArray();

        s="";
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=','){
                s+=arr[i];
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.nextLine();
        String s2=scanner.nextLine();
        System.out.println(delString(s1,s2));
    }
}
