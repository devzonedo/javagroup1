package devz.lesson13;

public class DemoException {

    public static void main(String[] args) {

        System.out.println("1");

        try {
            System.out.println("2");
            System.out.println("3");
        } catch (NullPointerException n) {
            n.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            System.out.println("this works all the time");
        }

        System.out.println("4");
        System.out.println("5");
        
        StudetLogic s = new StudetLogic();
        try {
            
             s.setStudent();
             System.out.println("hi");
             System.out.println("hi");
             System.out.println("hi");
          
        }catch(StudentException ex){
            System.out.println("error occour ");
        }catch(MyException m){
            System.out.println("my exception found");
        } catch (Exception e) {
            
        }
       
        
        
        
        
    }

}
