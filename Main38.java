package nowCode;

import java.util.Scanner;

/**小易打怪
 * @author ZhaoMin
 * @date 2019/12/2 9:04
 */
public class Main38{
    public static int battle(int n,int init ,int[] b){
        for(int i=0;i<b.length;i++){
            if(init>=b[i]){
                init+=b[i];
            }else{
                init+=gcd(b[i],init);
            }
        }
        return init;
    }

    private static int gcd(int bi, int init) {
        int t=init;
        while(bi%t!=0){
            t=bi%init;
            bi=init;
            init=t;
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int n=scanner.nextInt();
            int init=scanner.nextInt();
            scanner.nextLine();
            int[] num=new int[n];
            for(int i=0;i<n;i++){
                num[i]=scanner.nextInt();
            }
            System.out.println(battle(n,init,num));
        }
    }
}
