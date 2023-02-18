package file_class;

import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File file = new File("sss/ddd/bbb/aaa");

        System.out.println(file.exists());



        file.mkdirs();

        System.out.println(Arrays.toString(file.listFiles()));
    }
}
