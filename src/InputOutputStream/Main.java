package InputOutputStream;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("src/InputOutputStream/source.txt");
        File outputFile = new File("src/InputOutputStream/someFileOutput.txt");
//        justCopyNoBuffer(inputFile, outputFile);
        justCopyWithBuffer(inputFile, outputFile);

    }

    private static void justCopyNoBuffer(File inputFile, File outputFile) throws IOException {
        try (
                InputStream input = new FileInputStream(inputFile);
                OutputStream output = new FileOutputStream(outputFile);
        ) {
            int value = input.read();
            System.out.printf("Start reading file: [%s]%n", inputFile);
            System.out.printf("Reading value: [%s], char[%s]%n", value, (char) value);


            while (value != -1) {
                output.write(value);
                value = input.read();
            }
        }
    }

    private static void justCopyWithBuffer(File inputFile, File outputFile) throws IOException {
        try (
                InputStream input = new BufferedInputStream(new FileInputStream(inputFile));
                OutputStream output = new BufferedOutputStream(new FileOutputStream(outputFile));
        ) {
            byte[] bytes = new byte[1024];
            int length = input.read(bytes);
            System.out.printf("Start reading file: [%s]%n", inputFile);
            System.out.printf("Reading value: [%s], chars[%s], length: [%s]%n",
                    byteArrToStr(bytes), toCharString(bytes), length);


            while (length > 0) {
                output.write(bytes, 0, length);
                output.flush();
                length = input.read(bytes);
            }
        }
    }

    private static String toCharString(byte[] bytes) {
        char[] charArray = new char[bytes.length];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) bytes[i];
        }
        return replaceNewLines(Arrays.toString(charArray));
    }

    private static String byteArrToStr(byte[] bytes) {
        return replaceNewLines(Arrays.toString(bytes));
    }

    private static String replaceNewLines(String toString) {
        return toString.replace("\n", "\\n");
    }
}

