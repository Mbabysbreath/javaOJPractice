package nowCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 一串数字的最小组合
         * @author ZhaoMin
        * @date 2019/11/20 22:14
        */
public class Main27 {
        public static String findMin(int[] num){
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<10;i++){
                while(num[i]!=0){
                    list.add(i);
                    num[i]--;
                }
            }
            for(int i=0;i<list.size();i++){
                if(list.get(i)!=0){
                    list.add(0,list.get(i));
                    list.remove(i+1);
                    break;
                }
            }
            String str="";
            for(int i=0;i<list.size();i++){
                str+=list.get(i);
            }
            return str;
        }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] num=new int[10];
        for(int i=0;i<10;i++){
            num[i]=scanner.nextInt();
        }
        System.out.println(findMin(num));
    }
}
