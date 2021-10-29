package hw.class13loops;

public class ForLoopNum {
    public static void main(String[] args) {
        //to print even number
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("This is even" +
                        i);
            }
        }
        //to print odd number
        for (int i=1;i<20;i=i+2){
            System.out.println("This is odd "+i);
        }
    }
}

