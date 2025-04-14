package gfg;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee {
    int id;

    String name;

    int age;

    String gender;

    String department;

    int yearOfJoining;

    double salary;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Id : " + id
                + ", Name : " + name
                + ", age : " + age
                + ", Gender : " + gender
                + ", Department : " + department
                + ", Year Of Joining : " + yearOfJoining
                + ", Salary : " + salary;
    }
}

public class Practice2 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        // 1 How many male and female employees are there in the organization?

        // Map<String, Long> collect = employeeList.stream()
        // .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        // System.out.println(collect);

        // 2 Print the name of all departments in the organization?

        // List<String> l =
        // employeeList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
        // System.out.println(l);

        // 3 What is the average age of male and female employees?

        // Map<String, Double> collect = employeeList.stream()
        // .collect(Collectors.groupingBy(Employee::getGender,
        // Collectors.averagingInt(Employee::getAge)));
        // System.out.println(collect);

        // 4 Get the details of highest paid employee in the organization?

        // Optional<Employee> collect = employeeList.stream()
        // .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        // System.out.println(collect.get());

        // 5 Get the names of all employees who have joined after 2015?

        // employeeList.stream().filter(s -> s.getYearOfJoining() >
        // 2015).map(Employee::getName)
        // .forEach(System.out::println);

        // 6 Count the number of employees in each department?

        // Map<String, Long> collect = employeeList.stream()
        // .collect(Collectors.groupingBy(Employee::getDepartment,
        // Collectors.counting()));

        // for (String i : collect.keySet()) {
        // System.out.println(i + "- " + collect.get(i));
        // }

        // 7 What is the average salary of each department?
        // Map<String, Double> collect = employeeList.stream().collect(
        // Collectors.groupingBy(Employee::getDepartment,
        // Collectors.averagingDouble(Employee::getSalary)));

        // System.out.println(collect);

        // 8 Get the details of youngest male employee in the product development
        // department?
        // Optional<Employee> collect = employeeList.stream()
        // .filter(s -> s.getDepartment() == "Product Development" && s.getGender() ==
        // "Male")
        // .collect(Collectors.minBy(Comparator.comparingInt(Employee::getAge)));

        // or

        // Optional<Employee> min = employeeList.stream()
        // .filter(s -> s.getDepartment() == "Product Development" && s.getGender() ==
        // "Male")
        // .min(Comparator.comparingInt(Employee::getAge));
        // Employee e = collect.get();
        // System.out.println(e.getAge());

        // 9 Who has the most working experience in the organization?
        // Optional<Employee> first =
        // employeeList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining))
        // .findFirst();
        // System.out.println(first.get());

        // 10 How many male and female employees are there in the sales and marketing
        // team?
        // Map<String, Long> collect = employeeList.stream().filter(s ->
        // s.getDepartment() == "Sales And Marketing")
        // .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        // System.out.println(collect);

        // 11 What is the average salary of male and female employees?
        // Map<String, Double> collect = employeeList.stream()
        // .collect(Collectors.groupingBy(Employee::getGender,
        // Collectors.averagingDouble(Employee::getSalary)));
        // System.out.println(collect);
        // for (String i : collect.keySet()) {
        // System.out.println(i + " - " + collect.get(i));
        // }

        // 12 List down the names of all employees in each department?
        // Map<String, List<Employee>> collect = employeeList.stream()
        // .collect(Collectors.groupingBy(Employee::getDepartment));

        // for (Map.Entry<String, List<Employee>> mp : collect.entrySet()) {
        // System.out.println(mp.getKey());
        // System.out.println("===============");
        // List<Employee> value = mp.getValue();
        // for (Employee e : value) {
        // System.out.println(e.getName());
        // }
        // System.out.println("===============");
        // }

        // 13 What is the average salary and total salary of the whole organization?
        // DoubleSummaryStatistics collect = employeeList.stream()
        // .collect(Collectors.summarizingDouble(Employee::getSalary));
        // System.out.println("avg - " + collect.getAverage());
        // System.out.println("sum - " + collect.getSum());

        // 14 Separate the employees who are younger or equal to 25 years from those
        // employees who are older than 25 years.
        // Map<Boolean, List<Employee>> collect = employeeList.stream()
        // .collect(Collectors.partitioningBy(s -> s.getAge() <= 25));
        // for (Map.Entry<Boolean, List<Employee>> em : collect.entrySet()) {
        // System.out.println("above --------------");
        // List<Employee> value = em.getValue();
        // for (Employee e : value) {
        // System.out.println(e.getName() + " - " + e.getAge());
        // }
        // System.out.println("below --------------");

        // }

        // 15 Who is the oldest employee in the organization? What is his age and which
        // department he belongs to?
        // Optional<Employee> first =
        // employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
        // Employee e = first.get();
        // System.out.println("Age - " + e.getAge());
        // System.out.println("Department - " + e.getDepartment());

    }
}
