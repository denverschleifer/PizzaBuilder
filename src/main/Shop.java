package main;

public class Shop {

	public static void main(String a[]){
		
		Pizza p = new PizzaBuilder().setCrust("thin").setSauce("bbq").setTopping("chicken").getPizza();
		
		System.out.println(p);
		
	}
	
}
