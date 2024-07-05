package school.management.system;

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public void updateTotalMoneySpent(int moneySpent) {
        this.totalMoneyEarned -= moneySpent;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }
}
