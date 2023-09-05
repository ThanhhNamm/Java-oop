package managetHotel;

import StudentManagement.Person;

import java.util.ArrayList;
import java.util.List;

public class Management {

    private List<Customer> customers;
    public Management() {
    customers = new ArrayList<>();
    }

    public void add (Customer customer) {
        this.customers.add(customer);

    }
    public void show() {
        this.customers.forEach(p -> System.out.println(p.toString()));
    }
}
