class MusicPlayer extends Thread {

    public void run() {
        try {
            System.out.println("Playing song...");

            Thread.sleep(1000);
            System.out.println("Progress 1");

            Thread.sleep(1000);
            System.out.println("Progress 2");

            Thread.sleep(1000);
            System.out.println("Progress 3");

        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        MusicPlayer t = new MusicPlayer();
        t.start();
    }
}