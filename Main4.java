package nowCode;

/**寻找数组中逆序对的个数
 * @author ZhaoMin
 * @date 2019/11/7 12:43
 */
public class Main4 {
    public static int reverse(int[] A,int n){
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                if(A[i]>A[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A={1,8,3,4,5,6,7,8};
        System.out.println(reverse(A,8));
    }
}
