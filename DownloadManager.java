class DownloadManager implements Runnable {

    public void run() {
        System.out.println("Downloading file...");
    }

    public static void main(String[] args) {
        // Create multiple threads
        Thread t1 = new Thread(new DownloadManager());
        Thread t2 = new Thread(new DownloadManager());
        Thread t3 = new Thread(new DownloadManager());

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}