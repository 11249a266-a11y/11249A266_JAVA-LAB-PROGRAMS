class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}

class Marks extends Student {
    int m1, m2, m3, m4, m5;

    Marks(String name, int rollNo, int m1, int m2, int m3, int m4, int m5) {
        super(name, rollNo);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;
    }

    void displayMarks() {
        System.out.println("Marks: " + m1 + " " + m2 + " " + m3 + " " + m4 + " " + m5);
    }
}

class Result extends Marks {

    Result(String name, int rollNo, int m1, int m2, int m3, int m4, int m5) {
        super(name, rollNo, m1, m2, m3, m4, m5);
    }

    void displayResult() {
        int total = m1 + m2 + m3 + m4 + m5;
        double average = total / 5.0;
        char grade;

        if (average >= 90)
            grade = 'A';
        else if (average >= 75)
            grade = 'B';
        else if (average >= 60)
            grade = 'C';
        else if (average >= 50)
            grade = 'D';
        else
            grade = 'F';

        displayStudent();
        displayMarks();
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Result r = new Result("Yugandhar", 101, 85, 90, 78, 88, 92);
        r.displayResult();
    }
}
