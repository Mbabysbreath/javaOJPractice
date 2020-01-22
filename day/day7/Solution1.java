package day.day7;

import java.util.Arrays;

/**
 * 返回用数组表示的整数+1
 * @author zhaomin
 * @date 2020/1/19 15:20
 */
public class Solution1 {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]<9){
            digits[digits.length-1]+=1;
            return digits;
        }
        digits[digits.length-1]=0;
        for(int i=digits.length-2;i>=0;i--){
            if(digits[i]+1<10){
                digits[i]+=1;
                return digits;
            }else{
                digits[i]=0;
            }
        }
        int[] d=new int[digits.length+1];
        d[0]=1;
        System.arraycopy(digits,0,d,1,digits.length);
        return d;
    }

    public static void main(String[] args) {
        Solution1 s=new Solution1();
        int[] digits={9,9};
        System.out.println(Arrays.toString(s.plusOne(digits)));
    }
}
