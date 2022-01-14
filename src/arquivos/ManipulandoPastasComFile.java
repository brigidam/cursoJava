package arquivos;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastasComFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);       //listando todas as pastas a partir do caminho informado
        System.out.println("FOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);              //listando todas os arquivos a partir do caminho informado
        System.out.println("FILES: ");
        for (File file : files) {
            System.out.println(file);
        }

        boolean sucess = new File(strPath + "\\subdir").mkdir();   //criando uma sub pasta
        System.out.println("Directory created sucessfully: " + sucess);

        sc.close();
    }
}
