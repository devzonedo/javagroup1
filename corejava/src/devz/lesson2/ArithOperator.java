
package devz.lesson2;


public class ArithOperator {
    
    public static void main(String[] args) {
        
        int num1 = 20;
        int num2 = 10;
        
        int ans1 = num1 + num2;
        System.out.println("Adding(+)="+ans1);
        
        int ans2 = num1 - num2;
        System.out.println("Substraction(-)"+ans2);
        
        ans2 = num1 * num2;
        System.out.println("Multiplying(*)"+ans2);
        
        int num3 = num1 / num2;
        System.out.println("Dividing(/)"+num3);
        
        num1 = 22;
        int num4 = 25 % 10;
        System.out.println("Modulus(%)"+num4);
    }
    
    
    
}
