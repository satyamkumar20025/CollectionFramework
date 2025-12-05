package ComparatorQuestion;

import java.util.ArrayList;
import java.util.Collections;

public class Employees implements Comparable<SortByMarks> {

    String name;
    int age;
    int id;
    double salary;

    public Employees(String name, int age, int id, double salary) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employees [name=" + name + ", age=" + age + ", id=" + id + ", salary=" + salary + "]";
    }

    // Comparable: natural ordering (by salary here)
    public int compareTo(Employees e) {
        return Double.compare(this.salary, e.salary);
    }

    public static void main(String[] args) {
        ArrayList<Employees> employees = new ArrayList<>();
        employees.add(new Employees("Satyam", 45, 85, 45500.00));
        employees.add(new Employees("Ravi", 23, 92, 34000.00));
        employees.add(new Employees("Anjali", 16, 78, 234567.00));
        employees.add(new Employees("Calu", 12, 85, 876543.00));
        employees.add(new Employees("Boom", 34, 92, 34567.00));
        employees.add(new Employees("Ali", 12, 85, 23456.00));
        employees.add(new Employees("Shita", 13, 95, 34567.00));
        employees.add(new Employees("Kaliya", 14, 85, 23000.00));
        employees.add(new Employees("Kalu", 15, 92, 34567.00));
        employees.add(new Employees("Motu", 16, 85, 23456.00));
        employees.add(new Employees("Bhura", 17, 95, 45678.00));

        System.out.println("Before sorting:");
        for (Employees e : employees) {
            System.out.println(e.name + "-" + e.age + "-" + e.id + "-" + e.salary);
        }

        // Sorting using Comparator
        Collections.sort(employees, new SortBySalary());

        System.out.println("\nAfter Sorting by Salary:");
        for (Employees e : employees) {
            System.out.println(e.name + "-" + e.age + "-" + e.id + "-" + e.salary);
        }
    }

	@Override
	public int compareTo(SortByMarks o) {
		// TODO Auto-generated method stub
		return 0;
	}
}