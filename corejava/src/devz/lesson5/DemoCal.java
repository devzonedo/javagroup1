/*
(Allowed operators  +  -  /  * )

Enter Number one :10      // int num1 = 0
Enter Number two :2       // int num2 = 0;
Enter Operator   :*       // char op; 
                          // int ans = 0;


 // scanner 

=======================
Answer = 5
=======================


creating the variables 
creating scanner object to get inputs
show "Enter Number one :"  to the user 
get input value to the num1 variable .nextInt()
show "Enter Number two :" to the user 
get input value to the num2 variable .nextInt()
show "Enter Operator   :" 
get input to the variable op    
check the operator which user has input
calculation 
store the answer to the ans variable 
finally show the ans 
 */
package devz.lesson5;

import java.util.Scanner;

public class DemoCal {

    public static void main(String[] args) {
        System.out.println("========DemoCal Started==========");
        System.out.println("Allowed Operators are + - * /");

        int n1 = 0;
        int n2 = 0;
        int ans = 0;
        char op;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number 1:");
        n1 = in.nextInt();
        System.out.println("Enter Number 2:");
        n2 = in.nextInt();
        System.out.println("Enter Number Operator:");
        op = in.next().charAt(0);

        if (op == '+') {
            ans = n1 + n2;
        } else if (op == '-') {
            ans = n1 - n2;
        } else if (op == '*') {
            ans = n1 * n2;
        } else if (op == '/') {
            ans = n1 / n2;
        } else {
            System.out.println("Invalid Input Found");
        }

        System.out.println(n1 +"" +op +"" + n2 + "=" + ans);

        System.out.println("========DemoCal End==========");
    }

}
