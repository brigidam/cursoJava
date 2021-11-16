package estruturacondicionalifelse;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n < 0){
            System.out.println("NEGATIVO");
        }else {
            System.out.print("NÃO NEGATIVO");
        }

        sc.close();
    }
}
