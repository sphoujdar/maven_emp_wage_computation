package maven_emp_wage_computation;

public class emp_wage_runner {
		
		public static void main(String[] args) {
	
			
				Company reliance = new Company("Reliance", 20, 15, 90);
				Company dMart = new Company("D-Mart", 25, 14, 80);
				
				Employee employeeR1 = new Employee("Shubham",reliance,0,0,0);
				employeeR1.displayEmployeeDetails(employeeR1);
				Employee employeeR2 = new Employee("Prince",reliance,0,0,0);
				employeeR2.displayEmployeeDetails(employeeR2);
				
				Employee employeeD1 = new Employee("Manisha",dMart,0,0,0);
				employeeD1.displayEmployeeDetails(employeeD1);
				Employee employeeD2 = new Employee("Shivani",dMart,0,0,0);
				employeeD2.displayEmployeeDetails(employeeD2);
		
				reliance.displayCompanyDetails(reliance);
				dMart.displayCompanyDetails(dMart);
				
		}
}
