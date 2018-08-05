package MasterC;

public class HealthyBurger extends Hamburger{
    private boolean proteinShake=false;
    private boolean veggies=false;
    private int finalPriceHealthy;
    private int priceOfproteinShake;
    private int priceOfVeggies;

    public HealthyBurger( boolean meat, boolean lettuce, boolean tomato, boolean carrot, boolean cheese, boolean proteinShake, boolean veggies) {
        super("Brown Bread", meat, lettuce, tomato, carrot, cheese);
        this.finalPriceHealthy=super.getBasePrice();
        this.priceOfproteinShake=100;
        this.priceOfVeggies=20;
        if (proteinShake){

            this.proteinShake = proteinShake;
            this.finalPriceHealthy+=this.priceOfproteinShake;
        }
        if (veggies){
            this.veggies = veggies;
            this.finalPriceHealthy+=this.priceOfVeggies;
        }
    }

    public int getFinalPriceHealthy() {
        return finalPriceHealthy;
    }

    public int getPriceOfproteinShake() {
        return priceOfproteinShake;
    }

    public int getPriceOfVeggies() {
        return priceOfVeggies;
    }
}
