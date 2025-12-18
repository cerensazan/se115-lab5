import java.util.Scanner;

public class Bonus {
    public static int fib(int x){
        if(x==0) return 0;
        if(x==1) return 1;
        return fib(x-1)+fib(x-2);
     }


    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("fib = " + fib(x));
    }
}
