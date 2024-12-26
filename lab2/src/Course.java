/**
 * The Course example class.
 */
@XmlRoot("course")
public class Course {

    @XmlJsonField("subject")
    private String subject;

    @XmlJsonField("semester")
    private int semester;

    @XmlJsonField("studentsLimit")
    private int studentsLimit;

    public Course(String subject, int semester, int studentsLimit) {
        this.subject = subject;
        this.semester = semester;
        this.studentsLimit = studentsLimit;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getStudentsLimit() {
        return studentsLimit;
    }

    public void setStudentsLimit(int studentsLimit) {
        this.studentsLimit = studentsLimit;
    }
}
