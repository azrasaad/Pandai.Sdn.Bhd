import java.util.ArrayList;
public class StudentBatch {
    private ArrayList<Student> students;
    private Teacher teacher;
    private int currSize = 0;
    private int maxSize;

    public StudentBatch(Teacher teacher, int maxSize) {
        this.teacher = teacher;
        this.maxSize = maxSize;
        this.students = new ArrayList<Student>();
    }
    public void addStudent(Student student) {
        if (currSize < maxSize) {
            students.add(student);
            currSize++;
            System.out.println("Student added to batch " + teacher.getName().getFName() + " is managing " + student.getName().getFName());
        } else {
            System.out.println("Batch is full, cannot add student.");
        }
    }
    public Student find(Name name){
        for (int i = 0; i < currSize; i++){
            Student student = students.get(i);
            if (student.getName().getFName().equals(name.getFName()) && student.getName().getMName().equals(name.getMName()) && student.getName().getLName().equals(name.getLName())){
                System.out.println(student.getName().getFName() + " is in this batch.");
                return student;
            }
        }
        System.out.println("Cannot find that student in this batch.");
        return null;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public Teacher getTeacher() {
        return teacher;
    }
}
