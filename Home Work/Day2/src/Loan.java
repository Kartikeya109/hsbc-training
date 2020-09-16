/**
 * 
 */

/**
 * @author Kartikeya
 *
 */

class HomeLoan{
	double LoanPercent;
	double LoanAmount;
	int months;
	String Person;
	
	
	public double getLoanPercent() {
		return LoanPercent;
	}
	public void setLoanPercent(double loanPercent) {
		LoanPercent = loanPercent;
	}
	public double getLoanAmount() {
		return LoanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		LoanAmount = loanAmount;
	}
	public int getMonths() {
		return months;
	}
	public void setMonths(int months) {
		this.months = months;
	}
	public String getPerson() {
		return Person;
	}
	public void setPerson(String person) {
		Person = person;
	}
	
	public void Display()
	{
		System.out.println("Details of Home Loan are: ");
		System.out.println("Loan Amount : " + this.getLoanAmount());
		System.out.println("Loan Percent : " + this.getLoanPercent());
		System.out.println("Loan Months : " + this.getMonths());
		System.out.println("Person Name : " + this.getPerson());
	}
}

class PersonalLoan
{
	double LoanPercent;
	double LoanAmount;
	int months;
	String Person;
	
	public double getLoanPercent() {
		return LoanPercent;
	}
	public void setLoanPercent(double loanPercent) {
		LoanPercent = loanPercent;
	}
	public double getLoanAmount() {
		return LoanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		LoanAmount = loanAmount;
	}
	public int getMonths() {
		return months;
	}
	public void setMonths(int months) {
		this.months = months;
	}
	public String getPerson() {
		return Person;
	}
	public void setPerson(String person) {
		Person = person;
	}
	
	public void Display()
	{
		System.out.println("Details of Personal Loan are: ");
		System.out.println("Loan Amount : " + this.getLoanAmount());
		System.out.println("Loan Percent : " + this.getLoanPercent());
		System.out.println("Loan Months : " + this.getMonths());
		System.out.println("Person Name : " + this.getPerson());
	}
}

public class Loan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeLoan hm = new HomeLoan();
		
		hm.setLoanAmount(5000);
		hm.setLoanPercent(10.00);
		hm.setMonths(3);
		hm.setPerson("Kartikeya");
		
		PersonalLoan pl = new PersonalLoan();
		
		pl.setLoanAmount(1000);
		pl.setLoanPercent(20);
		pl.setMonths(6);
		pl.setPerson("Shukla");
		
		hm.Display();
		pl.Display();
	}

}
