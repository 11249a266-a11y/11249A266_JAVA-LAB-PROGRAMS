class Student {
    String name;
    int rollNo;
    int marks;

    // Method to display student information
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println();
    }

    // Method to calculate grade
    char calculateGrade() {
        if (marks >= 90)
            return 'A';
        else if (marks >= 75)
            return 'B';
        else if (marks >= 60)
            return 'C';
        else if (marks >= 50)
            return 'D';
        else
            return 'F';
    }

    public static void main(String[] args) {
        // Creating two student objects
        Student s1 = new Student();
        Student s2 = new Student();

        // Student 1 details
        s1.name = "Yugandhar";
        s1.rollNo = 101;
        s1.marks = 85;

        // Student 2 details
        s2.name = "Rahul";
        s2.rollNo = 102;
        s2.marks = 72;

        // Display details
        System.out.println("Student 1 Details:");
        s1.displayInfo();

        System.out.println("Student 2 Details:");
        s2.displayInfo();
    }
}
