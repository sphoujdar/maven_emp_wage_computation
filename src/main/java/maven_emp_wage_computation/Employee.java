package maven_emp_wage_computation;

public class Employee {
	
	//Class Variables
	int totalEmpWage, totalEmpHrs, total_days_worked;

	
	//Constructor to initialize values
	public Employee(int totalEmpWage, int totalEmpHrs, int total_days_worked) {
		super();
		this.totalEmpWage = totalEmpWage;
		this.totalEmpHrs = totalEmpHrs;
		this.total_days_worked = total_days_worked;
	}


	//Class Method to calculate employee wage
	public void calc_employee_wage(Employee employee1) {
		
		int empHrs = 0, empWage = 0; 
		
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
				empWage = empHrs*emp_wage_runner.EMP_RATE_PER_HOUR;
				employee1.totalEmpWage += empWage; 
				employee1.totalEmpHrs += empHrs;
				employee1.total_days_worked++;
				
		System.out.printf("Employee's Wage for day %d is : %d\n",employee1.total_days_worked, empWage);
		}
		
		System.out.printf("\nEmployee's Wage for the month is %d\n" , employee1.totalEmpWage);
		System.out.printf("Employee Worked for %d hours\n" , employee1.totalEmpHrs);
		
	}
}
