class BankApplication {

    // Method that throws exception
    void processTransaction(int amount) throws Exception {
        if (amount > 5000) {
            throw new Exception();
        } else {
            System.out.println("Transaction processed");
        }
    }

    public static void main(String[] args) {
        BankApplication obj = new BankApplication();

        try {
            obj.processTransaction(6000);  // change value to test
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}