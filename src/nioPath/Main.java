package nioPath;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        //path does not have to exist on our computer - it can, but it is not necessary
        Path path1 = Paths.get("C:\\Users\\krpia\\IdeaProjects\\Warsztaty3\\src\\nioPath\\directory\\myFile.txt");
        Path path2 = Paths.get("C:\\Users\\krpia\\IdeaProjects\\Warsztaty3\\src\\nioPath\\directory2\\myFile2.txt");
        // C:\Users\krpia\IdeaProjects\Warsztaty3\myFile\myFolder\myFile.txt
        // myFile/myFolder/myFile.txt

//        String string = path.toString();
//        System.out.println(string);
//
//
//        int nameCount = path.getNameCount();
//        System.out.println(nameCount);
//
//
//        Path name = path.getName(1);
//        System.out.println(name);
//
//
//        Path fileName = path.getFileName();
//        System.out.println(fileName);
//
//        Path toAbsolutePath = path.toAbsolutePath();
//        System.out.println(toAbsolutePath);
//
//        boolean absolute = path.isAbsolute();
//        System.out.println(absolute);
//
//        Path parent = path.getParent();
//        System.out.println(parent);

//        Path root = path.getRoot();
//        System.out.println(root);
//
//        Path subpath = path.subpath(0, 4);
//        System.out.println(subpath);


        Path relativize1 = path1.relativize(path2);
//        Path relativize2 = path2.relativize();
        System.out.println(relativize1);

        try {
            path1.toRealPath();
            System.out.println(path1);
        } catch (IOException e) {
            e.printStackTrace();
        }


        // podczas pisania aplikacji zawsze odwoluj sie do sciezki relatywnej nie absolutnej !-
        // poniiewaz programu nie odpalisz na nowym innym komputerze, bo bedzie mial on inna sciezke


    }
}
