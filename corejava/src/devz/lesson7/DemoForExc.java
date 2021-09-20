
package devz.lesson7;

import java.util.Scanner;


public class DemoForExc {
    
    // i - 10
    
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Number:");
        int x = in.nextInt();
        
        for(int i = x ; i >= 0 ; i-- ){
            
            if(i == 10){
                System.out.println("we are going to continue this");
                continue;
            }
            System.out.println(i);
        }
        
        System.out.println("End");
    }
    
    
    
}
