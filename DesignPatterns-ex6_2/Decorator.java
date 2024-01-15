public class Decorator implements Beverage {
    private Beverage beverage;

    public Decorator(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return beverage.getCost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }
    
}
