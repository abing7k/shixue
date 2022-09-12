package pojo;

/**
 * @PROJECT_NAME: 大数据实训
 * @DESCRIPTION:
 * @USER: 韩冰
 * @DATE: 2022/9/12 0012 10:20
 */
public class Husband {
    private double id;
    private String name;
    private String sex;
    private Wife woman;

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Wife getWoman() {
        return woman;
    }

    public void setWoman(Wife woman) {
        this.woman = woman;
    }

    public Husband() {
    }

    public Husband(double id, String name, String sex, Wife woman) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.woman = woman;
    }

    @Override
    public String toString() {
        return "pojo.Husband{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", woman=" + woman +
                '}';
    }
}
