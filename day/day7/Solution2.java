package day.day7;

import java.util.*;

/**
 * 寻找第三大数，如果不存在，返回最大数
 * @author zhaomin
 * @date 2020/1/19 16:21
 */
public class Solution2 {
    public int thirdMax(int[] nums) {
        if(nums.length<3){
            return Math.max(nums[0],nums[nums.length-1]);
        }
        int max=nums[nums.length-1];
        Set set=new HashSet();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int[] n=new int[set.size()];
        Iterator iterator=set.iterator();
        int i=0;
        while (iterator.hasNext()){
           n[i]=(int)iterator.next();
           i++;
        }
        Arrays.sort(n);
        if(n.length>=3){
            return n[n.length-3];
        }else{
            return n[n.length-1];
        }
    }

    public static void main(String[] args) {
        int[] nums={1,3,2};
        Solution2 s=new Solution2();
        System.out.println(s.thirdMax(nums));
    }
}
