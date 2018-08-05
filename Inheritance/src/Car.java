public class Car extends Vehical{
    private String color;
    private String type;
    private int initGear;
    private int speed;

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public int getInitGear() {
        return initGear;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(String vehicalBrand, String modelName, String fuelType, String color, String type){
        super(vehicalBrand,modelName,4,fuelType);
        this.color=color;
        this.type=type;
        this.initGear=0;
        this.speed=0;
    }
    public void steer(){
        System.out.println("Steering car "+"Brand="+this.getVehicalBrand()+" Model="+this.getModelName());
    }
    public int changeGear(int toGear){
        this.initGear=toGear;
        return this.initGear;
    }
    public void moveCar(int speed){
        this.speed=speed;
        System.out.println("Moving Car"+" Brand="+this.getVehicalBrand()+" Model="+this.getModelName()+" at the speed="+this.speed);
    }
    public void increaseSpeed(int speed){
        this.speed+=speed;
        System.out.println("Moving Car"+" Brand="+this.getVehicalBrand()+" Model="+this.getModelName()+" at the speed="+this.speed);
    }
}
