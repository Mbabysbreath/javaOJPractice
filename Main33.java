package nowCode;

/**
 * 生兔子
 * @author ZhaoMin
 * @date 2019/11/30 22:12
 */
public class Main33 {
    public static int getTotalCount(int month){
        if(month==1||month==2||month==3){
            return 1;
        }
        return getTotalCount(month-1)+month ;
    }
}
