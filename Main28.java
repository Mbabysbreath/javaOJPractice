package nowCode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 验证尼克彻斯定理：
 * 任意一个数m的立方都可以表示为m个奇数相加
 * @author ZhaoMin
 * @date 2019/11/20 23:04
 */
public class Main28 {
    public static String GetSequenceOddNum(int m){
        int[] num=new int[m+1];
        num[1]=1;int j=0;
        for(int i=2;i<=m;i++){
            for( j=1;j<=i;j++) {
                num[j] = num[j] + 2 * (i-1);
                if(i==j)
                num[i] = i * i+ i - 1;
            }
            //System.out.println(Arrays.toString(num));
        }

        String str="";
        for(int i=1;i<=m;i++){
            if(i==m){
                str+=num[i];
                break;
            }
            str+=num[i]+"+";
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        System.out.println(GetSequenceOddNum(num));
    }
}
