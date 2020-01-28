package day.day12;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaomin
 * @date 2020/1/24 20:45
 */
public class Solution1 {
    List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> subsets1(int[] nums) {
        if(nums == null || nums.length ==0){
            return lists;
        }

        List<Integer> list = new ArrayList<>();
        process(list, nums, 0);
        return lists;

    }

    private void process(List<Integer>list, int[] nums, int start){

        lists.add(new ArrayList(list));
        for(int i = start; i < nums.length; i++){

            list.add(nums[i]);
            process(list, nums, i+1);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};
        Solution1 s=new Solution1();
        for(int i=0;i<3;i++){
            System.out.println(nums[i]);
        }
        System.out.println(s.subsets1(nums));
    }
}
