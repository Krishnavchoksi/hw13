package hw.class13loops;

public class WhileLoopNum {
    public static void main(String[] args) {
        //To print odd number
        int i=1;
        while(i<=20){
            if(i%2!=0){
                System.out.println("Number is odd" +i);
            }i++;
        }
        //to print even number
        int n=1;
        while(n<=20){
            if(n%2==0){
                System.out.println("number is even" +n);
            } n++;
        }
    }
}
