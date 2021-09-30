
package devz.lesson9;


public class DemoMain {
   
    public static void main(String[] args) {
        A myA = new A();
        //myA.getName();
        //System.out.println(myA.age);
        
        B myB = new B();
        
        C myC = new C();
        myC.getCountryName(); // protected
        
        
        
        OLStudent olStu = new OLStudent();
        olStu.getMothersName();
        
        Student stu = new Student();
        stu.getMothersName();
        
    }
    
}
