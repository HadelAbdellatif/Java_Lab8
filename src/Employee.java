
public abstract class Employee {
	private String firstName;
	private String lastName;
	private int ID;

	public Employee() {
		firstName = "AA";
		lastName = "BB";
		ID = 111;
	}

	public Employee(String firstName, String lastName, int ID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ID = ID;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public abstract double earning();

	@Override
	public String toString() {
		return "First Name=" + firstName + ", Last Name=" + lastName + ", ID=" + ID + "]";
	}

}
