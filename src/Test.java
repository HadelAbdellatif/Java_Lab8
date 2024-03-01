
public class Test {

	public static void main(String[] args) {
		Employee[] a = new Employee[4];
		a[0] = new SalariedEmployee("Hadeel", "Abdellatif", 222, 100);
		a[1] = new HourlyEmployee("Enass", "Abdellatif", 333, 20, 5);
		a[2] = new CommissionEmployee("Asmaa", "Abdellatif", 444, 0.15, 15);
		a[3] = new BaseCommissionEmployee(150);

		System.out.println(totlaEarning(a));

	}

	public static double totlaEarning(Employee[] a) {
		double total = 0;
		for (int i = 0; i < a.length; i++) {
			total += a[i].earning();
		}
		return total;
	}

}
