package nowCode;

import java.util.*;

/**
 * 消息加密
 * @author ZhaoMin
 * @date 2019/11/30 22:33
 */
public class Main34 {
    public static String password(String str){
        char[] ch=str.toCharArray();
        String str1="";
        for(int i=0;i<ch.length;i++){
            if(ch[i]==' '){
                str1+=" ";
            }else if(ch[i]+26-5>90){
                str1+=(char)(ch[i]-5);
            }else if(ch[i]+26-5==90){
                str1+='Z';
            }
                else{
                    str1+=(char)(ch[i]+26-5);
                }
            }
        return str1;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()) {
            String str = scanner.nextLine();
            System.out.println(password(str));
        }
    }
}
