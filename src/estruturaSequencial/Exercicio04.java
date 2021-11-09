package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        double horasTrab = sc.nextDouble();
        double valorHora = sc.nextDouble();
        double salario = horasTrab * valorHora;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = R$ %.2f%n", salario);


        sc.close();
    }
}
