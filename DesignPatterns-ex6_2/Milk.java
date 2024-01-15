public class Milk extends Decorator {

    public Milk(Beverage beverage){
        super(beverage);
    }

    @Override
    public int getCost() {
        return super.getCost() + 3;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "milk ";
    }
}