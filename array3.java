import java.util.*;

public class array3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int min;
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
        min = a[0];
        for (int i = 0; i < a.length; i++) {

            if (a[i] < min)
                min = a[i];

        }
        System.out.println(max);
        System.out.println(min);

    }

}
