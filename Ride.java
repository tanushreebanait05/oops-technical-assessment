abstract class Ride {
    double distance;

    Ride(double distance) {
        this.distance = distance;
    }

    abstract double calculateFare();

    // Move main here if your file is named Ride.java
    public static void main(String[] args) {
        Ride[] rides = {
            new BikeRide(10), 
            new AutoRide(10), 
            new CarRide(10)
        };

        for (Ride r : rides) {
            System.out.println(r.getClass().getSimpleName() + ": " + r.calculateFare());
        }
    }
}

class BikeRide extends Ride {
    BikeRide(double d) { super(d); }
    double calculateFare() { return distance * 25; }
}

class AutoRide extends Ride {
    AutoRide(double d) { super(d); }
    double calculateFare() { return distance * 28; }
}

class CarRide extends Ride {
    CarRide(double d) { super(d); }
    double calculateFare() { return distance * 212; }
}