import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 1;
        int total1 = 1;
        int total2 = 1;
        int kombinasyon = 0;


        Scanner inp = new Scanner(System.in);
        System.out.println("n değeri giriniz:");
        int n = inp.nextInt();
        System.out.println("r değeri giriniz:");
        int r = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            total = total * i;
        }
        for (int i = 1; i <= r; i++) {
            total1 = total1 * i;
        }
        for (int i = 1; i <= (n - r); i++) {
            total2 = total2 * i;
        }
        kombinasyon = total / (total1 * total2);
        System.out.println("C(n,r):" + kombinasyon);


    }
}