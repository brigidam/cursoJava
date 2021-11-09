package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double areaTriangulo = (a * c) /2;
        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
        double areaCirculo = pi * c * c;
        System.out.printf("CIRCULO = %.3f%n", areaCirculo);
        double areaTrapezio = (a + b) / 2 * c;
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        double areaQuadrado = b * b;
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        double areaRetangulo = a * b;
        System.out.printf("RETÂNGULO: %.3f%n", areaRetangulo);


        sc.close();
    }
}
