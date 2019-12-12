package nowCode;

import java.util.Scanner;

/**
 * 年终奖的概率：抽到自己才算中将
 * @author ZhaoMin
 * @date 2019/12/7 20:19
 */
public class Main43 {
    public static void countProb(int n){
       double p=1-(double)n/(n*n);
    //    double p1=Math.pow((double)(n-1)/n,n);
        System.out.printf("%.2f%%",p*100);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        countProb(n);
    }
}
