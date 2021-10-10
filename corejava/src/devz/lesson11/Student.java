package devz.lesson11;

public class Student {

    private int studentID;
    private String firstName;
    private String lastName;

    public void setStudentID(int sid) {
        this.studentID = sid;
    }

    public int getStudentID() {
        return this.studentID;
    }

    public void setFirstName(String fn) {
        this.firstName = fn;
    }
    
    public String getFirstName(){
        return this.firstName;
    }

    public void setLastName(String ln){
        this.lastName = ln;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
}
