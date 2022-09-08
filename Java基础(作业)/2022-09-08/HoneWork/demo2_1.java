import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @PROJECT_NAME: 大数据实训
 * @DESCRIPTION:
 * @USER: 韩冰
 * @DATE: 2022/9/8 0008 15:14
 */
public class demo2_1 {

    static User[] users= new User[100];
    static int k = 0; //数组下标,注册成功一个就+1
    static int v = -1; //当前登录用户
    static int m = 3; //剩余登录次数
    static int n = 1; //抽奖次数
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        index();
    }

    public static void index(){
        int i;

        System.out.println("************欢迎进入抽奖系统************");
        System.out.println("                1.注册");
        System.out.println("                2.登录");
        System.out.println("                3.抽奖");
        System.out.println("*************************************");
        i = scanner.nextInt();
        switch (i) {
            case 1:
                zhuce();
                if (jixu()){
                    index();
                }else {
                    break;
                }
            case 2:
                denglu();
                if (jixu()){
                    index();
                }else {
                    break;
                }
            case 3:
                choujiang();
                if (jixu()){
                    index();
                }else {
                    break;
                }
            default:
                System.out.println("输入错误,请重新输入");
                index();
        }

    }


    public static boolean jixu(){
        System.out.println("继续吗(y/n)");
        String next = scanner.next();
        if (next.equals("y")){
            return true;
        }else {
            return false;
        }
    }

    public static void zhuce(){
        System.out.println("系统->注册");
        System.out.println("填写个人信息");
        System.out.println("账号:");
        String username = scanner.next();
        System.out.println("密码:");
        String password = scanner.next();
        if(username.isEmpty()||password.isEmpty()){
            System.out.println("账号或密码为空,请重输入");
            zhuce();
        }else {
            users[k] = new User();
            users[k].setUsername(username);
            users[k].setPassword(password);
            users[k].setNumber(new Random().nextInt(9999));//随机四位数

        }
        System.out.println("注册成功");
        System.out.println("账号:"+users[k].getUsername() + " 密码"+users[k].getPassword()
                +" 卡号"+users[k].getNumber());
        k++;
    }


    private static void denglu() {
        m--;
        if (m <= 0) {
            System.out.println("登录次数用完,无法登录");
            return;
        }
        System.out.println("请输入账号:");
        String username  = scanner.next();
        System.out.println("请输入密码:");
        String password  = scanner.next();
        for (int i = 0; i < users.length; i++) {
            if(users[i]==null){
                break;
            }

            if (users[i].getUsername().equals(username)&&users[i].getPassword().equals(password)){
                System.out.println("登录成功");
                v = i;//记录登录下标
                return;
            }

        }
        System.out.println("登录失败,请重试!");
        return;
    }

    public static void choujiang(){
        if(v == -1){
            System.out.println("抱歉,您未登录,请登录");
            return;
        }


        if(n<=0){
            System.out.println("抽奖次数已用完");
            return;
        }


        int zhongjiang[] = new int[5];

        for (int i = 0; i < zhongjiang.length; i++) {
            zhongjiang[i]=new Random().nextInt(9999);
        }

        System.out.println(Arrays.toString(zhongjiang));

        for (int i : zhongjiang) {
            if(i == users[v].getNumber()){
                System.out.println("恭喜您中奖了");
            }
        }
        System.out.println("很遗憾,未中奖");
        n--;
    }

}
