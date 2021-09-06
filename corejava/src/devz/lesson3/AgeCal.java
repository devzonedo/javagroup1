package devz.lesson3;

import java.util.Scanner;


public class AgeCal {
    
    
    public static void main(String[] args) {
        
        Scanner myin = new Scanner(System.in);
        
        System.out.println("Enter your name:");
        String nm = myin.nextLine();
        
        
        System.out.println("Enter your age:");
        int age = myin.nextInt();
        
        System.out.println("How many years you want to add:");
        int years = myin.nextInt();
        int nxtage = age + years;
        
        System.out.println(nm+" your next age is:"+nxtage);
        
    }
    
    
}
