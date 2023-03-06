public class Name {
    private String fname;
    private String lname;
    private String mname;

    public Name(String fname, String mname, String lname){
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
    }
    public String getFName(){
        return fname;
    }
    public void setFName(String fname) {
        this.fname = fname;
    }
    public String getMName(){
        return mname;
    }
    public void setMName(String mname) {
        this.mname = mname;
    }
    public String getLName(){
        return lname;
    }
    public void setLName(String lname) {
        this.lname = lname;
    }
}
