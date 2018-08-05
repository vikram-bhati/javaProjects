public class Bmw extends Car {
    private long price;
    Bmw( String modelName, String fuelType, String color, String type,long price){
        super("BMW",modelName,fuelType,color,type);
        this.price=price;
    }

    public long getPrice() {
        return price;
    }
}
