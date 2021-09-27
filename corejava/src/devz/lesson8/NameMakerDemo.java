package devz.lesson8;

/*

  String fname = "";
        String lname = "";
        String fullName = "";
        String key="";

        Scanner in = new Scanner(System.in);
        boolean flag = true;
        
        do {

            System.out.println("Enter First Name:");
            fname = in.nextLine();
            System.out.println("Enter Last Name:");
            lname = in.nextLine();

            fullName = fname + " " + lname;
            System.out.println("Hi " + fullName);

            System.out.println("Press 1 to continue or any key to exit:");
            key = in.nextLine();
            
            if(key.equalsIgnoreCase("1")){
                
            }else{
            flag = false;
            }
            
        } while (flag);
        
        System.out.println("Bye....");

 */
import java.util.Scanner;

public class NameMakerDemo {

    public static void main(String[] args) {

        String fname = "";
        String lname = "";
        String fullName = "";
        String key = "";

        Scanner in = new Scanner(System.in);
        boolean flag = true;
        NameMakerDemo obj = new NameMakerDemo();

        do {
            System.out.println("Enter First Name:");
            fname = in.nextLine();
            System.out.println("Enter Last Name:");
            lname = in.nextLine();
            
            obj.createFullName(fname, lname); // full name prints within this method

            System.out.println("Press 1 to continue or any key to exit:");
            key = in.nextLine();
            flag = obj.checkIfWannaExit(key);
            
        } while (flag);

        System.out.println("Bye....");
    }

    public void createFullName(String fn, String ln) {
        System.out.println("hi " + fn + " " + ln);
    }

    public boolean checkIfWannaExit(String ky) {
        if (ky.equalsIgnoreCase("1")) {
            return true;
        } else {
            return false;
        }
    }

}
