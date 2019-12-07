package nowCode;

import java.util.Scanner;

/**
 * 寻找x在n个数中的下标
 * @author ZhaoMin
 * @date 2019/12/5 19:58
 */
public class Main41 {

    public static int indexOf(int n,int[] num,int x){
        for(int i=0;i<n;i++){
            if(num[i]==x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] num = new int[n];
            for (int i = 0; i < num.length; i++) {
                num[i] = scanner.nextInt();
            }
            int x=scanner.nextInt();
            System.out.println(indexOf(n, num, x));
        }

    }
}
