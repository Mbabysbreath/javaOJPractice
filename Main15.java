package nowCode;

import java.util.Scanner;

/**
 * 最小公倍数
 * @author ZhaoMin
 * @date 2019/11/12 22:11
 */
public class Main15 {
    public static int findLostCom(int a,int b){//最小公倍数
        if(a==0||b==0){
            return 0;
        }
        return a*b/gcd(a,b);//最大公约数
    }
    private static int gcd(int a,int b){
        if(a<b){
            int t=a;
            a=b;
            b=t;
        }
        System.out.println(a+" "+b);
        if(a%b==0){
            return b;
        } else {
            gcd(b,a%b);
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println(findLostCom(a, b));
    }
}
