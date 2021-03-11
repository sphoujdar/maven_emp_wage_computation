package maven_emp_wage_computation;

public class emp_wage_runner {
		
		//Constants
		public static final int IS_PART_TIME = 1;
		public static final int IS_FULL_TIME = 2;
		public static final int EMP_RATE_PER_HOUR = 20;
		public static final int NUM_WORKING_DAYS = 4;
		
		
		public static void main(String[] args) {
				
				//Variables
				int empHrs = 0;
				int empWage = 0;
				int totalEmpWage = 0;
				
	
				//Computation
				for (int day = 0 ; day < NUM_WORKING_DAYS ; day++){
					
						int empcheck = (int) Math.floor(Math.random() * 10) % 3;
						
						switch (empcheck) { 
						case IS_FULL_TIME:
							empHrs = 8;
							break;
						case IS_PART_TIME:
							empHrs = 4;
							break;
						}
						empWage = empHrs*EMP_RATE_PER_HOUR;
						totalEmpWage += empWage;
				System.out.printf("Emp Wage for day %d is : %d\n",day, empWage);
				}
				
				System.out.printf("\nEmp Wage for the month is %d\n" , totalEmpWage);
		}
}
