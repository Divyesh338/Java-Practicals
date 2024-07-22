import java.util.Scanner;

/**
 * Array2
 */
public class Array2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();


        int marks[] = new int[size];

        for (int i = 0; i <size ; i++) {
             marks[i] = sc.nextInt();
        }
        sum(marks);
    }
    public static void sum(int[] arr)
    {
        // getting sum of array values
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        System.out.println("sum of array values : " + sum);
    }

}