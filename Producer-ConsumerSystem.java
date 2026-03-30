class Restaurant {

    boolean foodReady = false;

    // Chef prepares food
    synchronized void prepareFood() {
        try {
            System.out.println("Chef prepared food");
            foodReady = true;
            notify(); // notify waiter
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    // Waiter serves food
    synchronized void serveFood() {
        try {
            while (!foodReady) {
                wait(); // wait until food is ready
            }
            System.out.println("Waiter served food");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        Restaurant obj = new Restaurant();

        Thread chef = new Thread(() -> obj.prepareFood());
        Thread waiter = new Thread(() -> obj.serveFood());

        waiter.start();
        chef.start();
    }
}