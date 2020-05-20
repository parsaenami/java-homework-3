package ir.aut.homework3.q4;

public class Student {
    private String studentName;
    private int studentNumber;
    private int entranceYear;

    /**
     * a constructor to make a graduate student
     *
     * @param studentName   is the name of student
     * @param studentNumber is the number of student
     * @param entranceYear  is the entrance year of student
     */
    public Student(String studentName, int studentNumber, int entranceYear) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.entranceYear = entranceYear;
    }

    /**
     * a constructor to make a graduate student
     *
     * @param studentName   is the name of student
     * @param studentNumber is the number of student
     */
    public Student(String studentName, int studentNumber) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }

    /**
     * default constructor
     */
    public Student() {
        this("", 0, 0);
    }

    /**
     * this method converts an student to a string
     *
     * @return that string
     */
    public String toString() {
        return "STUDENT\t\t\t\t\t->\t" +
                "studentName : " + studentName + "\t\t|\t" +
                " studentNumber : " + studentNumber + "\t|\t" +
                " entranceYear : " + entranceYear
                ;
    }

    /**
     * this method shows all of the student's details
     *
     * @return a string that contains all details
     */
    public String displayInfo() {
        return this.toString();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getEntranceYear() {
        return entranceYear;
    }

    public void setEntranceYear(int entranceYear) {
        this.entranceYear = entranceYear;
    }

}
