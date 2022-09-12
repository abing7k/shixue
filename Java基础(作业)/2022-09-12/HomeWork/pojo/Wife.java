package pojo;

/**
 * @PROJECT_NAME: 大数据实训
 * @DESCRIPTION:
 * @USER: 韩冰
 * @DATE: 2022/9/12 0012 10:20
 */


public class Wife {
    private double id;
    private String name;
    private String sex;
    private Husband man;

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

    public Husband getMan() {
        return man;
    }

    public void setMan(Husband man) {
        this.man = man;
    }

    public Wife() {
    }

    public Wife(double id, String name, String sex, Husband man) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.man = man;
    }

    @Override
    public String toString() {
        return "pojo.Wife{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", man=" + man +
                '}';
    }
}
