package maven_emp_wage_computation;

import java.util.ArrayList;

public class Company {

	//Company Specific Details
	
	public final String companyName;
	public final int EMP_RATE_PER_HOUR;
	public final int NUM_WORKING_DAYS;
	public final int MAX_WORKING_HRS;
	public int totalWage = 0;
	ArrayList<Employee> employeeList;
	
	
	public Company(String companyName, int eMP_RATE_PER_HOUR, int nUM_WORKING_DAYS, int mAX_WORKING_HRS) {
		super();
		this.companyName = companyName;
		EMP_RATE_PER_HOUR = eMP_RATE_PER_HOUR;
		NUM_WORKING_DAYS = nUM_WORKING_DAYS;
		MAX_WORKING_HRS = mAX_WORKING_HRS;
		employeeList = new ArrayList<Employee>();
		
	}
	
	
	public void displayCompanyDetails() {
		
		System.out.printf("\n\nDisplaying details for Company [%s] :\n",this.companyName);
		System.out.printf("\nCompany's total Wage bill for the month is %d.\n" , this.totalWage);
		
		for (int i = 0; i < this.employeeList.size(); i++) {
			
			Employee tempEmployee = employeeList.get(i);
			tempEmployee.displayEmployeeDetails(tempEmployee);
			
		}
		
		
		
	}
	
	
}
