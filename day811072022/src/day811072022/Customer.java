package day811072022;

public class Customer {
private int id;
private String name;
private int price;
private static float deliveryCharge;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getPrice() {
	return price;
}

public static void setDeliveryCharge(float deliveryCharge) {
	Customer.deliveryCharge = deliveryCharge;
	//this.deliveryCharge=deliveryCharge;
   // this cannot be used in the static block because
	// this represents current object but static members are
	// not related to objects , that is the reason within static
	// block we cannot access the static member with this
}

public void setPrice(int price) {
	this.price = price;
}

public static float getDeliveryCharge() {
	return deliveryCharge;
}

static {
	deliveryCharge=1.5f;  // As a usual practice we should initialise static
	// variable in static block
	//id=1;
	//name="Ravi"; non-static members cannot be initialised within the static block
   System.out.println("I am called");
}

public Customer(int id, String name, int price) {
	
	this.id = id;  // The instance variable non static within the constructor
	this.name = name;
	this.price = price;
	//deliveryCharge=1.5f; // Yes we can access a static member from a 
	// non static context
  System.out.println("The parameterized constructor called");
}


}
