package day.day6;

import java.util.Arrays;

/**
 * 偶数在奇数前
 * @author zhaomin
 * @date 2020/1/18 21:41
 */
public class Solution1 {
    public static void main(String[] args) {
        Solution1 s=new Solution1();
        int[] A={2,3,4,1,2};
        System.out.println(Arrays.toString(s.sortArrayByParity(A)));
    }
    public int[] sortArrayByParity(int[] A) {
        int j=A.length-1;
        for(int i=0;i<j;i++){
            if(A[i]%2==0){
                continue;
            }else{
                while(j>i&&A[j]%2!=0){
                    j--;
                }
                swap(A,i,j);
                j--;
            }
        }
        return A;
    }
    public void swap(int[] A,int i,int j){
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }

}
