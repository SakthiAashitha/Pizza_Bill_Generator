package pizzaBillGenerator;
import java.util.*;
public class Main {
public static void main(String args[]) {
	//Pizza pizza=new Pizza(true);
	Scanner sc=new Scanner(System.in);
	int op;
	String ch="no";
	boolean veg=false;
	System.out.println("What do you like to order?  /n(1.BasePizza/2.DeluxPizza)");
	op=sc.nextInt();
	switch(op) {
	case 1:
		System.out.println("1.veg / 2.Non-Veg");
		op=sc.nextInt();
		if(op==1) {
			veg=true;
		}
		op=0;
		Pizza pizza=new Pizza(veg);
	
	System.out.println("Do you want any extra topping or extra cheese (1.YES/2.NO)");
	
	op=sc.nextInt();
	if(op==1) {
		System.out.println("1.Extra Topping Price : "+pizza.extraToppingPrice);
		System.out.println("2.Extra Cheese price : "+pizza.extraCheesePrice);
		System.out.println("3.Both Topping and Cheese :"+(pizza.extraCheesePrice+pizza.extraToppingPrice));
		System.out.println("What do you like to Add ?");
		op=0;
		op=sc.nextInt();
		if(op==1) {
			pizza.addExtraTopping();
			}
		else if(op==2){
			pizza.addExtraCheese();
			}
		else if(op==3) {
			pizza.addExtraCheese();
			pizza.addExtraTopping();
			}
		else {
			System.out.println("Invalid Option");
		}
			
	}
	op=0;
	
	System.out.println("(1. TakeAway / 2. Dinning)");
	op=sc.nextInt();
	if(op==1) {
		pizza.takeAway();
		}
	pizza.bill();
	break;
	
	case 2:
	
		System.out.println("1.veg / 2.Non-Veg");
		op=sc.nextInt();
		if(op==1) {
			veg=true;
		}
	DeluxPizza dp=new DeluxPizza(veg);
	System.out.println("(1. TakeAway / 2. Dinning)");
	op=sc.nextInt();
	if(op==1) {
		dp.takeAway();
		}
	
	dp.bill();
	break;
	

	
	
}
}
}
