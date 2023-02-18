package InputOutputStream;

import java.io.*;

public class Podsumowanie {
    public static void main(String[] args) {

        try (
                InputStream source = new FileInputStream("./src/InputOutputStream/source.txt");
                OutputStream destination = new FileOutputStream("./src/InputOutputStream/destination.txt");

                ) {

            int value = source.read();
            System.out.println("Value read in bytes: " + value + "char value: " + (char) value);

            while (value!= -1){
                System.out.println("Value written in bytes: " + value + "char value: " + (char) value);
                destination.write(value);
                value = source.read();
            }



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
