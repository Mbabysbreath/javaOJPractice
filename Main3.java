package nowCode;

import java.util.Scanner;

/**
 * 空瓶换汽水
 * @author ZhaoMin
 * @date 2019/11/7 12:20
 */
public class Main3 {
    public static int countBottle(int n){
        if(n<2){
            return 0;
        }
        int result=0;
        while(n>2){
            if(n/3>0){
                result += n/3;
                n=n/3+n%3;
            }
        }
        if(n==2){
            result+=1;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        while(scanner.hasNext()){
            int n=scanner.nextInt();
            if(n==0){
                break;
            }
            System.out.println(countBottle(n));
        }
    }
}
