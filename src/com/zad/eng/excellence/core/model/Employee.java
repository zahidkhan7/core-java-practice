package com.zad.eng.excellence.core.model;

import java.util.Comparator;

/* 
 Explanation with example for  HashCode and Equals methods:
 http://tutorials.jenkov.com/java-collections/hashcode-equals.html
 
 */
public class Employee {

    protected int employeeId;
    protected String firstName;
    protected String lastName;

    public Employee(int empId, String fname, String lname) {
        this.employeeId = empId;
        this.firstName = fname;
        this.lastName = lname;
    }

    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof Employee))
            return false;

        Employee other = (Employee) obj;
        return this.employeeId == other.employeeId;
    }

    public int hashCode() {
        return (int) employeeId;
    }

    public String toString() {
        return "EmployeeId: " + this.employeeId + " " + "Employee Name : "
                + this.firstName + " " + this.lastName;
    }

    /*
     We want that equality should be defined on the 
     basis of employeeId,firstName & lastName 
     */
     
    /*
	public boolean equals(Object object) {
		if (object == null)
			return false;
		if (!(object instanceof Employee))
			return false;

		Employee other = (Employee) object;
		if (this.employeeId != other.employeeId)
			return false;
		if (!this.firstName.equals(other.firstName))
			return false;
		if (!this.lastName.equals(other.lastName))
			return false;

		return true;
	}
	*/
    

    /*
     We want that hashCode should be generated 
     considering employeeId,firstName & lastName 
     */
    
    /*
	public int hashCode() {
		return (int) employeeId * firstName.hashCode() * lastName.hashCode();
	}
	*/

    public static final Comparator<Employee> IdComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee emp1, Employee emp2) {
            return emp1.employeeId - emp2.employeeId;
        }

    };

    public static final Comparator<Employee> firstNameComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee emp1, Employee emp2) {
            return emp1.firstName.compareToIgnoreCase(emp2.firstName);
        }
    };

    public static final Comparator<Employee> lastNameComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee emp1, Employee emp2) {

            return emp1.lastName.compareToIgnoreCase(emp2.lastName);
        }

    };
}
