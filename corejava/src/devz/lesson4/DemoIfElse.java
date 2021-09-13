package devz.lesson4;

public class DemoIfElse {

    public static void main(String[] args) {

//        if(55<10){
//            System.out.println("this is true part");
//        }else
//            System.out.println("this is false part");
//        
        int q = 5;
        int a = 6;

        if (q > a) {
            System.out.println("1");
        } else {
            System.out.println("2");
            
            if (10 < 25) {
                System.out.println("true");
            }
            
            System.out.println("3");
        }

        System.out.println("program continue");
    }

}
