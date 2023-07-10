package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			while (hasId(list, id)) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			Employee employee = new Employee(id, name, salary);
			list.add(employee);
		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		int idSalary = sc.nextInt();
		Employee employee = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

		if (employee == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			employee.increaseSalary(percent);
		}

		System.out.println();
		System.out.println("List of employees:");

		for (Employee emp : list) {
			System.out.println(emp);
		}

		sc.close();
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return employee != null;
	}
	
}
