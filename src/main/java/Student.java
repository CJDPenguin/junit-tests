import java.util.ArrayList;

public class Student {
    private final long id;
    private final String name;
    public ArrayList<Integer> grades;


    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void addGrades(int grade){
        this.grades.add(grade);
    }

    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    public double getGradeAverage(){
        double total = 0;
        for (double grade : grades){
            total += grade;
        }
        return total / grades.size();
    }
}
