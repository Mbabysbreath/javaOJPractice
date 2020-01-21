package day.day5;

import java.util.Arrays;

/**
 * 给定一个按非递减顺序排序的整数数组 A，
 * 返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 * @author zhaomin
 * @date 2020/1/17 17:15
 */
public class Solution1 {
    public int[] sortedSquares(int[] A) {
        for(int i=0;i<A.length;i++){
            A[i]=A[i]*A[i];
        }
        Arrays.sort(A);
        return A;
    }

    public static void main(String[] args) {
        int[] A={-1,0,2,4};
        Solution1 s=new Solution1();
        System.out.println(Arrays.toString(s.sortedSquares(A)));
    }
}
