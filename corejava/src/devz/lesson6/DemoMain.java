package devz.lesson6;

public class DemoMain {

    public static void main(String[] args) {
        int a = 20;
        Teacher t = new Teacher();
        t.getSchoolName();
        System.out.println("value of a:" + a);
        a = t.getAge();
        System.out.println("a is:" + a);

        t.setSalary(25000, 3000);

        int b = 25000;
        int c = 2000;
        t.setSalary(b, c);

        int mincome = t.getMonthlyIncome(500, 30);
        System.out.println("mincome:" + mincome);
        
        t.printSalarySlip("Samantha Fernando", mincome);

    }

}
