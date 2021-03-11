package maven_emp_wage_computation;

public class emp_wage_runner {
		
		//Constants
		public static final int IS_PART_TIME = 1;
		public static final int IS_FULL_TIME = 2;
		public static final int EMP_RATE_PER_HOUR = 20;
		public static final int NUM_WORKING_DAYS = 20;
		public static final int MAX_WORKING_HRS = 100;
		
		
		public static void main(String[] args) {
				
				//Variables
				int empHrs = 0, empWage = 0 , totalEmpWage = 0, totalEmpHrs = 0, day_of_month = 0 ;
	
				//Computation
				while ( day_of_month < NUM_WORKING_DAYS && totalEmpHrs <= MAX_WORKING_HRS ){
					
						int empcheck = (int) Math.floor(Math.random() * 10) % 3;
						
						switch (empcheck) { 
						case IS_FULL_TIME:
							empHrs = 8;
							break;
						case IS_PART_TIME:
							empHrs = 4;
							break;
						default:
							empHrs = 0;
						}
						empWage = empHrs*EMP_RATE_PER_HOUR;
						totalEmpWage += empWage; 
						totalEmpHrs += empHrs;
						day_of_month++;
						
				System.out.printf("Employee's Wage for day %d is : %d\n",day_of_month, empWage);
				}
				
				System.out.printf("\nEmployee's Wage for the month is %d\n" , totalEmpWage);
				System.out.printf("Employee Worked for %d hours\n" , totalEmpHrs);
		}
}
