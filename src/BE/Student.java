package BE;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String education;
    private List<GradeInfo> gradeReport;

    public Student(int id, String name, String email, String education) {
        super(id, name, email);
        this.education = education;
        this.gradeReport = new ArrayList<>();
    }

    public void addGrade(String subject, double grade) {
        gradeReport.add(new GradeInfo(subject, grade));
    }

    public double getAverageGrade() {
        if (gradeReport.isEmpty()) return 0.0;

        double sum = 0;
        for (GradeInfo g : gradeReport) {
            sum += g.getGrade();
        }
        return sum / gradeReport.size();
    }

    public String getEducation() {
        return education;
    }

    @Override
    public String toString() {
        return String.format("%-10d %-30s %-30s %-20s %-10.2f",
                getId(), getName(), getEmail(), education, getAverageGrade());
    }
}
