package nowCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 输出n个整数里最小的k个数
 * @author ZhaoMin
 * @date 2019/11/14 12:54
 */
public class Main16 {
    public static void findSmallK(String str){
        String[] s1=str.split(" ");
        int[] arr=new int[s1.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(s1[i]);
        }
        int[] arr2= Arrays.copyOf(arr,arr.length-1);
        Arrays.sort(arr2);
        for(int i=0;i<arr[arr.length-1];i++){
            System.out.print(arr2[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        findSmallK(str);
    }
}
