package InputOutputStream;

import java.io.*;
import java.util.Arrays;

public class Podsumowanie2 {
    public static void main(String[] args) {
        try (
                InputStream source = new BufferedInputStream(new FileInputStream("./src/InputOutputStream/source.txt"));
                OutputStream destination = new BufferedOutputStream(new FileOutputStream("./src/InputOutputStream/destination.txt"));

        ) {
            byte[] buffer = new byte[1024];
            int length = source.read(buffer);
            System.out.println("Read: " + Arrays.toString(buffer) + "length: " + length);

            while (length > 0){
                destination.write(buffer);
                destination.flush();
                System.out.println("Read: " + Arrays.toString(buffer) + "length: " + length);
                length = source.read(buffer, 0, length);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
