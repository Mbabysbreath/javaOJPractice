package day;

import java.util.Arrays;

/**
 * 将数组右移k位
 * @author zhaomin
 * @date 2020/1/11 20:11
 */
public class Day1 {
    public void rotate(int[] nums, int k) {
        if(k>=nums.length){
            System.out.println(Arrays.toString(nums));
            return;
        }
        int[] ch=new int[nums.length];
        System.arraycopy(nums, nums.length - k, ch, 0, k);
        System.arraycopy(nums, 0, ch, k, nums.length - k);
        System.out.println(Arrays.toString(ch));
    }

    public static void main(String[] args) {

        Day1 ob=new Day1();
        int[] nums={1,2,3,4,5,6,7};
        ob.rotate(nums,3);
    }
}
