package day;

/**
 * 转换成小写字母
 * @author zhaomin
 * @date 2020/1/11 20:35
 */
public class Day2 {
    public String toLowerCase(String str) {
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='A'&&ch[i]<='Z')
                ch[i]+='a'-'A';
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String str="abcDef";
        Day2 ob=new Day2();
        System.out.println(ob.toLowerCase(str));
    }
}
