package maven_emp_wage_computation;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpWageRunner {
		
		//Class Variables
		ArrayList<Company> companyList = new ArrayList<Company>();
		
		
		public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				EmpWageRunner runnerObject = new EmpWageRunner();
				
				runnerObject.createMultipleCompany(runnerObject, sc);
				runnerObject.displayAllCompanyData();
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		public Company createCompany(Scanner sc) {
			
			System.out.printf("Enter Name of new Company to Add : \n");
			String companyName = sc.next();
			System.out.printf("Enter hourly wage rate for %s : \n" , companyName);
			int empRatePerHour = sc.nextInt();
			System.out.printf("Enter working days in a month for %s : \n" , companyName);
			int numWorkingDays = sc.nextInt();
			System.out.printf("Enter max allowed work hours in a month for %s : \n" , companyName);
			int maxWorkingHours = sc.nextInt();
			
			Company newCompany = new Company(companyName, empRatePerHour, numWorkingDays, maxWorkingHours);
			createMultipleEmployee(sc, newCompany);
			return newCompany;
			
		}
		
		/*Query 1 : Why can I not move the above function to Company class ?*/
		
		
		public void createMultipleCompany(EmpWageRunner runnerObject,  Scanner sc) {
			
			System.out.printf("Enter Number of new Company to Add : \n");
			int newCompanyNumber = sc.nextInt();
			
			for (int i = 0; i < newCompanyNumber; i++) {
			
				runnerObject.companyList.add(createCompany(sc));
				
			}
			
		}
		
		public void displayAllCompanyData() {
			
			for (int i = 0; i < this.companyList.size(); i++) {
				this.companyList.get(i).displayCompanyDetails();
			}
			
		}
		
		public Employee createEmployee(Scanner sc , Company currentCompany) {
			
			System.out.printf("Enter Name of Employee to Add : \n");
			String employeeName = sc.next();
			
			
			Employee newEmployee = new Employee(employeeName, currentCompany, 0, 0, 0);
			return newEmployee;
			
		}
		
		public void createMultipleEmployee(Scanner sc , Company currentCompany) {
			
			System.out.printf("Enter number of new Employees to Add to %s: \n" , currentCompany.companyName);
			int employeeNumber = sc.nextInt();
			
			for (int i = 0; i < employeeNumber; i++) {
				
				createEmployee(sc, currentCompany);
				
			}
			
		}
		
		
		
		
		
		
		
}
