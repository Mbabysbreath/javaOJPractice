package nowCode;

import java.util.Scanner;

/**A-B,B-C,A+B,B+C代C表四个数字，
 * A，B,C代表每个人的糖果
 * 计算A，B，
 * @author ZhaoMin
 * @date 2019/11/10 20:32
 */
public class Main12 {
    public static void sugar(int a,int b,int c,int d){
        int A=(a+c)/2;
        int B=c-A;
        int C=d-B;
        if((A+B+C)>=0&&A>=0&&B>=0&&C>=0){
            if(A-B==a&&B-C==b&&A+B==c&&B+C==d){
                System.out.println(A+" "+B+" "+C);
            }else{
                System.out.println("No");
            }
        }else{
            System.out.println("No");
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();//A-B
        int b=scanner.nextInt();//B-C
        int c=scanner.nextInt();//A+B
        int d=scanner.nextInt();//B+C
        sugar(a,b,c,d);
    }
}
