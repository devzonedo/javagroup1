
package devz.lesson2;


public class UnaryOperator {
    
    public static void main(String[] args) {
        
        
        boolean myBool = false;
        
        
        int n1 = 20, n2 = 10 , n3 = 0 , n4 = 20 , n5 = 40;
        //pre-increment 
        n3 = ++n1;
        System.out.println("++Operand:"+n3);
        //post increment
        System.out.println(n2++);
        System.out.println(n2);
//        n3 = n2++;
//        System.out.println("Operand++:"+n3);
//        System.out.println("Operand++:"+n3);

        
        n3 = --n4;
        System.out.println("--Operand:"+n3);
        
        System.out.println(n5--);
        System.out.println(n5);
        
        
        System.out.println("--------------------------");
        System.out.println(myBool);
        System.out.println(!myBool);
        
        
        
        
    }
}
