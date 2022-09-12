import java.util.Random;

/**
 * @PROJECT_NAME: 大数据实训
 * @DESCRIPTION:
 * @USER: 韩冰
 * @DATE: 2022/9/12 0012 18:16
 */
public class YanZhengMa {
    public static void main(String[] args) {
        String pool = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789";
        String Yanzhengma = "";
        Random random = new Random();
        int lenth =  pool.length();

        System.out.println(Yanzhengma);
        for (int i = 0; i < 5; i++) {
            Yanzhengma = Yanzhengma + pool.charAt(random.nextInt(lenth));
        }

        System.out.println(Yanzhengma);

    }
}
