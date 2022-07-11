package day811072022;

public class CustomerMain2 {

	public static void main(String[] args) {
		// So previously delivery charge was public and now
		// we made it as private so taking the help of
		// static method to access
		//System.out.println(Customer.deliveryCharge);
	     System.out.println(Customer.getDeliveryCharge());
	}

}
