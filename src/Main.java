import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Иванов Иван", "Группа 1", 1,  Arrays.asList(2, 3, 3, 5, 5, 5, 5)));
        studentList.add(new Student("Петров Петр", "Группа 2", 1, Arrays.asList(2, 3, 3, 5, 5, 5, 5)));
        studentList.add(new Student("Сидоров Сидор", "Группа 1", 2, Arrays.asList(4, 4, 5, 3, 4, 5)));
        studentList.add(new Student("Кузнецов Кузьма", "Группа 2", 2, Arrays.asList(2, 2, 3)));
        studentList.add(new Student("Владов Влад", "Группа 1", 2, Arrays.asList(4,2,1,3,3)));
        studentList.add(new Student("Антонов Дмитрий", "Группа 2", 2, Arrays.asList(2, 2, 2, 2, 2, 2, 2)));

        StudentManagment studentManagment = new StudentManagment();
        studentManagment.deleteStupid(studentList);
        studentManagment.promoteNotStupid(studentList);

        studentManagment.printStudents(studentList,1);
        studentManagment.printStudents(studentList,2);
        studentManagment.printStudents(studentList,3);
    }
}