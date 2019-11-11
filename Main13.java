package nowCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * 输出一组数字中出现次数大于等于数字长度的数
 * @author ZhaoMin
 * @date 2019/11/10 20:56
 */
public class Main13 {
    public static void findMore(String str){
        Map<Integer,Integer> map=new HashMap<>();
        String[] s=str.split(" ");
        int[] num=new int[s.length];
        for(int i=0;i<s.length;i++){
            num[i]=Integer.parseInt(s[i]);
        }

        for(int i=0;i<num.length;i++){
            int count=0;
            for(int j=0;j<num.length;j++){
                if(num[i]==num[j]){
                    count++;
                }
            }
            map.put(num[i],count);
        }
       Set<Integer> key=map.keySet();
        for(Integer k:key){
            if(map.get(k)>=num.length/2){
                System.out.println(k);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        findMore(str);
        System.out.println();
    }
}
