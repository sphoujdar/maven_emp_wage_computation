package maven_emp_wage_computation;

public class Company {

	//Company Specific Details
	
	public final String companyName;
	public final int EMP_RATE_PER_HOUR;
	public final int NUM_WORKING_DAYS;
	public final int MAX_WORKING_HRS;
	

	public Company(String companyName, int eMP_RATE_PER_HOUR, int nUM_WORKING_DAYS, int mAX_WORKING_HRS) {
		super();
		this.companyName = companyName;
		EMP_RATE_PER_HOUR = eMP_RATE_PER_HOUR;
		NUM_WORKING_DAYS = nUM_WORKING_DAYS;
		MAX_WORKING_HRS = mAX_WORKING_HRS;
	}
	
}
