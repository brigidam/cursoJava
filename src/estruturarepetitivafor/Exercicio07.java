package estruturarepetitivafor;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            int prim = i;
            int seg = i * i;
            int terc = i * i * i;
            System.out.printf("%d %d %d%n", prim, seg, terc);
        }

        sc.close();
    }
}
