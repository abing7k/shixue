/**
 * @PROJECT_NAME: 大数据实训
 * @DESCRIPTION:
 * @USER: 韩冰
 * @DATE: 2022/9/8 0008 1:08
 */
public class demo1_1 {
    public static void main(String[] args) {
        System.out.println(jiecheng(4));
    }

    public static int jiecheng(int i){
        if (i==1){
            return 1;
        }else {
            return i*jiecheng(i-1);
        }
    }
}
