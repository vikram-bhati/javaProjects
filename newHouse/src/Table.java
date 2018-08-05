public class Table {
    private String tableMaterial;
    private int noOfTables;
    private Dimension dimension;

    public Table(String tableMaterial, int noOfTables, Dimension dimension) {
        this.tableMaterial = tableMaterial;
        this.noOfTables = noOfTables;
        this.dimension = dimension;
    }

    public String getTableMaterial() {
        return tableMaterial;
    }

    public int getNoOfTables() {
        return noOfTables;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
