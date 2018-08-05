

public class walls {
    private Dimension dimensions;
    private String color;
    private int noOfWall;
    walls(Dimension dimensions,String color,int noOfWall){
        this.color=color;
        this.dimensions=dimensions;
        this.noOfWall=noOfWall;

    }

    public Dimension getDimensions() {
        return dimensions;
    }

    public String getColor() {
        return color;
    }

    public int getNoOfWall() {
        return noOfWall;
    }
}
