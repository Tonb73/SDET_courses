import java.util.Iterator;
import java.util.List;

public class StudentManagment {

    public  void promote(Student student){
        student.setCourse(student.getCourse()+1);
    }

    public int deleteStupid(List<Student> studentList){
        if(studentList.isEmpty()){
            return 0;
        }
        int c = 0;
        Iterator<Student> iterator = studentList.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            if(student.getAverageGrad() < 3){
                iterator.remove();
                c++;
            }
        }
        return c;
    }

    public  int promoteNotStupid(List<Student> studentList){
        if(studentList.isEmpty()){
            return 0;
        }
        int c = 0;
        for (Student student : studentList) {
            if (student.getAverageGrad() >= 3) {
                promote(student);
                c++;
            }
        }
        return c;
    }

    public  void printStudents(List<Student> studentList, int course){
        if(studentList.isEmpty()){
            return;
        }
        System.out.println("Студенты " + course + "курса.");
        for(Student student: studentList){
            if(student.getCourse() == course){
                System.out.println("Имя: " + student.getName() + " Группа: " + student.getGroup());
            }
        }
    }
}
