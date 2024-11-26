import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(String _name, String _group, int _course, List<Integer> _grades){
        name = _name;
        group = _group;
        course = _course;
        grades = _grades;
    }

    public double getAverageGrad(){
        if(this.grades.isEmpty()){
            return 0;
        }
        double avGrade = 0;
        for(int gr: this.grades){
            avGrade+= gr;
        }
        avGrade/=this.grades.size();
        return  avGrade;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
