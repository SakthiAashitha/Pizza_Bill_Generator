package pizzaBillGenerator;

public class DeluxPizza extends Pizza {
	
	 public DeluxPizza(boolean veg) {
		super(veg);
		super.addExtraCheese();
		super.addExtraTopping();
	}
	 public void addExtraTopping(){ } 
	 public void addExtraCheese() { }
	 
}
