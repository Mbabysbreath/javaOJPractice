package day.day11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 逆波兰算法求表达式的值
 * @author zhaomin
 * @date 2020/1/23 13:44
 */
public class Solution2 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        int res = 0;
        for (String s : tokens) {
            if (s.equals("+")) {
                res = stack.pop() + stack.pop();
                stack.push(res);
            } else if (s.equals("-")) {
                res = (-stack.pop()) + stack.pop();
                stack.push(res);
            } else if (s.equals("*")) {
                res = stack.pop() * stack.pop();
                stack.push(res);
            } else if (s.equals("/")) {
                int r1 = stack.pop();
                res = stack.pop() / r1;
                stack.push(res);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Solution2 s=new Solution2();
        String[] nums={"2", "1", "+", "3", "*"};
        System.out.println(s.evalRPN(nums));
    }
}
