package day.day8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**给定一个整数数组 nums 和一个目标值 target，
 * 请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * @author zhaomin
 * @date 2020/1/20 21:59
 */
public class Solution1 {
    public int[] twoSum(int[] nums, int target){
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        Arrays.sort(nums);
        int j=nums.length-1;
        for(int i=0;i<nums.length;){
            int tem=nums[i]+nums[j];
            if(tem==target){
               i=list.indexOf(nums[i]);
               j=list.lastIndexOf(nums[j]);
                int[] num={i,j};
                return num;
            }else if(tem>target){
                j--;
            }else{
                i++;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Solution1 s=new Solution1();
        int[] nums={3,3,4,6,7};
        System.out.println(Arrays.toString(s.twoSum(nums,6)));
        System.out.println('1'-'0'+""+1);

        System.out.println(Arrays.toString("11".getBytes()));
    }
}

