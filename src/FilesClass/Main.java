package FilesClass;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        // exists
        Path path1 = Paths.get("src\\FilesClass\\myFile.txt");
        Path path2 = Paths.get("src\\FilesClass\\dir2");
        System.out.println(Files.exists(path1));
        // createDirectories

//        try {
//            System.out.println(Files.createDirectories(path1));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //copy
//        try {
//            Files.copy(path1, path2);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //move

//        Files.move(path1, path2);

        //deleteIfExists
//        Files.deleteIfExists(path2);


        //readAllLines - stosowac do malych plikow
        System.out.println(Files.readAllLines(path1));


    }
}
