public class Student {
    String[] name = {"Fred", "Sally", "Timmy", "Pat", "Phil"};
    double[] examScore = {87.9, 90.0, 12.1, 75.5, 61.8};
    char gradeLetter;

    public static void main(String[] args) {
        Student[] students = new Student[5];
        double examScoreValue;
        int x = 0;

        while (x < 5)

        {
            students[x] = new Student();
            examScoreValue = students[x].examScore[x];
            students[x].assignGradeLetter(examScoreValue);
            System.out.println(students[x].name[x] + " " + examScoreValue + " " + students[x].gradeLetter);
            x++;
        }

    }

    void assignGradeLetter(double examScoreValue) {

        if (examScoreValue > 89.1) {
            gradeLetter = 'A';
        } else if (examScoreValue > 79.0) {
            gradeLetter = 'B';
        } else if (examScoreValue > 69.0) {
            gradeLetter = 'C';
        } else if (examScoreValue > 59.0) {
            gradeLetter = 'D';
        } else {
            gradeLetter = 'F';
        }


    }
}

