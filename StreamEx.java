package com.code;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> employees=new ArrayList<>();
		employees.add(new Employee(1, "Thahir", 75000));
		employees.add(new Employee(2, "Arfan", 70000));
		employees.add(new Employee(3, "Ahsan", 90000));
		employees.add(new Employee(4, "Rila", 50000));
		employees.add(new Employee(5, "Rifa", 50000));
//Print emp Salary
		//employees.stream().map(Employee::getEmpSalary).distinct().forEach(System.out::println);
	//Print emp salary with counting
//		Map<Long, Long> employeeCount=employees.stream()
//				.collect(Collectors.groupingBy(Employee::getEmpSalary,Collectors.counting()));
//		System.out.println(employeeCount);

		//Avg salary
		Map<String, Double> avgSal = employees.stream()
				.collect(Collectors.groupingBy(Employee::getEmpName, Collectors.averagingDouble(Employee::getEmpSalary)));
		System.out.println(avgSal);
		
		
		//		//1.print employee details
		//employees.stream().forEach(Employee->System.out.println(employees));
	
		
		//2.print the employee data by sorting employee salaries in descending order
		//List<Employee> sortedDecOrder=employees.stream().sorted((Comparator.comparingLong(Employee::getEmpSalary).reversed())).collect(Collectors.toList());
			
		//sortedDecOrder.forEach(employee -> System.out.println(employee));
	
	//3.Filter the employee names starting with J
		
		//employees.stream().filter(employee ->employee.getEmpName().startsWith("A"))
		//.collect(Collectors.toList())
		//.forEach(System.out::println);
		
		
		//4.Add 10000 to each employees salary and print
		
//		List<Long> salary=employees.stream()
//				.map(employee ->employee.getEmpSalary() + 10000)
//				.collect(Collectors.toList());
//		salary.forEach(System.out::println);
	
	//5.Return the employee object having max salary
		Employee employee= employees.stream().reduce(
				(employee1, employee2) ->
				employee1.getEmpSalary() > employee2.getEmpSalary() ? employee1:employee2)
				.get();
		
		System.out.println("Employee have max salaryus::" +employee);
		
		
	}

}
