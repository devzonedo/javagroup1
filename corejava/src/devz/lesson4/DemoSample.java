
package devz.lesson4;

import java.util.Scanner;


public class DemoSample {
  
    
    public static void main(String[] args) {
        
        int age;
        System.out.println("Enter your age:");
        Scanner in =  new Scanner(System.in);
        age = in.nextInt();
        
        if(age < 18){
            System.out.println("you are yonger");
        }else{
            System.out.println("you are elder");
        }
        
        
        
    }
    
    
}
