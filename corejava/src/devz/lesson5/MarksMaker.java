
package devz.lesson5;

import java.util.Scanner;


public class MarksMaker {
  
    public static void main(String[] args) {
        System.out.println("===============MarksMaker================");
        
        Scanner in = new Scanner(System.in);
        String subName = "";
        int m = 0;
        
        
        
        char op ;
        op = in.next().charAt(0);
        
        if(op == '+'){
        }
        
        if(op == '-'){
        
        }
        
        
        
        
        
        //getting user inputs 
        System.out.println("Enter subject name :");
        subName = in.nextLine();
        System.out.println("Enter Subject Marks:");
        m = in.nextInt();
        
        // creating the logic 
        System.out.println("----------------Result------------------");
        System.out.print(subName + "-");
        if(m <= 35){
            System.out.println("F");
        }else if( m <= 45 ){
            System.out.println("S");
        } else if(m <= 55){
            System.out.println("C");
        } else if(m <= 75){
            System.out.println("B");
        } else if(m <= 100){
            System.out.println("A");
        }else{
            System.out.println("Invalid Input");
        }
        
       
        
        
    }
    
}
