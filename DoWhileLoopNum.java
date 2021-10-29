package hw.class13loops;

public class DoWhileLoopNum {
    public static void main(String[] args) {
        //to print even number
        int i=1;
        do {
            if(i % 2 ==0){
                System.out.println(i);
            }

        i++;
    } while(i<=20);
        //to print odd number
        int n=1;
         do{
             if (n %2 !=0){
                 System.out.println(n);
             }n++;
         } while (n<=20);
      }


}
