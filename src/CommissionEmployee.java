
public class CommissionEmployee extends Employee {
	protected double rate;
	protected double grossSales;

	public CommissionEmployee() {
		rate = 0.1;
		grossSales = 10;

	}

	public CommissionEmployee(double rate, double grossSales) {
		super();
		this.rate = rate;
		this.grossSales = grossSales;
	}

	public CommissionEmployee(String firstName, String lastName, int ID, double rate, double grossSales) {
		super(firstName, lastName, ID);
		this.rate = rate;
		this.grossSales = grossSales;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	@Override
	public double earning() {
		return rate * grossSales;
	}

	@Override
	public String toString() {
		return super.toString() + "Rate=" + rate + ", Gross Sales=" + grossSales + ", Earning=" + earning() + "]";
	}

}
