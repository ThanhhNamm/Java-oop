package Exercise1;

public class Nhanvien extends Canbo {
    private String congviec;
    public Nhanvien(String name, int age, String gender, String address, String congviec) {
        super(name, age, gender, address);

        this.congviec = congviec;
    }
    public void setCongviec(String congviec) {
        this.congviec = congviec;
    }
    public String getCongviec() {
        return congviec;
    }

    @Override
    public String toString() {
        return "Nhân viên tên là: " + name +
                " hiện tại đang làm công việc: " + congviec +
                ", giới tính: " + gender +
                ", năm nay " + age +
                " tuổi, và đang ở " + address;
    }
}
