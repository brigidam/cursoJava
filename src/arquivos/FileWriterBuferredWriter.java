package arquivos;

import java.io.*;

public class FileWriterBuferredWriter {

    public static void main(String[] args) {

        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};

        String path = "c:\\temp\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();                         //quebra de linha
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
