import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class TextEditor {
    public static void main(String[] args) {

        String data = "Welcome to Java I/O Operations.";

        try {
            FileWriter writer = new FileWriter("textfile.txt");
            writer.write(data);
            writer.close();

            FileReader reader = new FileReader("textfile.txt");

            int ch;
            System.out.println("File Content:");

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
