package nowCode;

import java.util.Stack;

/**
 * @author ZhaoMin
 * @date 2019/11/8 15:20
 */
public class Main8 {
    public static boolean chkParenthesis(String A, int n) {
        // write code here
        char[] arr=A.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(stack.empty()){
                stack.push(arr[i]);
                continue;
            }
            if(arr[i]=='('){
                stack.push(arr[i]);
            }else if(arr[i]==')'){
                stack.pop();
            }else{
                return false;
            }
        }
        if(stack.empty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String str="())";
        System.out.println(chkParenthesis(str,6));
    }
}
