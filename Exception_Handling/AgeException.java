import java.util.Scanner;

class AgeException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            String age = sc.nextLine();

            int a = Integer.parseInt(age);

            System.out.println("Age: " + a);

            int result = 100 / (a - a);
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
