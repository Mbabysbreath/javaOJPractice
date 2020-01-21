package day.day6;

/**
 * 给定一个整数类型的数组 nums，请编写一个能够返回数组“中心索引”的方法。

 我们是这样定义数组中心索引的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
 * @author zhaomin
 * @date 2020/1/18 22:13
 */
public class Solution2 {
    //前缀和
    public int pivotIndex(int[] nums) {
        int sum=0;
        int sumL=0;
        for(int n:nums){
            sum+=n;
        }
        for(int i=0;i<nums.length;i++){
            if(sumL==(sum-sumL-nums[i])){
                return i;
            }else{
                sumL+=nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{-1,-1,-1,-1,-1,0};
        Solution2 s=new Solution2();
        System.out.println(s.pivotIndex(nums));
    }
}
