package MasterC;


public class DeluxBurger extends Hamburger {
    private int priceOfChips;
    private int priceOfDrink;
    private String Additionals="Drinks And Chips only";
    private int finalDeluxPrice;
    public DeluxBurger(String breadRollType) {
        super(breadRollType, true, false, false, false, false);
        this.priceOfChips = 20;
        this.priceOfDrink = 30;
        this.finalDeluxPrice=super.getBasePrice()+this.priceOfChips+this.priceOfDrink;
    }

    public int getPriceOfChips() {
        return priceOfChips;
    }

    public int getPriceOfDrink() {
        return priceOfDrink;
    }

    public String getAdditionals() {
        return Additionals;
    }

    public int getFinalDeluxPrice() {
        return finalDeluxPrice;
    }
}
