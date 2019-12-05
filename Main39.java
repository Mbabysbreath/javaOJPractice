package nowCode;

import java.util.Scanner;

/**求总评绩点
 * @author ZhaoMin
 * @date 2019/12/3 21:30
 */
public class Main39 {
    public static double countGPA(int n, int[] credit, int[] grade) {
        double total=0;
        double g=0;
        for (int i = 0; i < n; i++) {
            if (grade[i] <= 100 && grade[i] >= 90) {
                    g=4.0;
            }else if(grade[i]<=89&&grade[i]>=85){
                g=3.7;
            }else if(grade[i]<=84&&grade[i]>=82){
                g=3.3;
            }else if(grade[i]<=81&&grade[i]>=78){
                g=3.0;
            }else if(grade[i]<=77&&grade[i]>=75){
                g=2.7;
            }else if(grade[i]<=74&&grade[i]>=72){
                g=2.3;
            }else if(grade[i]<=71&&grade[i]>=68){
                g=2.0;
            }else if(grade[i]<=67&&grade[i]>=64){
                g=1.5;
            }else if(grade[i]<=63&&grade[i]>=60){
                g=1.0;
            }else{
                g=0;
            }
            total+=g*credit[i];
        }
        int t=0;
        for(int i=0;i<n;i++){
            t+=credit[i];
        }
        return total/t;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] credit=new int[n];
        int[] grade=new int[n];
        for(int i=0;i<n;i++){
            credit[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            grade[i]=scanner.nextInt();
        }
        System.out.printf("%.2f",countGPA(n,credit,grade));
    }
}
