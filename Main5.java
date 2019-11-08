package nowCode;
import java.util.*;
/**
 * 求小于N的最大的平方数
 * @author ZhaoMin
 * @date 2019/11/7 13:35
 */
public class Main5 {
    static int i;
    public static int findSqrtN(int n){
        int m=(int)Math.sqrt(n);

        return m*m;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(findSqrtN(n));

    }
}
