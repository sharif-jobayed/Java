package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(new Teacher(1, "Imran Khan", 100000));
        teacherList.add(new Teacher(2, "Javed Miandad", 70000));
        teacherList.add(new Teacher(3, "Diego Maradona", 85000));

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Wasim Akram", 5));
        studentList.add(new Student(2, "Inzamam-ul-Haq", 4));
        studentList.add(new Student(3, "Lionel Messi", 5));

        List<School> schoolList = new ArrayList<>();
        schoolList.add(new School(teacherList, studentList));

        School ghs = schoolList.get(0);
        System.out.println("GHS School has earned $"+ghs.getTotalMoneyEarned()+" so far.");
    }
}
