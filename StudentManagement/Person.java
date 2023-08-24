package StudentManagement;

import java.util.Scanner;

public abstract class Person {
    String name;
    String gender;
    String birthday;
    String address;

    public Person(String name, String gender, String birthday, String address) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirday(String birday) {
        this.birthday = birday;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public void input(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name: ");
        name = scan.nextLine();

        System.out.println("Enter gender: ");
        gender = scan.nextLine();

        System.out.println("Enter birthday: ");
        birthday = scan.nextLine();

        System.out.println("Enter address: ");
        address = scan.nextLine();

    }

    public void display() {
        System.out.println("Tên học sinh là: \n Giới tính: \n Ngày sinh: \n Địa chỉ: ");
    }
}
