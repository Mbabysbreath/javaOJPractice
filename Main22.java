package nowCode;

import java.util.Scanner;

/**
 * 走迷宫大小：x*y，每次只能从网格向右或向下
 * @author ZhaoMin
 * @date 2019/11/16 18:32
 */
public class Main22 {
    //动态规划
    public static int count(int x,int y){
        int[][] ds=new int[x][y];
        for(int i=0;i<x;i++){
            ds[i][0]=1;
        }
        for(int j=0;j<y;j++){
            ds[0][j]=1;
        }
        for(int i=1;i<x;i++){
            for(int j=1;j<y;j++){
                ds[i][j]=ds[i-1][j]+ds[i][j-1];
            }
        }
        return ds[x-1][y-1];
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        System.out.println(count(x,y));
    }
}
