package nowCode;

/**try语句块和finally语句块中return的比较
 * 1.当finally中有return语句时不会执行try语句中的return
 * 2.当fianlly中没有return 时，会先执行完finally中的语句，
 * 在回过头执行try中的语句，但是fianlly语句执行不会影响结果，即不起作用
 * @author ZhaoMin
 * @date 2019/11/14 22:58
 */
public class Main20 {
    public static void main(String[] args) {
        int num=10;
        System.out.println(test(num));
    }

    private static int test(int num) {
        try{
            num+=10;
            return num;
            //return num;
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            num+=1;
           // return num;
        }
        return num;
    }
}
