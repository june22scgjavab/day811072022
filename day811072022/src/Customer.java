
public class Customer {
	private int customerId;
	private String name;
	private Address address;

	// parameterized constructor
	public Customer(int customerId, String name, Address address) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.address = address;
	}

	// setters/getters
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
