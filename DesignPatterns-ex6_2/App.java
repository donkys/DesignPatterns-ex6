
public class App {
	public static void main(String[] args) {
		Beverage addOnBeverage = new Milk(new Sugar(new PlainBeverage()));
		System.out.println("You order " + addOnBeverage.getDescription());
		System.out.println("The cost is " + addOnBeverage.getCost());

		Beverage addOnBeverage2 = new Sugar(new Sugar(new Milk(new PlainBeverage())));
		System.out.println("You order " + addOnBeverage2.getDescription());
		System.out.println("The cost is " + addOnBeverage2.getCost());
	}
}
