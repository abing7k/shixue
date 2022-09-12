package pojo;

/**
 * @PROJECT_NAME: 大数据实训
 * @DESCRIPTION:
 * @USER: 韩冰
 * @DATE: 2022/9/12 0012 10:18
 */
public class Data01 {
    private int year;
    private int momth;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMomth() {
        return momth;
    }

    public void setMomth(int momth) {
        this.momth = momth;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Data01(int year, int momth, int day) {
        this.year = year;
        this.momth = momth;
        this.day = day;
    }
}
