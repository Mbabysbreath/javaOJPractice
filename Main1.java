package nowCode;
import java.util.*;
/**
 * 将字符串b插入到字符串a中，并判断能组成回文字符串的方法有几种
 * @author ZhaoMin
 * @date 2019/11/5 20:01
 */
public class Main1 {
    public static int cotPlain(String str1, String str2) {
        int count=0;

      for(int i=0;i<str1.length();i++){
          String s1=str1.substring(0,i+1);
          String s2=str1.substring(i+1);
          String s3=s1.concat(str2);
          String s4=s3.concat(s2);
          if(isPlain(s4)){
              count++;
          }
          if(isPlain(str2.concat(str1))){
              count++;
          }

      }
        return count;
    }
    public static boolean isPlain(String str){
        char[] arr=str.toCharArray();
        boolean flag=false;
        for(int i=0;i<arr.length/2;i++){
            if(arr[i]==arr[arr.length-1-i]){
                flag=true;
            }else{
                flag=false;
                break;
            }
        }
        if(flag){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str1=scanner.nextLine();
        String str2=scanner.nextLine();
        System.out.println(Main1.cotPlain(str1,str2));
    }
}
