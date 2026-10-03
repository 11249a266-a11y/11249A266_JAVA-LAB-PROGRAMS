class TrainCodes {
    public static void main(String[] args) {
        String[] codes = {"T101", "T102", "T103"};

        try {
            System.out.println("Train Code: " + codes[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        }
    }
}
