/**
 * @PROJECT_NAME: 大数据实训
 * @DESCRIPTION:
 * @USER: 韩冰
 * @DATE: 2022/9/8 0008 0:21
 */
public class algorithm2 {
    public static void main(String[] args) {
        int m=0;
        for (int i=2;i<=10000;i++){
            if (suzhu(i)){
                System.out.print(i+" ");
                m++;
                if (m%8==0 &&m>7){
                    System.out.println("");
                }
            }
        }
    }

    public static boolean suzhu(int i){
        for (int j = i-1;j>=2;j--){
            if (i%j==0){
                return false;
            }
        }
        return true;
    }
}
