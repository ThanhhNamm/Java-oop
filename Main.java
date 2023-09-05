package managetHotel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Management management = new Management();

        while(true) {
            System.out.println("Application Manager Hotel: ");
            System.out.println("Enter 1: To insert person for rent");
            System.out.println("Enter 2: To show information");
            System.out.println("Enter 3: Exit Applicaiton");

            String line = sc.nextLine();

            switch(line) {
                case "1": {
                    System.out.println("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.println("Enter ID number: ");
                    String idNo = sc.nextLine();

                    System.out.println("Enter Age: ");
                    int age = sc.nextInt();
                    

                    System.out.println("-------------------------------");

                    Customer customer = new Customer(name, age, idNo);
                    management.add(customer);
                    sc.nextLine();
                    break;

                }

                case "2": {
                    management.show();
                    break;
                }

                case "3": {
                    return;
                }

                default:
                    System.out.println("Bye");
                    continue;
            }

        }
    }
}
