import pojo.Husband;
import pojo.Wife;

/**
 * @PROJECT_NAME: 大数据实训
 * @DESCRIPTION:
 * @USER: 韩冰
 * @DATE: 2022/9/12 0012 10:33
 */
public class Test {
    public static void main(String[] args) {
        Husband husband = new Husband(410, "", "", null);
        Wife wife = new Wife(410, "", "", husband);
        System.out.println(6);

//        husband.setWoman(wife);
//        wife.setMan(husband);
//        husband.setWoman(wife);
//
//        System.out.println(wife);
//        System.out.println(husband);

    }
}
