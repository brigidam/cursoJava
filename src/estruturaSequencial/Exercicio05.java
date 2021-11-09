package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1 = sc.nextInt();
        int qte1 = sc.nextInt();
        double preco1 = sc.nextDouble();
        int cod2 = sc.nextInt();
        int qte2 = sc.nextInt();
        double preco2 = sc.nextDouble();

        double total = (preco1 * qte1) + (preco2 * qte2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n ", total);

        sc.close();
    }
}
