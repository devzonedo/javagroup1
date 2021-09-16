package devz.lesson6;

import java.util.Scanner;

public class DemoNameMaker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName = in.nextLine();
        System.out.println("Enter last name:");
        String lastname = in.nextLine();
        
        Employee em = new Employee();
        em.addTwoNames(firstName, lastname);
        
    }

}
