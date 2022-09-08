/**
 * @PROJECT_NAME: 大数据实训
 * @DESCRIPTION:
 * @USER: 韩冰
 * @DATE: 2022/9/8 0008 0:41
 */
public class algorithm1_4 {
    public static void main(String[] args) {
        dayin(5); //上最大三角的层数
    }
    public static void dayin(int cengsu){
        int max = cengsu*2-1;

        //上三角
        for (int i=1;i<=max;i=i+2){ //遍历每层
            int j = (max - i)/2;

            for (int i1 = 0; i1 < j; i1++) {
                System.out.print(" ");
            }
            for (int i1 = 0; i1 < i; i1++) {
                System.out.print("*");
            }

            for (int i1 = 0; i1 < j; i1++) {
                System.out.print(" ");
            }
            System.out.println("");
        }

        //下三角
        for (int i=max-2;i>=1;i=i-2){ //遍历每层
            int j = (max - i)/2;

            for (int i1 = 0; i1 < j; i1++) {
                System.out.print(" ");
            }
            for (int i1 = 0; i1 < i; i1++) {
                System.out.print("*");
            }

            for (int i1 = 0; i1 < j; i1++) {
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
