package BE;

public class GradeInfo {
    private String subject;
    private double grade;

    public GradeInfo(String subject, double grade) {
        this.subject = subject;
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return subject + ": " + grade;
    }
}
