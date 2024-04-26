
public class Persona {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private String address;

	public Persona(int id, String firstName, String lastName, String email, String gender, String address) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Persona{" + "id = " + id + ", firstName = '" + firstName + '\'' + ", lastName = '" + lastName + '\''
				+ ", email = '" + email + '\'' + ", gender = '" + gender + '\'' + ", address = '" + address + '\''
				+ '}';
	}
}