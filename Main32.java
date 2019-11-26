package nowCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 找一行字符串中存在CG最长的指定长度的子串
 * @author ZhaoMin
 * @date 2019/11/26 19:37
 */
public class Main32 {
    public static String childStr(String str,int size){
        int count=0;
        int j=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i+size<str.length();i++){
            count=0;
            for(j=i;j<i+size;j++){
                if(str.charAt(j)=='G'||str.charAt(j)=='C'){
                    count++;
                }
            }
            if(!map.containsValue(count)) {
                map.put(i, count);
            }else{
                map.put(i,0);
            }
        }
        int max=0;
        int index=0;
        for(int i=0;i<map.size();i++){
            if(max<map.get(i)){
                index=i;
            }
        }
        return str.substring(index,index+size);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        int size=scanner.nextInt();
        System.out.println(childStr(str,size));
    }
}
