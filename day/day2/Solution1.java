package day.day2;

import org.junit.Test;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
 * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * @author zhaomin
 * @date 2020/1/14 11:52
 */
public class Solution1 {
    @Test
    //第一种暴力求解
    public int searchInsert1(int[] nums, int target) {
        for(int i=0;i<nums.length;){
            if(nums[i]==target||nums[i]>target){
                return i;
            }else {
                i++;
                if(i==nums.length){
                    return i;
                }
            }
        }
        return 0;
    }
    //第二种：二分搜索
    public int searchInsert2(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        if(nums.length==0){
            return 0;
        }else if(target>nums[nums.length-1]){
            return nums.length;
        }
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Solution1 s=new Solution1();
        int[] nums={1,2,3,4};

        System.out.println(s.searchInsert1(nums,0));
    }
}
