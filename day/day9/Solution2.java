package day.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。
 * 找出给定目标值在数组中的开始位置和结束位置。
 * @author zhaomin
 * @date 2020/1/21 19:49
 */
public class Solution2 {
    public int[] searchRange(int[] nums, int target) {
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        if(!list.contains(target)){
            return new int[]{-1,-1};
        }
        int i=list.indexOf(target);
        int j=list.lastIndexOf(target);
        return new int[]{i,j};
    }

    public static void main(String[] args) {
        Solution2 s=new Solution2();
        int[] nums={1,2,3};
        System.out.println(Arrays.toString(s.searchRange(nums,1)));
    }
}
