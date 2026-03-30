class OnlineShoppingSystem {

    public static void main(String[] args) {

        // Payment thread
        Thread payment = new Thread(() -> {
            System.out.println("Processing payment...");
        });

        // Order thread
        Thread order = new Thread(() -> {
            System.out.println("Order confirmed...");
        });

        // Start threads
        payment.start();
        order.start();
    }
}