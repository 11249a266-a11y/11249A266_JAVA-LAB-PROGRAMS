public class FitnessProfile {
    public static void main(String[] args) {

        String data = "Name: Yugandhar\nAge: 20\nWeight: 65 kg";

        try {
            FileOutputStream fos = new FileOutputStream("profile.txt");
            fos.write(data.getBytes());
            fos.close();

            FileInputStream fis = new FileInputStream("profile.txt");

            int ch;
            System.out.println("User Profile:");

            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }

            fis.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
