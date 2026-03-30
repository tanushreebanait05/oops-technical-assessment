
class ThreadPrioritySystem extends Thread {

    public void run() {
        System.out.println("Thread executing: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        ThreadPrioritySystem t1 = new ThreadPrioritySystem();
        ThreadPrioritySystem t2 = new ThreadPrioritySystem();
        ThreadPrioritySystem t3 = new ThreadPrioritySystem();

        // Set thread names
        t1.setName("Low Priority Thread");
        t2.setName("Medium Priority Thread");
        t3.setName("High Priority Thread");

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MAX_PRIORITY);   // 10

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}