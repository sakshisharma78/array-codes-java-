import java.util.Scanner;

public class array4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int max2 = 0;
        System.out.println("enter n");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];

        }

        for (int i = 0; i < a.length; i++) {

            if (a[i] > max2 && a[i] < max)
                max2 = a[i];

        }
        System.out.println(max);
        System.out.println(max2);

    }

}
