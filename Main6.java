package nowCode;

import java.util.Scanner;
import java.util.Stack;

/**
 * 链接：https://ac.nowcoder.com/acm/contest/315/B
 来源：牛客网

 1、N按钮: 如果当期拥有的勇气值为x, 按下之后勇气值将变为2*x+1，

 2、G按钮: 如果当前拥有的勇气值为x, 按下之后勇气值将变为2*x+2，

 妞妞需要将自己的勇气值恰好变为n, 设计一个勇气获得机的按键方案使勇气值恰好变为n。
 1.二叉树孩子找父亲结点
 2.逆序：（1）栈
            （2）StringBuilder(String str).reverse();
 * @author ZhaoMin
 * @date 2019/11/8 0:14
 */
public class Main6 {
    public static String courage(int n){
        Stack<String> stack=new Stack<>();
        String result="";
        while(n>0){
            if(n%2==0){
               // result+='G';
                stack.push("G");
            }else{
               // result+='N';
                stack.push("N");
            }
            n=(n-1)/2;
        }

        //return new StringBuilder(result).reverse();
        while(!stack.empty()){
            result+=stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(courage(20));
    }
}
