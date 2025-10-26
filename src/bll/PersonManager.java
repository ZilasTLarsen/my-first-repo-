package bll;

import BE.Person;
import BE.Student;
import BE.Teacher;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {
    private List<Person> persons;

    public PersonManager() {
        this.persons = new ArrayList<>();
    }

    // Add person only if ID is unique
    public boolean addPerson(Person p) {
        if (!persons.contains(p)) {
            persons.add(p);
            return true;
        } else {
            System.out.println("BE.Person with ID " + p.getId() + " already exists.");
            return false;
        }
    }

    // Remove person by object
    public boolean removePerson(Person p) {
        return persons.remove(p);
    }

    // Get specific person by ID
    public Person getPersonById(int id) {
        for (Person p : persons) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    // Return all persons
    public List<Person> getAllPersons() {
        return new ArrayList<>(persons);
    }

    // Return only students
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        for (Person p : persons) {
            if (p instanceof Student) {
                students.add((Student) p);
            }
        }
        return students;
    }

    // Return only teachers
    public List<Teacher> getAllTeachers() {
        List<Teacher> teachers = new ArrayList<>();
        for (Person p : persons) {
            if (p instanceof Teacher) {
                teachers.add((Teacher) p);
            }
        }
        return teachers;
    }
}
