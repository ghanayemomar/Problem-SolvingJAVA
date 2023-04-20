import java.util.*;

public class School {
    List<Teacher> teachers;
    List<Student> students;
    private static int totalMoneyEarned;
    private static int totlaMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totlaMoneySpent = 0;
    }

    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public static void updatetotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    public static void updatetotlaMoneySpent(int MoneySpent) {
        totalMoneyEarned -= MoneySpent;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public int gettotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int gettotlaMoneySpent() {
        return totlaMoneySpent;
    }

    public int getRemaningFees() {
        return totalMoneyEarned - totlaMoneySpent;
    }

}
