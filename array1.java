import java.util.*;

public class array1 {
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
            if (a[i] < 0)
                System.out.println(a[i]);

        }

    }

}
