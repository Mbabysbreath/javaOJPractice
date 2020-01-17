package day.day3;

import java.util.Arrays;

/**
 * 合并有序数组
 *
 * @author zhaomin
 * @date 2020/1/15 15:49
 */
public class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //System.arraycopy(nums2,0,nums1,m,n);
        // Arrays.sort(nums1);
        if (n == 0) {
            return;
        }
        int[] num = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                num[k++] = nums1[i++];
            } else if (nums1[i] > nums2[j]) {
                num[k++] = nums2[j++];
            } else {
                num[k++] = nums1[i++];
                num[k++] = nums2[j++];
            }
        }
        if (i == m) {
            for (; j < n; j++) {
                num[k++] = nums2[j];
            }
        }
        if (j == n) {
            for (; i < m; i++) {
                num[k++] = nums1[i];
            }
        }
        //  System.out.println(Arrays.toString(num));
        System.arraycopy(num, 0, nums1, 0, n + m);
    }

    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        Solution2 s=new Solution2();
        s.merge(nums1,3,nums2,3);
    }
}
