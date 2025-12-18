import java.util.Scanner;

public class Senario2 {
    public static long power(long base, int exp){
        if(exp==0) return 1;
       return base * power(base, exp -1);

    }
    public static void main(String[] args){

        System.out.println("Enter a base number: ");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        System.out.println("Enter a exp number: ");
        int exp = sc.nextInt();
        System.out.println("result = "+ power(base,  exp));
    }
}
