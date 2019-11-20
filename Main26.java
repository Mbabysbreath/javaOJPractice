package nowCode;

import java.util.Arrays;
import java.util.Scanner;

/**正方形
 * @author ZhaoMin
 * @date 2019/11/20 20:46
 */
public class Main26 {
    public static void draw(int col,String c){
        int row=Math.round(col/2.0f);
        String[] s1=c.split(" ");
        String[][] arr=new String[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0||i==row-1||j==0||j==col-1){
                    arr[i][j]=s1[1];
                }else{
                    arr[i][j]=" ";
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int col=scanner.nextInt();
       // scanner.nextLine();
        String str=scanner.nextLine();
        draw(col,str);
    }
}
