package Exercise1;
public class Congnhan extends Canbo{

    private int level;
    public Congnhan(String name, int age, String gender, String address, int level) {
        super(name, age, gender, address);
        this.level = level;
    }


    public void setLevel(int level) {
        this.level = level;
    }
    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Công nhân tên là: " + name +
                " có cấp bậc: " + level +
                ", giới tính: " + gender +
                ", năm nay " + age +
                " tuổi, và đang ở " + address;
    }

}

