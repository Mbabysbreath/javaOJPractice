package nowCode;

import java.util.Scanner;

/**
 * 读入n名学生的成绩，将符合给定分数的人数输出
 *
 * @author ZhaoMin
 * @date 2019/11/24 19:33
 */
public class Main30 {
    public static int countWithgrade(int n,int[] grade,int value){
        int count=0;
            for(int i=0;i<n;i++){
                if(grade[i]==value){
                    count++;
                }
            }
            return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n=scanner.nextInt();
            if(n==0){
                break;
            }
            int[] grade=new int[n];
            for(int i=0;i<n;i++){
                grade[i]=scanner.nextInt();
            }
            int value=scanner.nextInt();
            System.out.println(countWithgrade(n,grade,value));
            //continue;
        }
    }
}
