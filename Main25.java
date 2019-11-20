package nowCode;

import java.util.Arrays;
import java.util.Scanner;

/**超长整数相加
 * @author ZhaoMin
 * @date 2019/11/20 19:56
 */
public class Main25 {
    public static String AddLongInteger(String addend,String augend){
        char[] arr1=addend.toCharArray();
       // System.out.println("arr1"+ Arrays.toString(arr1));
        char[] arr2=augend.toCharArray();
       // System.out.println("arr2"+Arrays.toString(arr2));

        int size=arr1.length>arr2.length?arr1.length:arr2.length;
        int[] num1=new int[size];
        int[] num2=new int[size];
        int[] result=new int[2*size];
        int[] end=new int[2*size];
        for(int i=0;i<size;i++){
            if(i<arr1.length)
            num1[i]=Integer.valueOf(arr1[arr1.length-1-i]-'0');
        }
       // System.out.println("num1"+Arrays.toString(num1));
        for(int i=0;i<size;i++){
            if(i<arr2.length)
            num2[i]=Integer.valueOf(arr2[arr2.length-1-i]-'0');
           // System.out.println(num2[i]);
        }
      //  System.out.println("num2"+Arrays.toString(num2));
        for(int i=0;i<size;i++){
            result[i]=num1[i]+num2[i]+result[i];
            if(result[i]>=10){
                result[i+1]+=1;
                result[i]-=10;
            }
        }
      //  System.out.println("re"+Arrays.toString(result));
        int j=0;
        String str="";
        for(j=result.length-1;j>=0;j--){
            if(result[j]!=0){
                break;
            }
        }
        for(int i=0;i<=j;i++){
            end[i]=result[j-i];
            str+=end[i];
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.nextLine();
        String s2=scanner.nextLine();
        System.out.println(AddLongInteger(s1,s2));
    }
}
