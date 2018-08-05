public class Main {
    public static void main(String[] args) {
        Bed bed=new Bed("King",new Dimension(100,200),"Black");
        Table table=new Table("Wood",2,new Dimension(100,50));
        Chair chair=new Chair("Steel",4,new Dimension(10,50));

        Furniture furniture=new Furniture(bed,chair,table);
        walls walls=new walls(new Dimension(500,1000),"Light Green",4);
        Lights lights=new Lights("Bulbs","4","OFF");

        myRoom vikramRoom=new myRoom(furniture,lights,walls);
        vikramRoom.intoMyRoom();
    }
}

