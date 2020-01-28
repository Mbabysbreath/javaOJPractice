package day.day11;

import java.util.Arrays;

/**
 * 对数组中的最小子数组排序后可以使整个数组变为升序
 * 求最小子序列的长度
 * @author zhaomin
 * @date 2020/1/23 13:07
 */
public class Solution1 {
    public int findUnsortedSubarray(int[] nums) {

        int[] nums1=nums.clone();
        Arrays.sort(nums1);
        int right=0;
        int left=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=nums1[i]){
                    right = i;
                    break;
            }
        }
        for(int j=nums.length-1;j>=0;j--){
            if(nums[j]!=nums1[j]){
                    left=j;
                    break;
            }
        }
        if(left==0&&right==0){
            return 0;
        }
        return left-right+1;
    }

    public static void main(String[] args) {
        int[] nums={2,6};
        Solution1 s=new Solution1();
        System.out.println(s.findUnsortedSubarray(nums));
    }
}
