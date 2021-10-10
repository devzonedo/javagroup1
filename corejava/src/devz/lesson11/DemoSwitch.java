package devz.lesson11;

public class DemoSwitch {

    public static void main(String[] args) {

        int age = 55;

        switch (age) {
            case 18:
                System.out.println("Younger");
                break;
            case 25:
                System.out.println("Elder");
                break;
            case 35:
                System.out.println("Older");
                break;
            default:
                System.out.println("no category found");

        }

//        if(age == 18){
//            System.out.println("Young");
//        }
//        
//        if(age == 25){
//            System.out.println("Elder");
//        }
    }

}
