package devz.lesson7;

import java.util.Scanner;

public class DemoNameRep {

    
    
    
    public static void main(String[] args) {

        String fname;
        String lname;
        String fullName;
        int r = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your First Name:");
        fname = in.nextLine();
        System.out.println("Enter your Last Name:");
        lname = in.nextLine();
        
        fullName = fname +" "+ lname;
        
        System.out.println("How many times to repeat this?");
        r = in.nextInt(); //3
        
        
        for(int i = 1; i <= r ; i++ ){
            System.out.println(i + fullName);
        }
        
        
        
    }

    
    
    
    /*
    
    
    
    *****
    *****
    *****
    *****
    *****
    
    
    
    */
}
