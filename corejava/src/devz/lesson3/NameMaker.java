
package devz.lesson3;

import java.util.Scanner;

public class NameMaker {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        /*
        System.out.println("Enter your name");
        String fname = in.nextLine();
        String t = "Good evening ";
        String greeting  = t + fname;
        System.out.println(greeting);   
        */
        
        System.out.println("Enter your first name:");
        String fname = in.nextLine();
        System.out.println("Enter your last name :");
        String lname = in.nextLine();
        
        String fullname = fname + " " + lname;
        System.out.println("Hi "+fullname);
        
        
    }
    
}
