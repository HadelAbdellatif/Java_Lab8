
public class HourlyEmployee extends Employee {
	private double wage;
	private int numOfHours;

	public HourlyEmployee() {
		wage = 10;
		numOfHours = 30;

	}

	public HourlyEmployee(double wage, int numOfHours) {
		super();
		this.wage = wage;
		this.numOfHours = numOfHours;
	}

	public HourlyEmployee(String firstName, String lastName, int ID, double wage, int numOfHours) {
		super(firstName, lastName, ID);
		this.wage = wage;
		this.numOfHours = numOfHours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public int getNumOfHours() {
		return numOfHours;
	}

	public void setNumOfHours(int numOfHours) {
		this.numOfHours = numOfHours;
	}

	@Override
	public double earning() {
		return wage * numOfHours;
	}

	@Override
	public String toString() {
		return super.toString() + ", Wage=" + wage + ", Number Of Hours=" + numOfHours + ", Earning=" + earning() + "]";
	}

}
