package devz.lesson13;

public class StudetLogic {

    public void setStudent() throws StudentException,MyException {

        try {
            System.out.println("this method insert studet record into db");
        } catch (Exception e) {
            throw new StudentException("student exception found");
        }

        
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
        
        try {
            System.out.println("hi");
            System.out.println("hi");
        } catch (Exception e) {
            throw new MyException("this is my exception");
        }
     
        
        
        
    }

}
