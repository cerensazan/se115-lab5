import java.util.Scanner;

public class Senario0 {
        //senario0
        public static int factorial( int n){
            if (n==0)
                return 1;
            else
                return n*factorial(n-1);

        }
        public static void main(String[] args){
            System.out.println("Enter a number: ");
            Scanner sc= new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println("factorial = " + factorial(n));

        }
    }
