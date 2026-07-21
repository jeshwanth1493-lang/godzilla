package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "John",
                "Alice",
                "Bob",
                "Andrew",
                "Adam"
        );

        List<String> result =  names.stream().filter(name -> name.startsWith("A")).map(String::toUpperCase).toList();
        System.out.println(result);

        List<Employee> employees = Arrays.asList(
                new Employee(1L, "John", "Engineering", 100000.0, 30,"MALE"),
                new Employee(2L, "Alice", "Engineering", 120000.0, 28,"FEMALE"),
                new Employee(3L, "Bob", "HR", 90000.0, 35,"MALE"),
                new Employee(4L, "David", "Finance", 110000.0, 32,"MALE"),
                new Employee(5L, "Eva", "Engineering", 130000.0, 27,"FEMALE"),
                new Employee(6L, "Jesh", "Engineering", 130000.0, 27,"MALE")
        );

        //Sort Employees based on salary in ascending order(3,1,4,2,5)
        List<Employee> employeeResult = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).toList();
        System.out.println(employeeResult);

        //Sort Employees based on salary in desc order(3,1,4,2,5)
        List<Employee> employeeResultdesc = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).toList().reversed();
        System.out.println(employeeResultdesc);

        //Second highest salary
        Optional<Employee> employeeResult2nd = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
        System.out.println(employeeResult2nd);

        //Second highest salary
        Double salary2ndDistinct = employees.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        List<Employee> secondDistinct = employees.stream().filter(emp -> emp.getSalary().equals(salary2ndDistinct)).toList();
        System.out.println(secondDistinct);

        //Department - List<Employee>
        Map<String ,List<Employee>> mapDepartEmployee = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(mapDepartEmployee);

        //Department - no of Employees
        Map<String, Long> countByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(countByDept);

        //Average department salary
        Map<String, Double> avgSalaryByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalaryByDept);

        //Highest salaries person in the Department
        Map<String, Optional<Employee>> highestPaidByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println(highestPaidByDept);

        //Depart and Names of employee
        Map<String, List<String>> namesByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName,Collectors.toList())));
        System.out.println(namesByDept);

        //Higest paid Employee in each department
        Map<String, Optional<Employee>> highestPaidByDept1 = employees.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)
        )));
        System.out.println(highestPaidByDept1);

        //Sort pased on Salary and then on the id
        List<Employee> sortedEmployees = employees.stream()
                .sorted(
                        Comparator.comparingDouble(Employee::getSalary)
                                .thenComparing(Employee::getId)
                )
                .toList();
        System.out.println(sortedEmployees);

        List<Employee> sortedEmployeesDesc = employees.stream()
                .sorted(
                        Comparator.comparingDouble(Employee::getSalary).reversed()
                                .thenComparing(Employee::getId)
                )
                .toList();
        System.out.println(sortedEmployeesDesc);



        //Filter only even numbers.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> result1 = numbers.stream().filter(num -> num % 2 ==0).toList();
        System.out.println(result1);

        List<Integer> result2 = numbers.stream().map(num -> num*10).toList();
        System.out.println(result2);

        //FIlter th even numbers and nultiple by 10
        List<Integer> result3 = numbers.stream().filter(num -> num % 2 ==0).map(num -> num*10).toList();
        System.out.println(result3);

        List<String> names1 = Arrays.asList(
                "John",
                "Alice",
                "Bob",
                "Andrew",
                "David"
        );
        names1.stream().filter(name -> name.length()>4).map(n -> n.toUpperCase()).toList();

        List<Employee> employees1 = Arrays.asList(
                new Employee(1L, "John", "Engineering", 100000.0, 30,"MALE"),
                new Employee(2L, "Alice", "Engineering", 120000.0, 28,"FEMALE"),
                new Employee(3L, "Bob", "HR", 90000.0, 35,"MALE"),
                new Employee(4L, "David", "Finance", 110000.0, 32,"MALE")
        );

        //List of names of Employees whose salary is > 100000
        List<String> name = employees1.stream().filter(sal -> sal.getSalary()>100000).map(Employee::getName).toList();
        System.out.println("H"+name);


        List<Employee> employees2 = Arrays.asList(
                new Employee(1L, "John", "Engineering", 100000.0, 30,"MALE"),
                new Employee(2L, "Alice", "Engineering", 120000.0, 28,"FEMALE"),
                new Employee(3L, "Bob", "HR", 90000.0, 35,"MALE"),
                new Employee(4L, "David", "Finance", 110000.0, 32,"MALE")
        );

        //List Emp-Department where age>30
        List<String> result4 = employees2.stream().filter(emp -> emp.getAge()>30).map(e-> e.getName() +"-"+e.getDepartment()).toList();
        System.out.println("result4:"+result4);

        //List Name-salary: Department =Enginering and salary>100000
        List<String> result5 = employees2.stream().filter(emp->emp.getDepartment().equals("Engineering")).filter(e->e.getSalary()>100000)
                .map(e-> e.getName()+"("+e.getSalary()+")").toList();
        System.out.println(result5);

        //belong to "Engineering": are older than 25:have salary greater than 100000
        List<Long> ids = employees2.stream().filter(e1-> e1.getDepartment().equals("Engineering")).filter(e2->e2.getAge()>25).filter(e3->e3.getSalary()>100000).map(Employee::getId).toList();
        System.out.println(ids);

        //Employee Salary is Ascending order
        List<String> na = employees2.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).map(Employee::getName).toList();
        System.out.println(na);

        //salary > 100000 : sorted by salary descending
        List<Employee> na1 = employees2.stream().filter(a-> a.getSalary()>100000).sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).toList();
        System.out.println(na1);

        //Sort based on Salary highest salary : and then on Age
        employees2.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed().thenComparing(Employee::getAge)).toList();

        //Department = "Engineering": Salary > 100000 : Sort by Salary DESC : If salary is same, sort by Name ASC : Convert names to uppercase
        employees2.stream().filter(e->e.getDepartment().equals("Engineering") && e.getSalary()>100000).sorted(Comparator.comparingDouble(Employee::getSalary).reversed().thenComparing(Employee::getName))
                .map(e4->e4.getName().toUpperCase() +"-"+e4.getSalary()).toList();

        //Department = Engineering :Salary > average salary of all employees :Sort by salary descending :If salary is same, sort by age ascending :Convert name to uppercase
        Double average =  employees.stream().mapToDouble(Employee::getSalary).average().orElse(0);
        employees2.stream().filter(e->e.getDepartment().equals("Engineering") && e.getSalary()>average).sorted(Comparator.comparingDouble(Employee::getSalary).reversed().thenComparing(Employee::getAge))
                .map(e4->e4.getName().toUpperCase() +"-"+e4.getSalary()).toList();

        //Top 3 paid Employee
        List<Employee> emp =  employees2.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3).toList();



        //Top 3 salaries Employee distinct
        List<Double> salary1 = employees2.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).limit(3).toList();

        //3rd highest distinct salary:
        Double distinctSalary = employees2.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElse(0.0);
        //Employee with 3rd highest distinct salary
        List<Employee> emp1 =  employees2.stream().filter(e -> e.getSalary().equals(distinctSalary)).toList();

        //Hoe many male and female
        Map<String ,Long> malefemale = employees2.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(malefemale);

        //Average salary of male and female
        Map<String ,Double> malefemaleSalary = employees2.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(malefemaleSalary);

        List<Integer> numb = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<Boolean, Integer> oddEvenSUm =numb.stream().collect(Collectors.partitioningBy(n->n%2==0,Collectors.summingInt(Integer::intValue)));
        System.out.println("Even:"+oddEvenSUm.get(true));
        System.out.println("ODD:"+oddEvenSUm.get(false));

        List<Integer> numbs =  Arrays.asList(1, 2, 3, 4, 2, 5, 3, 6, 1);
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates =numbs.stream().filter(n-> !set.add(n)).collect(Collectors.toSet());
        System.out.println(duplicates);
    }
}
