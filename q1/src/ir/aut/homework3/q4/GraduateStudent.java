package ir.aut.homework3.q4;

public class GraduateStudent extends Student {
    private static final int G_COURSES = 32;
    private String professor;

    /**
     * a constructor to make a graduate student
     *
     * @param studentName   is the name of student
     * @param studentNumber is the number of student
     * @param entranceYear  is the entrance year of student
     * @param professor     is the student's professor name
     */
    public GraduateStudent(String studentName, int studentNumber, int entranceYear, String professor) {
        super(studentName, studentNumber, entranceYear);
        this.professor = professor;
    }

    /**
     * default constructor
     */
    public GraduateStudent() {
        this("?", 0, 0, "?");
    }

    /**
     * this method converts an graduate student to a string
     *
     * @return that string
     */
    public String toString() {
        return "GRADUATE STUDENT\t\t->\t" +
                "studentName : " + super.getStudentName() + "\t\t|\t" +
                " studentNumber : " + super.getStudentNumber() + "\t|\t" +
                " entranceYear : " + super.getEntranceYear() + "\t|\t" +
                " entranceType : " + professor + "\t|\t" +
                " all units : " + G_COURSES
                ;
    }

    /**
     * this method shows all of the student's details
     *
     * @return a string that contains all details
     */
    public String displayStudentInformation() {
        return this.toString();
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
}
