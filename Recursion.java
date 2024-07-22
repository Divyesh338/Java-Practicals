public class Recursion {
    // public static void rev(int n){
    //     if (n == 25) {
    //         return ;
    //     }
    //     System.out.print(n +" ");
    //     rev(n + 1);
    // }
    // public static void main(String[] args) {
    //     int n = 1;
    //     rev(n);
    // }
    public static void Recursion2(int i, int n, int sum){
        if (i == n) {
            sum += i;
           System.out.println(sum); 
           return;
        }
        sum +=i;
        Recursion2(i+1, n, sum);
}
public static void main(String[] args) {
    Recursion2(1, 6, 0);
}
}
