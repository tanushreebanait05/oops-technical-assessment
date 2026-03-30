class RailwayReservation {

    int tickets = 2; // available tickets

    // synchronized method to avoid double booking
    synchronized void bookTicket() {
        if (tickets > 0) {
            System.out.println("Ticket booked successfully");
            tickets--;
        } else {
            System.out.println("No tickets available");
        }
    }

    public static void main(String[] args) {
        RailwayReservation obj = new RailwayReservation();

        // multiple threads
        Thread t1 = new Thread(() -> obj.bookTicket());
        Thread t2 = new Thread(() -> obj.bookTicket());
        Thread t3 = new Thread(() -> obj.bookTicket());

        t1.start();
        t2.start();
        t3.start();
    }
}