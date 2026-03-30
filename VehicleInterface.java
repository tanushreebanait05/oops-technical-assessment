interface VehicleInterface {
    int a = 10;   // automatically public static final

    public void turnLeft();
    public void turnRight();
    public void accelerate();
    public void slowDown();
}
public class DemoInterface {
    public static void main(String[] args) {

        CarClass c = new CarClass();

        c.turnLeft();
        c.turnRight();
        c.accelerate();
        c.slowDown();
    }
}

class CarClass implements VehicleInterface {

    public void turnLeft() {
        System.out.println("Left");
    }

    public void turnRight() {
        System.out.println("Right");
    }

    public void accelerate() {
        System.out.println("Speed");
    }

    public void slowDown() {
        System.out.println("Brake");
    }
}
