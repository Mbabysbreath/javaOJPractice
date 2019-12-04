package nowCode;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 对数字分类
 * @author ZhaoMin
 * @date 2019/12/1 22:19
 */
public class Main37 {
    public static void classNum(int n,int[] num){
        int A1=0;
        for(int i=0;i<num.length;i++){
            if(num[i]%5==0&&num[i]%2==0){
                A1+=num[i];
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<num.length;i++){
            if(num[i]%5==1){
                list.add(num[i]);
            }
        }
        int A2=0;
        for(int i=0;i<list.size();i++){
            if(i%2==0){
                A2+=list.get(i);
            }else{
                A2-=list.get(i);
            }
        }
        int A3=0;
        for(int i=0;i<num.length;i++){
            if(num[i]%5==2){
                A3++;
            }
        }
        float A4=0;
        int count2=0;
        for(int i=0;i<num.length;i++){
            if(num[i]%5==3){
                A4+=num[i];
                count2++;
            }
        }
        A4=A4/count2;
       int A5=0;
        for(int i=0;i<num.length;i++){
            if(num[i]%5==4){
                A5=Math.max(A5,num[i]);
            }
        }
        System.out.format("%d %d %d %.1f %d",A1,A2,A3,A4,A5);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=scanner.nextInt();
        }
        classNum(n,num);
    }
}
