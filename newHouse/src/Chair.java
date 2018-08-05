public class Chair {
    private String chairMaterial;
    private int noOfChair;
    private Dimension dimension;

    public Chair(String chairMaterial, int noOfChair, Dimension dimension) {
        this.chairMaterial = chairMaterial;
        this.noOfChair = noOfChair;
        this.dimension = dimension;
    }

    public String getChairMaterial() {
        return chairMaterial;
    }

    public int getNoOfChair() {
        return noOfChair;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
