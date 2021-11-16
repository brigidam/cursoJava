package estruturacondicionalifelse;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int horaIncial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int duracao;

        if (horaIncial < horaFinal){
            duracao = horaFinal - horaIncial;
        }else{
            duracao = 24 - horaIncial + horaFinal;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");



        sc.close();
    }
}
