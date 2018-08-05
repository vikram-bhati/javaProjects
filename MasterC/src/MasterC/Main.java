package MasterC;

public class Main {

    public static void main(String[] args) {
    Hamburger ham1=new Hamburger("White Bread",true,false,false,true,true);
        System.out.println(ham1.getBasePrice());
    HealthyBurger hb=new HealthyBurger(true,true,true,true,true,true,true);
        System.out.println(hb.getFinalPriceHealthy());
    DeluxBurger db= new DeluxBurger("White Bread");
        System.out.println(db.getFinalDeluxPrice());
    }
}
