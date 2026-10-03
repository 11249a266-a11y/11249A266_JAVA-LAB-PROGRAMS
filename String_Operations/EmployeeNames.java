import java.util.Scanner;

class EmployeeNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first employee name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter second employee name: ");
        String name2 = sc.nextLine();

        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Both employees have the same name.");
        } else {
            System.out.println("Employee names are different.");
        }
    }
}
