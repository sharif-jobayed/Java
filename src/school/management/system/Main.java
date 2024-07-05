package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Teachers list
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(new Teacher(0001, "Imran Khan", 100000));
        teacherList.add(new Teacher(0002, "Javed Miandad", 70000));
        teacherList.add(new Teacher(0003, "Shane Warne", 85000));

        // Students list
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(0001, "Wasim Akram", 5));
        studentList.add(new Student(0002, "Inzamam-ul-Haq", 4));
        studentList.add(new Student(0003, "Saqlain Mushtaq", 5));

        // Schools list
        List<School> schoolList = new ArrayList<>();
        schoolList.add(new School(teacherList, studentList));

        // Cricket school
        School cricketSchool = schoolList.get(0);
        System.out.println("cricketSchool School has earned $"+cricketSchool.getTotalMoneyEarned()+" so far.");

        // Students
        Student wasim = studentList.get(0);
        Student inzi = studentList.get(1);
        Student saqlain = studentList.get(2);

        // Student's payments
        wasim.updateFeesPaid(5000);
        System.out.println(wasim.getName()+" has paid $"+wasim.getFeesPaid()+" & cricketSchool School has earned $"+cricketSchool.getTotalMoneyEarned()+" so far.");

        inzi.updateFeesPaid(5000);
        System.out.println(inzi.getName()+" has paid $"+inzi.getFeesPaid()+" & cricketSchool School has earned $"+cricketSchool.getTotalMoneyEarned()+" so far.");

        saqlain.updateFeesPaid(5000);
        System.out.println(saqlain.getName()+" has paid $"+saqlain.getFeesPaid()+" & cricketSchool School has earned $"+cricketSchool.getTotalMoneyEarned()+" so far.");

    }
}
