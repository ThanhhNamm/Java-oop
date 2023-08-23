package Exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Congnhan john = new Congnhan("Nam",21,"male","Nam Định",1);
        Kysu adam = new Kysu("Adam",39,"male","New York City","Software Engineer");
        Nhanvien ruri =  new Nhanvien("Ruri",59,"female","Japan","Nhân viên pha chế");

        System.out.println(john.toString());
        System.out.println(adam.toString());
        System.out.println(ruri.toString());



    }
}


