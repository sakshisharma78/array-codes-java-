import java.util.Scanner;

public class array5 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int e = 0;
        int odd = 0;
        System.out.println("enter n");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                e += 1;

            } else {
                odd += 1;
            }
        }
        System.out.println(odd);
        System.out.println(e);

        

    }

}
