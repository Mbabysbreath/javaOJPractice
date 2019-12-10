package nowCode;

import java.util.Scanner;

/**
 * 判断守约数：一个数平方的低位数=这个数本身
 * @author ZhaoMin
 * @date 2019/12/6 19:32
 */
public class Main42 {
    public static void judgDate(int num){
        int p=num*num;
        String str=String.valueOf(p);
        String str1=String.valueOf(num);
        if(str.length()<2){
            System.out.println("No");
            return;
        }
        if(str1.equals(str.substring(1,str.length()))){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int num=scanner.nextInt();
            judgDate(num);
        }
    }
}
