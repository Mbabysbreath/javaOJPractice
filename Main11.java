package nowCode;

import java.util.Scanner;

/**
 * 向容量为40的袋子里放东西
 * @author ZhaoMin
 * @date 2019/11/9 20:17
 */
public class Main11 {
    public static int[] weight;
    public static int count;
    public static void beibao(int bag,int n){
        if(bag==0){
            count++;
        }
        if(bag>0&&n<1||bag<=0){
            return;
        }
        beibao(bag-weight[n],n-1);
        beibao(bag,n-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        weight = new int[n+1];
        while (scanner.hasNext()) {
            for (int i = 1; i <= n; ++i) {
                weight[i] = scanner.nextInt();
            }
            beibao(40, n);
            System.out.println(count);
        }
    }
}
