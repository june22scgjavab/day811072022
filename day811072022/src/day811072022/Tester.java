package day811072022;
class Customer1 {
	private String customerId;
	private String customerName;
	private long contactNumber;
	private String address;
	private static float deliveryCharge;
	static {
		deliveryCharge = 1.5f;
	}
	public Customer1(String customerId, String customerName, long contactNumber, String address) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public static float getDeliveryCharge() {
		return deliveryCharge;
	}
	public static void setDeliveryCharge(float deliveryCharge) {
		Customer1.deliveryCharge = deliveryCharge;
	}
	public void displayCustomerDetails() {
		System.out.println("Displaying customer details");
		System.out.println("Customer Id: " + this.customerId);
		System.out.println("Customer Name: " + this.customerName);
		System.out.println("Contact Number: " + this.contactNumber);
		System.out.println("Address: " + this.address);
		System.out.println("Delivery Charge: " + Customer1.deliveryCharge);
		System.out.println();
	}
	public double payBill(double totalPrice) {
		double discountPercentage = 5;
		System.out.println("Calculating final amount to be paid.....");
		double priceAfterDiscount = totalPrice * (1 - (discountPercentage / 100));
		double finalBillAmount = priceAfterDiscount + Customer1.deliveryCharge;
		return finalBillAmount;
	}
}
public class Tester {
	public static void main(String[] args) {
		Customer1 customer1 = new Customer1("C1001", "Sam", 9945000009L, "Carolina Street, Springfield, 62702");
		Customer1.setDeliveryCharge(2f);
		System.out.println("Final amount to be paid: $" + customer1.payBill(20));
		Customer1 customer2 = new Customer1("C1002", "John", 9645000009L, "Carolina Street, Springfield, 62708");
		System.out.println("Final amount to be paid: $" + customer2.payBill(15));
		System.out.println("Delivery Charge for the customers are: " + Customer1.getDeliveryCharge());
	}
}
