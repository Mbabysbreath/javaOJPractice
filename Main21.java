package nowCode;

/**
 * 三目运算符???
 * @author ZhaoMin
 * @date 2019/11/14 23:47
 */
public class Main21 {
    public static void main(String[] args) {
        boolean b=(true?false:true==true?false:true);
        boolean b1=true?false:true;
      //  boolean b2=false;
        System.out.println(b);
        System.out.println(b1);
        System.out.println(false?false:true);
        System.out.println(false==false);
        System.out.println(true?false:true);
        int i=3;
        switch(i){
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
        }
    }
}
