
package devz.lesson6;


public class Teacher {
    //properties 
    String fname;
    String lname;
    int age = 35;
    int salary;
    
    //behaviours   // methods
    
    
    //No-Args   No-Return-Type
    void getSchoolName(){
        System.out.println("ASD School");
    }
    
    //No-Args  Return-Type
    int getAge(){
        int aq = 65;
        return aq;
    }
    
    
    //Args    No-Return-Type
    void setSalary(int bs,int alows){
        int ttlsal = bs+alows;
        System.out.println("Total Salary:"+ttlsal);
    }
    
    
    int getMonthlyIncome(int daySal,int noofdays){
        int incm = daySal * noofdays;
        return incm;
    }
    
    
    void printSalarySlip(String teachName,int ttlSal){
        System.out.println("------------SalarySlip--------------");
        System.out.println("Teacher Name:"+teachName);
        System.out.println("Total Salary:"+ttlSal);
        System.out.println("------------SalarySlip--------------");
    }
    
    
    
}
