import java.lang.reflect.Array;
import java.util.ArrayList;
public class Student {
    private Name name;
    private String ic;
    private Address address;
    private String schoolName;
    private ArrayList<Integer> scores;

    public Student(Name name, String ic, Address address, String schoolName) {
        this.name = name;
        this.ic = ic;
        this.address = address;
        this.schoolName = schoolName;
        this.scores = new ArrayList<Integer>();
    }

    public Name getName() {
        return name;
    }
    public String getIc() {
        return ic;
    }
    public Address getAddress() {
        return address;
    }
    public String getSchoolName() {
        return schoolName;
    }
    public ArrayList<Integer> getScores() {
        return scores;
    }
    public void setName(Name name) {
        this.name = name;
    }
    public void setIc(String ic) {
        this.ic = ic;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    public void setScores(ArrayList<Integer> scores) {
        this.scores.clear();
        for (Integer score : scores) {
            this.scores.add(score);
        }
    }
    public double getAvgScore() {
        double totalScore = 0;
        for (int i = 0; i < scores.size(); i++) {
            totalScore += scores.get(i);
        }
        return totalScore / scores.size();
    }
    public int getHighestMark() {
        int highest = scores.get(0);
        for (int i = 0; i < scores.size(); i++) {
            int mark = scores.get(i);
            if (mark > highest) {
                highest = mark;
            }
        }
        return highest;
    }
    public int getLowestMark() {
        int lowest = scores.get(0);
        for (int i = 0; i < scores.size(); i++) {
            int mark = scores.get(i);
            if (mark < lowest) {
                lowest = mark;
            }
        }
        return lowest;
}
}