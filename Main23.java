package nowCode;

import java.util.*;

/**
 * 统计一串数字中各个数字出现的次数
 * @author ZhaoMin
 * @date 2019/11/17 13:27
 */
public class Main23 {

    public static void countNum(int num){
        Map<Integer,Integer> map=new HashMap<>();
        if(num==0){
            map.put(0,1);
        }
        while (num>0){
            if(map.containsKey(num%10)) {
                map.put(num % 10, map.get(num%10)+1);
            }else{
                map.put(num%10,1);
            }
            num/=10;
        }
        Set set=map.keySet();
        Object[] arr=set.toArray();
        Arrays.sort(arr);
        for(int i=0;i<map.size();i++){
            System.out.println(arr[i]+":"+map.get(arr[i]));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        countNum(num);
    }
}
