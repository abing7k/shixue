/**
 * @PROJECT_NAME: 大数据实训
 * @DESCRIPTION:
 * @USER: 韩冰
 * @DATE: 2022/9/8 0008 18:25
 */
public class demo1_3 {
    public static void main(String[] args) {
        System.out.println(max(1,2));
        System.out.println(max(1,2,3));
    }

    public static int max(int a, int b){
        return a>=b? a:b;
    }

    public static int max(int a, int b,int c) {
        return max(a,b)>=c? max(a,b):c;
    }

}
