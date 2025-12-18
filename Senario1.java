import java.util.Scanner;

public class Senario1 {
    //senario1
    public static int sumDigits(int a){
        if (a<10) return a;
        return (a%10)+sumDigits(a/10);
    }
    public static void main(String[] args){

        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("sumDigits= " + sumDigits(a));
    }

}
