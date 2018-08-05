package conn.printer;

public class Main {
    public static void main(String[] args) {
        Printer p1=new Printer(100,500,false);
        System.out.println(p1.printPages(100));
        System.out.println(p1.getTonerLevel()+"||"+p1.getTotalPages());
        p1.fillTonerLevel(1000);
        p1.printPages(100);
        p1.fillTonerLevel(1000);

        p1.printPages(100);
        p1.fillTonerLevel(1000);

        p1.printPages(100);
        p1.fillTonerLevel(1000);

        p1.printPages(100);
        p1.fillTonerLevel(1000);

        p1.printPages(100);
        p1.fillTonerLevel(1000);
        p1.addPages(50);
        p1.printPages(100);
        p1.fillTonerLevel(1000);

    }}
