package MasterC;

public class Hamburger {
    private String breadRollType;
    private int priceOfbreadRoll;
    private boolean meat;
    private int priceOfMeat;
    private int priceOfLettuce;
    private int priceOfTomato;
    private int priceOfCarrot;
    private int priceOfCheese;
    private int basePrice;
    private boolean lettuce=false;
    private boolean tomato=false;
    private boolean carrot=false;
    private boolean cheese=false;

    public Hamburger(String breadRollType,boolean meat, boolean lettuce, boolean tomato, boolean carrot, boolean cheese) {
        this.breadRollType = breadRollType;
        this.priceOfbreadRoll = 8;
        this.meat = meat;
        this.priceOfMeat = 15;
        this.basePrice = priceOfbreadRoll + priceOfMeat;
        this.priceOfLettuce = 2;
        this.priceOfTomato = 2;
        this.priceOfCarrot = 2;
        this.priceOfCheese = 5;
        if (lettuce) {
            this.lettuce = lettuce;
            this.basePrice += this.priceOfLettuce;
        }
        if (tomato) {
            this.tomato = tomato;
            this.basePrice += this.priceOfTomato;
        }
        if (carrot) {
            this.carrot = carrot;
            this.basePrice += this.priceOfCarrot;
        }
        if (cheese) {
            this.cheese = cheese;
            this.basePrice+=this.priceOfCheese;
        }
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public int getPriceOfbreadRoll() {
        return priceOfbreadRoll;
    }

    public int getPriceOfMeat() {
        return priceOfMeat;
    }

    public int getPriceOfLettuce() {
        return priceOfLettuce;
    }

    public int getPriceOfTomato() {
        return priceOfTomato;
    }

    public int getPriceOfCarrot() {
        return priceOfCarrot;
    }

    public int getPriceOfCheese() {
        return priceOfCheese;
    }

    public int getBasePrice() {
        return basePrice;
    }
}
