package nowCode;
import java.util.*;
/**欧几里得放蛋糕问题
 * @author ZhaoMin
 * @date 2019/11/12 21:15
 */
public class Main14{
    public static int cake(int H,int W){
        int[][] arr=new int[H][W];
        int count=0;
        for(int i=0;i<H;i++){
            for(int j=0;j+2<W;j++){
                if(arr[i][j]==0){
                    arr[i][j+2]=1;
                }
            }
            for(int k=i;k<W;k++){
                for(int m=0;m+2<H;m++){
                    if(arr[m][k]==0){
                        arr[m+2][k]=1;
                    }
                }
                break;
            }
        }
        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                if (arr[i][j]==0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String[] s=str.split(" ");
        int H=Integer.parseInt(s[0]);
        int W=Integer.parseInt(s[1]);
        System.out.println(cake(H,W));

    }
}
