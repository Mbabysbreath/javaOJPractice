package nowCode;

import java.util.Scanner;

/**
 * 求数字n的各个位上的数字之和以及其平方的各位数之和
 * @author ZhaoMin
 * @date 2019/12/4 22:19
 */
public class Main40 {
    public static void calculate(int n){
        int m=n*n;
        int count1=0;
        int count2=0;
        while(n>0){
            count1+=(n%10);
            n/=10;
        }
        while(m>0){
            count2+=(m%10);
            m=m/10;
        }
        System.out.println(count1+" "+count2);
    }
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while(scanner.hasNext()){
                int n=scanner.nextInt();
                calculate(n);
            }
    }
}
