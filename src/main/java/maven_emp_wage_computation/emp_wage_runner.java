package maven_emp_wage_computation;

public class emp_wage_runner {
		
		//Constants
		public static final int IS_PART_TIME = 1;
		public static final int IS_FULL_TIME = 2;
		public static final int EMP_RATE_PER_HOUR = 20;
		public static final int NUM_WORKING_DAYS = 20;
		public static final int MAX_WORKING_HRS = 100;
		
		
		public static void main(String[] args) {
	
				Employee employee1 = new Employee(0,0,0);
				employee1.calc_employee_wage(employee1);
				
		}
}
