import java.util.Scanner;

/**
 * @PROJECT_NAME: 大数据实训
 * @DESCRIPTION:
 * @USER: 韩冰
 * @DATE: 2022/9/12 0012 18:34
 */
public class PingBi {
    public static void main(String[] args) {
        System.out.println("请输入电话");
        String tel = new Scanner(System.in).next();
        if (tel.length()!=11){
            System.out.println("格式错误");
            return;
        }
        String tel3 = tel.substring(0,3);
        String tel4 = tel.substring(7);
        System.out.println(tel3+"****"+tel4);

    }
}
