import java.util.Scanner;

/**
 * @PROJECT_NAME: 大数据实训
 * @DESCRIPTION:
 * @USER: 韩冰
 * @DATE: 2022/9/8 0008 18:19
 */
public class demo1_2 {
    public static void main(String[] args) {
        String username0 = "admin";
        String password0 = "123";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入账号");
        String username = scanner.next();
        System.out.println("请输入密码");
        String password = scanner.next();
        if (username.equals(username0)&&password.equals(password0)){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
    }

}
