package StudentManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static  Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

    ArrayList<Student> studentList = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        int choose;

        do{
            showMenu();
            choose = Integer.parseInt(scan.nextLine());
            switch (choose) {
                case 1:
                    inputStudent(studentList);
                    break;


                case 2:
                    showStudent(studentList);
                    break;


                case 3:
                    System.out.println("Exit");
                    break;

                case 4:
                    System.out.println("Enter again");
            }

        } while (choose != 3 );
    }

    static void inputStudent(ArrayList<Student> studentList) {
        System.out.println("Input number of student you wanna add: ");
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            Student std = new Student();
            std.input();
        }
    }

    static void showStudent(ArrayList<Student> studentList) {
    }

    static void showMenu() {
        System.out.println("1. Enter information of student");
        System.out.println("2. Show all of students");
        System.out.println("Choose: ");
    }
}
