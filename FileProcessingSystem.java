class FileProcessingSystem {
    public static void main(String[] args) {

        try {
            // Simulate file reading
            System.out.println("Reading file...");
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            // Cleanup message
            System.out.println("Closing file resources");
        }
    }
}