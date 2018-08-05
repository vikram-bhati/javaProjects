public class Vehical {
    private String vehicalBrand;
    private String modelName;
    private int noOfWheels;
    private String fuelType;

    public Vehical(String vehicalBrand,String modelName,int noOfWheels,String fuelType){
        this.vehicalBrand=vehicalBrand;
        this.modelName=modelName;
        this.noOfWheels=noOfWheels;
        this.fuelType=fuelType;
    }

    public String getVehicalBrand(){
        return vehicalBrand;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getModelName() {
        return modelName;
    }
}
