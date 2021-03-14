package maven_emp_wage_computation;

public class emp_wage_runner {
		
		public static void main(String[] args) {
	
			
				Company reliance = new Company("Reliance", 20, 15, 90);
				Company dMart = new Company("D-Mart", 25, 14, 80);
				
				Employee employee1 = new Employee("Shubham",reliance,0,0,0);
				Employee employee2 = new Employee("Prince",dMart,0,0,0);
				
				employee1.calc_employee_wage(employee1);
				employee1.displayEmployeeDetails(employee1);
				
				employee2.calc_employee_wage(employee2);
				employee2.displayEmployeeDetails(employee2);
		}
}
