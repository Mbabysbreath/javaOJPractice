package nowCode;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 求一组数中，每隔两个删一个数，求出最后被删除的数
 * @author ZhaoMin
 * @date 2019/11/14 13:12
 */
public class Main17 {
    public static int lastDel(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int i = 0;
        while (list.size() >1) {

            int l1=list.remove(0);
            int l2=list.remove(0);
            list.add(l1);
            list.add(l2);
            list.remove(0);

        }
        return list.get(0);
    }
        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            int n= scanner.nextInt();

            System.out.println(lastDel(n));

        }
}
