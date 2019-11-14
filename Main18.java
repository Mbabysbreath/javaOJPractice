package nowCode;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author ZhaoMin
 * @date 2019/11/14 22:16
 */
public class Main18 {
    public static int factorial(int n){
        int result=1;
        while(n>0){
            result*=n;
            n--;
        }
        System.out.println(result);
        return result;
    }
    public static int count0(int n){
        long num=factorial(n);
        int count=0;
        while(num%10==0){
            count++;
            num/=10;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(count0(n));
    }
}
