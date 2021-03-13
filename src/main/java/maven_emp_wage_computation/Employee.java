package maven_emp_wage_computation;

public class Employee {
	
	//Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_WORKING_DAYS = 20;
	public static final int MAX_WORKING_HRS = 100;	
	
	
	//Class Variables
	String empName;
	int totalEmpWage, totalEmpHrs, totalDaysWorked;

	
	//Constructor to initialize values
	public Employee(String empName, int totalEmpWage, int totalEmpHrs, int totalDaysWorked) {
		super();
		this.empName = empName;
		this.totalEmpWage = totalEmpWage;
		this.totalEmpHrs = totalEmpHrs;
		this.totalDaysWorked = totalDaysWorked;
	}


	//Class Method to calculate employee wage
	public void calc_employee_wage(Employee employee1) {
		
		int empHrs = 0, empWage = 0; 
		
		System.out.printf("Calculating Wage for %s:\n\n",employee1.empName);
		
		while ( employee1.totalDaysWorked < NUM_WORKING_DAYS 
				&& employee1.totalEmpHrs <= MAX_WORKING_HRS ){
			
			
				int empCheck = (int) Math.floor(Math.random() * 10) % 3;
				
				switch (empCheck) { 
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
				employee1.totalEmpWage += empWage; 
				employee1.totalEmpHrs += empHrs;
				employee1.totalDaysWorked++;
				
		System.out.printf("Employee's Wage for day %d is : %d\n",employee1.totalDaysWorked, empWage);
		}
		
	}
	
	public void displayEmployeeDetails(Employee employee1) {
		
		System.out.printf("\n\nDisplaying details for %s:\n",employee1.empName);
		System.out.printf("\nEmployee's Wage for the month is %d\n" , employee1.totalEmpWage);
		System.out.printf("Employee Worked for %d hours\n" , employee1.totalEmpHrs);
		
	}
	
	
}
