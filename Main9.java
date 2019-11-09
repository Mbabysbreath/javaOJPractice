package nowCode;
import java.util.*;
/**
 * @author ZhaoMin
 * @date 2019/11/8 22:06
 */
public class Main9 {
        public static int buyApple(int n){
            if(n%2!=0||n==10||n<6){
                return -1;
            }
            if(n%8==0){
                return n/8;
            }else{
                return n/8+1;
            }

        }
        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            int n=scanner.nextInt();
            System.out.println(buyApple(n));
        }
}

