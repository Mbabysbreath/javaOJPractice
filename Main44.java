package nowCode;

import java.util.Scanner;

/**字符串奇校验
 * @author ZhaoMin
 * @date 2019/12/8 21:16
 */
public class Main44 {
    public static void oddVerify(String str){
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            String s=Integer.toBinaryString(ch[i]);
            int count=0;
            while((8-s.length())>0){
                s="0"+s;
            }
            char[] ch1=s.toCharArray();
           for(int j=0;j<s.length();j++){
               if(ch1[j]=='1'){
                   count++;
               }
           }
           if(count%2==0){
               ch1[0]='1';
           }
            System.out.println(String.valueOf(ch1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String str=scanner.nextLine();
            oddVerify(str);
        }
    }
}
