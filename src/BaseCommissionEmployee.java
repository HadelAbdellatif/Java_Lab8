
public class BaseCommissionEmployee extends CommissionEmployee {
	private double baseSalary;

	public BaseCommissionEmployee() {
		baseSalary = 100;
	}

	public BaseCommissionEmployee(double baseSalary) {
		super();
		this.baseSalary = baseSalary;
	}

	public BaseCommissionEmployee(String firstName, String lastName, int ID, double rate, double grossSales,
			double baseSalary) {
		super(firstName, lastName, ID, rate, grossSales);
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double earning() {
		return baseSalary + super.earning();
	}

	@Override
	public String toString() {
		return super.toString() + "Base Salary=" + baseSalary + "]";
	}

}
