public class Teacher {
    private Name name;
    private String ic;
    private Address address;
    private String qualification;
    private int yearInCenter;
    private StudentBatch studentBatch;

    public Teacher(Name name, String ic, Address address, String qualification, int yearInCenter) {
        this.name = name;
        this.ic = ic;
        this.address = address;
        this.qualification = qualification;
        this.yearInCenter = yearInCenter;
    }

    public Name getName() {
        return name;
    }
    public void setName(Name name) {
        this.name = name;
    }
    public String getIc() {
        return ic;
    }
    public void setIc(String ic) {
        this.ic = ic;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public int getYearInCenter() {
        return yearInCenter;
    }
    public void setYearsOfExperience(int yearInCenter) {
        this.yearInCenter = yearInCenter;
    }
    public String getQualification() {
        return qualification;
    }
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    public void setStudentBatch(StudentBatch studentBatch) {
        this.studentBatch = studentBatch;
    }
    public StudentBatch getStudentBatch() {
        return studentBatch;
    }
}
