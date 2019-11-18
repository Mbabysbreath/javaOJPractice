package nowCode;

import java.util.Arrays;

/**
 * 不用中间变量交换数组中的两个数
 * @author ZhaoMin
 * @date 2019/11/18 19:58
 */
public class Main24 {
    public static int[] exchangeAB(int[] AB) {
        // write code here
        AB[0]=AB[0]+AB[1];
        AB[1]=AB[0]-AB[1];
        AB[0]=AB[0]-AB[1];
        return AB;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2};
        System.out.println(Arrays.toString(exchangeAB(arr)));
    }
}
