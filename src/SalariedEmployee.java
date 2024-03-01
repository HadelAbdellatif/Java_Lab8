
public class SalariedEmployee extends Employee {
	private double weeklySalary;

	public SalariedEmployee() {
		weeklySalary = 40;

	}

	public SalariedEmployee(double weeklySalary) {
		super();
		this.weeklySalary = weeklySalary;
	}

	public SalariedEmployee(String firstName, String lastName, int ID, double weeklySalary) {
		super(firstName, lastName, ID);
		this.weeklySalary = weeklySalary;

	}
	
	@Override
	public double earning() {
		return weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary * 4;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	@Override
	public String toString() {
		return super.toString() + "Earning=" + earning();
	}

}
