package main;


public class PizzaBuilder {

	private String crust;
	private String sauce;
	private int size;
	private String topping;
	private String cooked;
	
	
	public PizzaBuilder setCrust(String crust) {
		this.crust = crust;
		return this;
	}
	
	public PizzaBuilder setSauce(String sauce) {
		this.sauce = sauce;
		return this;

	}
	
	public PizzaBuilder setSize(int size) {
		this.size = size;
		return this;

	}
	
	public PizzaBuilder setTopping(String topping) {
		this.topping = topping;
		return this;

	}
	public PizzaBuilder setCooked(String cooked) {
		this.cooked = cooked;
		return this;

	}
	
	public Pizza getPizza() {
		
		return new Pizza(crust, sauce, size, topping, cooked);
		
	}
	
	
}
