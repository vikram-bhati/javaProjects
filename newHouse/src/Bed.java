public class Bed {
    private String bedType;
    private Dimension dimension;
    private String bedColor;

    public Bed(String bedType, Dimension dimension, String bedColor) {
        this.bedType = bedType;
        this.dimension = dimension;
        this.bedColor = bedColor;
    }

    public String getBedType() {
        return bedType;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public String getBedColor() {
        return bedColor;
    }
}
