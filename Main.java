import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create two teachers
        Address teacherAdd1 = new Address("Bandar Hillpark", "42300", "Puncak Alam", "Selangor", "Malaysia");
        Teacher teacher1 = new Teacher(new Name("Nur", "Hayati", "Ahmad"), "770901057788", teacherAdd1, "Degree in Math", 7);

        Address teacherAdd2 = new Address("Taman Indah", "45200", "Sabak Bernam", "Selangor", "Malaysia");
        Teacher teacher2 = new Teacher(new Name("Noor", "Qamarina", "Mohamad"), "950510105549", teacherAdd2, "Degree in Engineering", 5);

        // Create two student batches
        StudentBatch batch1 = new StudentBatch(teacher1, 5);
        StudentBatch batch2 = new StudentBatch(teacher2, 5);

        // Create some scores for the students
        ArrayList<Integer> scores1 = new ArrayList<Integer>(Arrays.asList(70, 85, 78));
        ArrayList<Integer> scores2 = new ArrayList<Integer>(Arrays.asList(80, 90, 85));
        ArrayList<Integer> scores3 = new ArrayList<Integer>(Arrays.asList(95, 85, 90));
        ArrayList<Integer> scores4 = new ArrayList<Integer>(Arrays.asList(75, 80, 70));

        // Create three students for batch 1
        Address studentAdd1 = new Address("Bandar Kemaman", "45230", "Klang", "Selangor", "Malaysia");
        Student student1 = new Student(new Name("Julia", "Batrisyia", "Azmi"), "010506101022", studentAdd1, "ABC School");
        student1.setScores(scores1);
        batch1.addStudent(student1);

        Address studentAdd2 = new Address("Taman Melawati", "35600", "Shah Alam", "Selangor", "Malaysia");
        Student student2 = new Student(new Name("Hazzratull", "Baia'ah", "Saad"), "030607100473", studentAdd2, "XYZ School");
        student2.setScores(scores2);
        batch1.addStudent(student2);

        Address studentAdd3 = new Address("Bukit Raja", "22510", "Setia Alam", "Selangor", "Malaysia");
        Student student3 = new Student(new Name("Ahmad", "Zachary", "Yazid"), "990230102265", studentAdd3, "DEF School");
        student3.setScores(scores3);
        batch2.addStudent(student3);

        // Create three students for batch 2
        Address studentAdd4 = new Address("Bandar Temerloh", "12340", "Bukit Jalil", "Selangor", "Malaysia");
        Student student4 = new Student(new Name("Seni", "Wahyuputri", "Hussain"), "980501077265", studentAdd4, "GHI School");
        student4.setScores(scores4);
        batch2.addStudent(student4);

        System.out.println("Finding student named \"Hazzratull\" in batch1...");
        Student foundStudent = batch1.find(new Name("Hazzratull", "Baia'ah", "Saad"));
        if (foundStudent == null) {
            System.out.println("Student not found.");
        } else {
            System.out.println("Student found: " + foundStudent.getName().getFName());
        }

        System.out.println("Average mark: " + student2.getAvgScore());
        System.out.println("Average mark: " + student4.getAvgScore());

        System.out.println("Highest mark: " + student1.getHighestMark());
        System.out.println("Highest mark: " + student3.getHighestMark());

        System.out.println("Lowest mark: " + student3.getLowestMark());
        System.out.println("Lowest mark: " + student1.getLowestMark());
    }
}