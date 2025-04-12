package sms;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private final String ID;
    private String name;
    private HashMap<Course, Grade> courses;

    public Student(String ID, String name) {
        this.ID = ID;
        this.name = name;
        this.courses = new HashMap<>();
    }

    public void enroll(Course course, Grade grade) {
        this.courses.put(course, grade);
    }

    public Map<Course, Grade> getCourses() {
        return Collections.unmodifiableMap(this.courses);
    }

    public Double calculateGPA() {
        return courses.values().stream()
                .mapToDouble(Grade::getPoint)
                .average()
                .orElse(0.0);
    }

    public String getID() {
        return this.ID;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.getID()+" - "+this.getName()+" | GPA: "+String.format("%.2f", calculateGPA());
    }
}
