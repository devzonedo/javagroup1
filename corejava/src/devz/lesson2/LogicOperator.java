
package devz.lesson2;


public class LogicOperator {
    
    public static void main(String[] args) {
        
        int a  = 20 , b = 10;
        
        boolean bool1 = a < 50;
        System.out.println("bool1:"+bool1);
        
        boolean bool2 = b > 11;
        System.out.println("bool2:"+bool2);
        
        
        boolean bool3 = bool1 && bool2;
        System.out.println("bool3:"+bool3);
        
        
        
        boolean bool4 = bool1 || bool2;
        System.out.println("bool4:"+bool4);
        
        
        
        
        boolean bool5 = ( true && true  && false ) || ( 5 < 20  )  ;
        System.out.println("bool5:"+bool5);
        
    }
}
