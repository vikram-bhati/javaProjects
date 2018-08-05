public class Furniture {
    private Bed bed;
    private Chair chair;
    private Table table;

    public Furniture(Bed bed, Chair chair, Table table) {
        this.bed = bed;
        this.chair = chair;
        this.table = table;
    }

    public Bed getBed() {
        return bed;
    }

    public Chair getChair() {
        return chair;
    }

    public Table getTable() {
        return table;
    }
}
