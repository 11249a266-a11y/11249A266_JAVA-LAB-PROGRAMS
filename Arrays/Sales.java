class Sales {
    public static void main(String[] args) {

        int[] sales = {25000, 30000, 18000, 45000, 32000, 28000,
                       50000, 40000, 22000, 35000, 27000, 48000};

        int max = sales[0];
        int min = sales[0];

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > max) {
                max = sales[i];
            }

            if (sales[i] < min) {
                min = sales[i];
            }
        }

        System.out.println("Highest Sales: " + max);
        System.out.println("Lowest Sales: " + min);
    }
}
