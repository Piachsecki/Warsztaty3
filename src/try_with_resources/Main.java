package try_with_resources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

    }


    public void tryWithResourcesExample(Path path1, Path path2) throws IOException {
        try (
                Table table = new Table();
                BufferedReader in = Files.newBufferedReader(path1);
                BufferedWriter out = Files.newBufferedWriter(path2)
        ) {
            out.write(in.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    class Table implements AutoCloseable {

        @Override
        public void close() throws Exception {

        }
    }
}
