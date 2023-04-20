import java.util.*;

public class Main {
    public static void main(String[] args) {
        Teacher Omar = new Teacher(1, "Omar", 500);
        Teacher Abood = new Teacher(2, "Abood", 100);
        Teacher Amr = new Teacher(3, "Amr", 200);
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Omar);
        teacherList.add(Abood);
        teacherList.add(Amr);

        Student Ahmad = new Student(1, "Ahmad", 4);
        Student Mohammed = new Student(2, "Mohammed", 5);
        Student Owen = new Student(3, "Owen", 10);
        List<Student> studentList = new ArrayList<>();
        studentList.add(Ahmad);
        studentList.add(Mohammed);
        studentList.add(Owen);

        School AAUP = new School(teacherList, studentList);

        System.out.println(AAUP.gettotalMoneyEarned());
        Ahmad.payFees(5000);
        Owen.payFees(1000);
        System.out.println(AAUP.gettotalMoneyEarned());
        System.out.println("Making School Paying salary");
        Amr.receiveSalary(Amr.getSalary());
        System.out.println(AAUP.gettotalMoneyEarned());
        System.out.println(Ahmad.toString());

    }
}
