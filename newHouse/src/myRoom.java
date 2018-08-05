public class myRoom {
    private Furniture furniture;
    private Lights lights;
    private walls walls;

    public myRoom(Furniture furniture, Lights lights, walls walls) {
        this.furniture = furniture;
        this.lights = lights;
        this.walls = walls;
    }
    public void intoMyRoom(){
        System.out.println("Hi there you are into my room");
        lights.lightsOn();
        System.out.println(lights.getIsLightsOn());
        System.out.println(walls.getNoOfWall());
        System.out.println(walls.getColor());
        System.out.println(walls.getDimensions());
        System.out.println(furniture.getBed().getBedType());
        System.out.println(furniture.getBed().getBedColor());
        System.out.println(furniture.getBed().getDimension());
        System.out.println(furniture.getChair().getNoOfChair());
        System.out.println(furniture.getChair().getChairMaterial());
        System.out.println(furniture.getTable().getNoOfTables());
    }

}
