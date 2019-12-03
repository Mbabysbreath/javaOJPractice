package nowCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author ZhaoMin
 * @date 2019/12/1 8:17
 */
public class Main35 {
    public static void countBead(String str1,String str2){
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        List<Character> list1=new ArrayList<>();
        List<Character> list2=new ArrayList<>();
        for(int i=0;i<ch1.length;i++){
            list1.add(ch1[i]);
        }
        for(int i=0;i<ch2.length;i++){
            list2.add(ch2[i]);
        }
        int count=0;
            for (int i = 0; i < list2.size(); i++) {
                if (list1.contains(list2.get(i))) {
                    int t = list1.indexOf(list2.get(i));
                    list1.remove(t);
                    count++;
                }
            }
        if(list2.size()==count){
            System.out.println("Yes"+" "+list1.size());
        }else{
            System.out.println("No"+" "+(list2.size()-count));
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str1=scanner.nextLine();
        String str2=scanner.nextLine();
        countBead(str1,str2);
    }
}
