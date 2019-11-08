package nowCode;

import java.util.Arrays;
import java.util.Scanner;

/**读入一个字符串，输出其中最长的数字串
 * @author ZhaoMin
 * @date 2019/11/8 14:18
 */
public class Main7 {
    public static String findLongStr(String str){
        if(str==null){
            return "";
        }
        char[] arr=str.toCharArray();
        String s="";
        String newStr="";
        for(int i=0;i<arr.length;i++){
            if((arr[i]-'0')>=0&&(arr[i]-'0')<=9){
               s+=arr[i];
            }else{
                if(newStr.length()<s.length()){
                     newStr= s.substring(0);
                }
                s="";
            }

        }
        return newStr.length()>s.length()?newStr:s;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str = scanner.nextLine();
        //scanner.nextLine();
        System.out.println(findLongStr(str));

        }


}

