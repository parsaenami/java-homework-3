package ir.aut.homework3.q4;

public class UndergraduateStudent extends Student {
    private static final int UG_COURSES = 142;
    private type entranceType;

    /**
     * a constructor to make a undergraduate student
     *
     * @param studentName   is the name of student
     * @param studentNumber is the number of student
     * @param entranceYear  is the entrance year of student
     * @param type          is the way that the student came to university
     */
    public UndergraduateStudent(String studentName, int studentNumber, int entranceYear, type type) {
        super(studentName, studentNumber, entranceYear);
        this.entranceType = type;
    }

    /**
     * default constructor
     */
    public UndergraduateStudent() {
        this("?", 0, 0, type.NONE);
    }

    public enum type {
        UEE,
        OLYMPIAD,
        FACULTY,
        NONE,
    }

    /**
     * this method converts an undergraduate student to a string
     *
     * @return that string
     */
    public String toString() {
        return "UNDERGRADUATE STUDENT\t->\t" +
                "studentName : " + super.getStudentName() + "\t|\t" +
                " studentNumber : " + super.getStudentNumber() + "\t|\t" +
                " entranceYear : " + super.getEntranceYear() + "\t|\t" +
                " entranceType : " + entranceType + "\t\t|\t" +
                " all units : " + UG_COURSES
                ;
    }

    /**
     * this method shows all of the student's details
     *
     * @return a string that contains all details
     */
    public String displayStudentInformation() {
        //return super.getStudentName() + "\t" + super.getStudentNumber() + "\t" + super.getEntranceYear() + "\t" + this.entranceType;
        return this.toString();
    }

    public type getEntranceType() {
        return entranceType;
    }

    public void setEntranceType(type entranceType) {
        this.entranceType = entranceType;
    }
}
