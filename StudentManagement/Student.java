package StudentManagement;

import java.util.Scanner;

public class Student extends Person {

    String studentID;
    float mark;
    String email;

    public Student(String name, String gender, String birthday, String address, String studentID, float mark, String email) {
        super(name, gender, birthday, address);
        this.studentID = studentID;
        this.mark = mark;
        this.email = email;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public float getMark() {
        return mark;
    }

    public boolean setMark(float mark) {
        if (mark >= 0 && mark <= 10) {
            this.mark = mark;
            return true;
        }
       else {
            System.out.println("Điểm lớn hơn hoặc bằng 0 và nhỏ hơn hoặc bằn 10");
        }
       return false;
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if(email.contains("@")){
            this.email = email;
            return true;
        }

        else {
            System.out.println("Email sai định dạng. Dạng đúng của email: abc@gmail.com");
        }
        return false;
    }

    @Override
    public void input() {
        super.input();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter student ID: ");
        studentID = scan.nextLine();

        System.out.println("Enter mark: ");
        while(!setMark(Float.parseFloat(scan.nextLine()))) {
            System.out.println("Enter mark again");
        }

        System.out.println("Enter email: ");
        while(true) {
            email = scan.nextLine();

            if(setEmail(email)) {
                break;
            }
            else {
                System.out.println("Enter email again!");
            }
        }



    }

    @Override
    public void display() {
        super.display();
        System.out.println("Student ID: " + studentID +
                            "has mark is: " + mark +
                            "with email is: " + email);
    }

    public static void main(String[] args) {
       Student student1 = new Student("Nam","male","1/9/2001","Nam Định","1901040141",6,"tnam2k1.it@gmail.com");
       student1.input();
       student1.display();

    }

}
