package pizzaBillGenerator;

public class Pizza {
private int price;
private boolean veg;
private int basePizzaPrice;
	public Pizza(boolean veg) {
		if(veg) {
			this.price=300;
		}
		else {
			this.price=400;
		}
		basePizzaPrice=this.price;
	}
	public Pizza() {
		
	}
	private boolean toppingsAdded=false;
	private boolean cheeseAdded=false;
	private boolean bagPack=false;
	 int extraToppingPrice=120;
	 int extraCheesePrice=100;
	 int bagPackPrice=25;
	public void addExtraTopping() {
		toppingsAdded=true;
		this.price+=extraToppingPrice;
		
	}
	
	
	public void addExtraCheese() {
		cheeseAdded=true;
		this.price+=extraCheesePrice;
	
	}
	
	public void takeAway() {
		bagPack=true;
		this.price+=bagPackPrice;
		
	}
	
	
	public void bill() {
		String Bill="";
		System.out.println("       ***** BILL *****        ");
		System.out.println("Pizza Price : "+basePizzaPrice);
		if(toppingsAdded) {
			Bill+="Extra Toppings Added : "+extraToppingPrice +"\n";
		}
		if(cheeseAdded) {
			Bill+="Extra Cheese Added : "+extraCheesePrice +"\n";
		}
		if(bagPack) {
			Bill+="Take Away : "+bagPackPrice +"\n";
		}
		Bill+="Your Bill : "+this.price;
		System.out.println(Bill);
	}
}
