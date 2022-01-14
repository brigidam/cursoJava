package arquivos;

import java.io.File;
import java.util.Scanner;

public class InformacoesDoCaminhoDoArquivo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        //acessando o nome do arquivo
        System.out.println("getName: " + path.getName());
        //acessando o nome do caminho do arquivo
        System.out.println("getParent: " + path.getParent());
        //acessando o caminho inteiro
        System.out.println("getPath: " + path.getPath());
    }
}
