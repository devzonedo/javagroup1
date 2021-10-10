package devz.lesson11;

public class DemoBean {

    public static void main(String[] args) {
        int temp = 0;

        Student stu = new Student();
        stu.setStudentID(25);
        temp = stu.getStudentID();
        System.out.println("temp:"+temp);

    }

}
