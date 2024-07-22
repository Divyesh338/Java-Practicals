import java.util.Scanner;

public class function {
    // public static void printmyName(String name){
    //     System.out.println(name);
    //     return;

    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter Your name:");
    //     String name = sc.nextLine();

    //     printmyName(name);
        
    // }


    // 2. Sum of two numbers.

    /**
     * 
     */
    // public static int CalculateSum(int a,int b) {
    //     int sum = a+b;
    //     return sum;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     int sum = CalculateSum(a, b);
    //     System.out.println("Sum of two numbers:"+ sum);
        
    // }



    // 3. Multiply two numbers

    //     public static int MultplyOftwo(int a,int b){
    //         return  a * b;
        
            
    //     }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
        
    //     System.out.println("Product of two number is:"+ MultplyOftwo(a,b));

    // }

    // 4. Print the factorial of number.

    public static int printfactorial(int n){
        if (n<0) {
            System.out.println("Invalid Number");
            return 1;
        }
        int factorial=1;
        for (int i = n; i>=1; i--){
            factorial = factorial * i;
        }
        
        return factorial;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        System.out.println("factorial of number is:" + printfactorial(n));
    }
}
