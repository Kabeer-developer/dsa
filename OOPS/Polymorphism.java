package DSA.OOPS;
import java.util.*;
class Plane {
    public void fly() {
    }
}

class CargoPlane extends Plane {
    @Override
    public void fly() {
        System.out.println("CargoPlane is flying at low heights");
    }
}

class PassengerPlane extends Plane {
    @Override
    public void fly() {
        System.out.println("PassengerPlane is flying at medium heights");
    }
}

class FighterPlane extends Plane {
    @Override
    public void fly() {
        System.out.println("FighterPlane is flying at great heights");
    }
}
public class Polymorphism {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        Plane mainFlight;    // Only declaration

        if (type.equals("CargoPlane")) {
            mainFlight = new CargoPlane();
        } else if (type.equals("PassengerPlane")) {
            mainFlight = new PassengerPlane();
        } else if (type.equals("FighterPlane")) {
            mainFlight = new FighterPlane();
        } else {
            return;
        }

        mainFlight.fly();
    }
}

