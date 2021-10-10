package devz.lesson10;

public class Student {

    private String fname;
    private String lname;
    private int age;

    //constructor
    public Student() {
        this.fname = "Kumara";
    }
    
    public Student(String f){
        System.out.println("this is one para constructor :"+f);
    }
    
    public Student(String f,String l){
    
    }
    
    public Student(int a,String b){
        
    }

    public void setFirstName(String fn) {
        this.fname = fn;
    }

    public String getFirstName() {
        return this.fname;
    }

}
