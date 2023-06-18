package com.zad.eng.excellence.core.util;

import java.util.ArrayList;
import java.util.List;

import com.zad.eng.excellence.core.model.Customer;
import com.zad.eng.excellence.core.model.Employee;
import com.zad.eng.excellence.core.model.Person;

public class DataSetPreperationUtil {

    public static List<Person> buildPersonList() {
        List<Person> personCollection = new ArrayList<>();
        Person person1 = new Person("Mohan", 22);
        Person person2 = new Person("Danish", 34);
        Person person3 = new Person("Mahreen", 32);
        Person person4 = new Person("Shohan", 26);
        Person person5 = new Person("Rakesh", 37);
        Person person6 = new Person("Raghavendra", 28);

        personCollection.add(person1);
        personCollection.add(person2);
        personCollection.add(person3);
        personCollection.add(person4);
        personCollection.add(person5);
        personCollection.add(person6);
        return personCollection;

    }


    public List<String> buildListOfNames() {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("Danish");
        stringCollection.add("Imran");
        stringCollection.add("Javed");
        stringCollection.add("Rajesh");
        stringCollection.add("Jagan");
        stringCollection.add("Shahid");
        return stringCollection;
    }

    /**** Helper Method #1 - This Method Prepares Employee List ****/
    public static List<Employee> buildListOfEmployee() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(105, "Harry", "Shocking"));
        employees.add(new Employee(108, "Daniel", "Wood"));
        employees.add(new Employee(110, "Lucifer", "Column"));
        employees.add(new Employee(102, "Aprilus", "Mark"));
        employees.add(new Employee(104, "Toby", "Sen"));
        employees.add(new Employee(105, "Harry ", "Poter"));
        employees.add(new Employee(102, "Aprilus ", "Poter"));
        return employees;
    }

    public static List<Customer> buildCustomerList() {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(
                new Customer(105, "Harry", "Shocking@abc.com", 8974758724L));
        customerList
                .add(new Customer(108, "Daniel", "Wood@abc.com", 8972358724L));
        customerList.add(
                new Customer(110, "Lucifer", "Column@abc.com", 8912758724L));
        customerList
                .add(new Customer(102, "Aprilus", "Mark@abc.com", 8974758224L));
        customerList.add(new Customer(104, "Toby", "Sen@abc.com", 8974758334L));
        customerList
                .add(new Customer(105, "Harry ", "Poter@abc.com", 8974758744L));
        return customerList;

    }

}
