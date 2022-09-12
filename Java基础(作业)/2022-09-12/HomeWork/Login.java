import java.util.Scanner;

/**
 * @PROJECT_NAME: 大数据实训
 * @DESCRIPTION:
 * @USER: 韩冰
 * @DATE: 2022/9/12 0012 18:28
 */
public class Login {
    public static void main(String[] args) {
        String username = "admin";
        String password = "123";
        Scanner scanner = new Scanner(System.in);
        for (int i = 3; i > 0; i--) {
            System.out.println("请输入账号:");
            String name = scanner.next();
            System.out.println("请输入密码:");
            String pwd = scanner.next();
            if (username.equals(name) && password.equals(pwd)){
                System.out.println("登录成功");
                break;
            }else {
                System.out.println("登录失败,请重新登录,剩余"+(i-1)+"次机会");
            }
        }
    }
}
