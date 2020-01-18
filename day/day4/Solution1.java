package day.day4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 如果数组中又重复的数字，返回true
 * @author zhaomin
 * @date 2020/1/16 23:48
 */
public class Solution1 {
    public boolean containsDuplicate(int[] nums) {
        Map map=new HashMap();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }else{
                map.put(nums[i],1);
            }
        }
        return false;
    }

    public boolean containsDuplicate1(int[] nums) {
        List list=new ArrayList();
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i])){
                return true;
            }else{
                list.add(nums[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4};
        Solution1 s=new Solution1();
        System.out.println(s.containsDuplicate1(nums));
    }
}
