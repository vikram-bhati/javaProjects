public class Main {
    public static void main(String[] args) {
        Bmw X6=new Bmw("X6","petrol","White","sedan",700000);
        X6.steer();
        System.out.println(X6.getColor());
        System.out.println(X6.getSpeed());

        X6.moveCar(10);
        X6.changeGear(5);
        System.out.println(X6.getInitGear());
        X6.increaseSpeed(25);
    }
}
