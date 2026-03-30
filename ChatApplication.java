class ChatApplication {

    public static void main(String[] args) {

        // Sending thread
        Thread sender = new Thread(() -> {
            System.out.println("Sending message...");
        });

        // Receiving thread
        Thread receiver = new Thread(() -> {
            System.out.println("Receiving message...");
        });

        // Thread lifecycle
        sender.start();
        receiver.start();
    }
}