package managetHotel;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Customer {

    String name;
    int age;
    String idNo;

    public Customer(String name, int age, String idNo) {
        this.name = name;
        this.age = age;
        this.idNo = idNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
            this.idNo = idNo;
    }

    @Override
    public String toString() {
        return "Customer { "
                + "name: " + name
                + ", age: " + age
                + ", and the ID number: " + idNo + " vc";
    }

}
