import java.util.Scanner;

public class array2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        System.out.println("enter n");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

        }
        for (int i = 0; i < a.length; i++) {
            sum += a[i];

            System.out.println(sum);

        }

    }

}
