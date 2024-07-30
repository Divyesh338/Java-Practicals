import java.util.Scanner;

public class func_1_pra {
    public static float Average(int a,int b,int c) {
        float avg = (a+b+c)/2;
        return avg;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First no:");
        int a = sc.nextInt();
        System.out.println("Enter Second no:");
        int b = sc.nextInt();
        System.out.println("Enter Third no:");
        int c = sc.nextInt();
        
        System.out.println("The Average of numbers is "+ Average(a, b, c));
    }
}
