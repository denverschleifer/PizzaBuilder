package main;

//Builder Pattern - Creational Design Pattern
public class Pizza {

	private String crust;
	private String sauce;
	private int size;
	private String topping;
	private String cooked;
	
	public Pizza(String crust, String sauce, int size, String topping, String cooked) {
		super();
		this.crust = crust;
		this.sauce = sauce;
		this.size = size;
		this.topping = topping;
		this.cooked = cooked;
	}
	@Override
	public String toString() {
		return "PizzaBuilder [crust=" + crust + ", sauce=" + sauce + ", size=" + size + ", topping=" + topping
				+ ", cooked=" + cooked + "]";
	}
	
	
	
}
