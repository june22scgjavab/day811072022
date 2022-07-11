package day811072022;

public class CustomerMain {

	public static void main(String[] args) {
		Customer cust1=new Customer(1,"Ravi",300);
		Customer cust2=new Customer(2,"Ravish",400);
		System.out.println(cust1.id);
		System.out.println(Customer.deliveryCharge);
		// We should access static member with the class name
		// as static are related to class
		// Though we can access static member with the object 
		// but usually we dont do that because static member
		// are associated with a class and not with objects
		System.out.println(cust1.deliveryCharge);
        System.out.println(cust2.deliveryCharge);         
	}

}
