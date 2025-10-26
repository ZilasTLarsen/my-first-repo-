package BE;

import java.util.List;

public class Teacher extends Person {
    private String initials;
    private List<String> subjects;

    // Constructor
    public Teacher(int id, String name, String email, String initials, List<String> subjects) {
        super(id, name, email); // calls BE.Person's constructor
        this.initials = initials;
        this.subjects = subjects;
    }

    // Getters (optional)
    public String getInitials() {
        return initials;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public String getMainSubject() {
        if (subjects != null && !subjects.isEmpty()) {
            return subjects.get(0);
        }
        return "N/A";
    }

    // Override toString() to include extra info
    @Override
    public String toString() {
        return String.format("%-10d %-30s %-30s %-20s %-20s",
                getId(), getName(), getEmail(), initials, getMainSubject());
    }
}
