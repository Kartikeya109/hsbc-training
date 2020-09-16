/**
 * 
 */

/**
 * @author Kartikeya
 *
 */

class Employee{
	
	int salary;
	String it;
	int total;
	int average;
	int result;
	
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getIt() {
		return it;
	}
	public void setIt(String it) {
		this.it = it;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	
	
}

class Student{
	int salary;
	String it;
	int total;
	int average;
	int result;
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getIt() {
		return it;
	}
	public void setIt(String it) {
		this.it = it;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
}

class IncomeTax
{
	int tax;
	public IncomeTax(int tax)
	{
		this.tax = tax;
	}
	
	public void check(int tax)
	{
		if(this.tax>1000)
			System.out.println("Your tax is rate is 10%");
	}
}

public class CalulatorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorClass obj = new CalculatorClass(2,3);
		
		// I will prefer static method but now will use non-static
		
		System.out.println(obj.add());
		System.out.println(obj.subtract());
		System.out.println(obj.multiply());
		System.out.println(obj.divide());
		
		Employee emp = new Employee();
		
		emp.setSalary(5000);
		emp.setIt("Computer Science");
		
		System.out.println(obj.add(emp.getSalary(),6000));
		System.out.println(obj.divide(emp.getSalary(),2));
		
		Student s = new Student();
		s.setAverage(56);
		s.setIt("Information Technology");
		s.setSalary(0);
		s.setTotal(1000);
		
		System.out.println(obj.add(s.getSalary(),5000));
		
		IncomeTax t = new IncomeTax(5000);
		t.check(t.tax);
	}
}
