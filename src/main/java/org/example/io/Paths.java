package org.example.io;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.example.Util.print;

public class Paths {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("/", "Users", "joe", "Downloads", "demo.pdf");
        Path folder = path.getParent();
        Path currentDir = Path.of(".");
        Path resolved = folder.resolve("./temp/test.txt");
        Path subPath = Path.of("temp", "sub");
        print(subPath.toString());

        path.normalize(); // Returns a path that is this path with redundant name elements eliminated.
        currentDir.toRealPath();

        path = Path.of("temp");
        print(path.toString());
        Files.list(currentDir);
        Files.walk(path).map(p -> p.toString()).forEach(p -> System.out.println(p));
        print(Files.isDirectory(path));
        print(Files.isHidden(path));
        print(Files.isExecutable(path));
        //Files.createFile(path);
        //Files.createDirectory(path);
        //Files.deleteIfExists(path);
        //Files.delete(path);

        FileSystem fs = FileSystems.getDefault();
        fs.getRootDirectories();
        fs.getSeparator();
    }
}
