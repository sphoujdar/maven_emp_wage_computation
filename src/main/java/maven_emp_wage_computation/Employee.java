package maven_emp_wage_computation;

public class Employee {
	
	//Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;	
	
	
	//Class Variables
	String empName;
	Company empCompany;
	int totalEmpWage, totalEmpHrs, totalDaysWorked;

	
	//Constructor to initialize values
	public Employee(String empName,Company empCompany, int totalEmpWage, int totalEmpHrs, int totalDaysWorked) {
		super();
		this.empCompany = empCompany;
		this.empName = empName;
		this.totalEmpWage = totalEmpWage;
		this.totalEmpHrs = totalEmpHrs;
		this.totalDaysWorked = totalDaysWorked;
		
		this.calc_employee_wage(this);
	}


	//Class Method to calculate employee wage
	public void calc_employee_wage(Employee employee1) {
		
		int empHrs = 0, empWage = 0; 
		
		System.out.printf("Calculating Wage for %s:\n",employee1.empName);
		System.out.printf("Employee works at %s.\n\n",employee1.empCompany.companyName);
		
		while ( employee1.totalDaysWorked < empCompany.NUM_WORKING_DAYS 
				&& employee1.totalEmpHrs <= empCompany.MAX_WORKING_HRS ){
			
			
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
				empWage = empHrs*empCompany.EMP_RATE_PER_HOUR;
				employee1.totalEmpWage += empWage; 
				employee1.totalEmpHrs += empHrs;
				employee1.totalDaysWorked++;
				
		System.out.printf("Employee's Wage for day %d is : %d\n",employee1.totalDaysWorked, empWage);
		}
		
		employee1.empCompany.totalWage += employee1.totalEmpWage;
		
	}
	
	public void displayEmployeeDetails(Employee employee1) {
		
		System.out.printf("\n\nDisplaying details for %s:\n",employee1.empName);
		System.out.printf("\nEmployee's Wage for the month is %d\n" , employee1.totalEmpWage);
		System.out.printf("Employee Worked for %d hours\n\n\n" , employee1.totalEmpHrs);
		
	}
	
	
}
