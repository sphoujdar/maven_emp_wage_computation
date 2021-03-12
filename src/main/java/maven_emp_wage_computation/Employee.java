package maven_emp_wage_computation;

public class Employee {
	
	//Class Variables
	int empHrs = 0, empWage = 0 , totalEmpWage = 0, totalEmpHrs = 0, total_days_worked = 0 ;
	
	public static int calc_employee_wage(Employee employee1) {
		
		while ( employee1.total_days_worked < emp_wage_runner.NUM_WORKING_DAYS 
				&& employee1.totalEmpHrs <= emp_wage_runner.MAX_WORKING_HRS ){
			
			
				int empcheck = (int) Math.floor(Math.random() * 10) % 3;
				
				switch (empcheck) { 
				case emp_wage_runner.IS_FULL_TIME:
					empHrs = 8;
					break;
				case emp_wage_runner.IS_PART_TIME:
					empHrs = 4;
					break;
				default:
					empHrs = 0;
				}
				empWage = empHrs*EMP_RATE_PER_HOUR;
				totalEmpWage += empWage; 
				totalEmpHrs += empHrs;
				total_days_worked++;
				
		System.out.printf("Employee's Wage for day %d is : %d\n",total_days_worked, empWage);
		}
		
		
	}
}
