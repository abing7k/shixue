import java.util.Scanner;

/**
 * @PROJECT_NAME: 大数据实训
 * @DESCRIPTION:
 * @USER: 韩冰
 * @DATE: 2022/9/8 0008 0:34
 */
public class algorithm3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年龄");
        int i = scanner.nextInt();
        if(i>0&&i<=12){
            System.out.println("儿童");
        }
        if(i>13&&i<=45){
            System.out.println("青年");
        }

        if(i>45){
            System.out.println("老年");
        }
    }
}
