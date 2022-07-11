public class CustomerAddressMain {
   public static void main(String args[]){
    // Initialise both Address and Customer with parameterized constructor
    // use the getters method to display details of the customer like id,name and address. In address
    // further it will display hno,locality and city
	   Address address=new Address(111,"Netaji Nagar","Delhi");
	   Customer customer=new Customer(1,"Tom",address);
	   System.out.println("The details");
	   System.out.println(customer.getCustomerId());
	   System.out.println(customer.getName());
	   System.out.println(address);
	   address=customer.getAddress();
	   System.out.println(address.getHno());
	   System.out.println(address.getLocality());
	   System.out.println(address.getCity());
	   
	   
   }
}

