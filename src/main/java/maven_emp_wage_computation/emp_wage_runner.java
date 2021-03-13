package maven_emp_wage_computation;

public class emp_wage_runner {
		
		public static void main(String[] args) {
	
				Employee employee1 = new Employee("Shubham",0,0,0);
				employee1.calc_employee_wage(employee1);
				employee1.displayEmployeeDetails(employee1);
		}
}
