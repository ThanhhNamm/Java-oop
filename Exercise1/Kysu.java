package Exercise1;

public class Kysu extends Canbo {
    private String nganhdaotao;
    public Kysu(String name, int age, String gender, String address, String nganhdaotao) {
        super(name, age, gender, address);
        this.nganhdaotao = nganhdaotao;
    }

    public void setNganhdaotao(String nganhdaotao) {
        this.nganhdaotao = nganhdaotao;
    }

    public String getNganhdaotao() {
        return nganhdaotao;
    }

    @Override
    public String toString() {
        return "Kỹ sư tên là: " + name +
                " là chuyên gia của lĩnh vực: " + nganhdaotao +
                ", giới tính: " + gender +
                ", năm nay " + age +
                " tuổi, và đang ở " + address;
    }
}
