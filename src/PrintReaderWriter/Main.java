package PrintReaderWriter;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("myFile.txt");

        try (
                PrintWriter printWriter = new PrintWriter(
                        new BufferedWriter(
                                new FileWriter(file)))
        ) {

            printWriter.println("halooo");
            printWriter.write("elloooo");
        }
    }
}
