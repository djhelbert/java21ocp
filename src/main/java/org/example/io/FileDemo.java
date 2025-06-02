package org.example.io;

import static org.example.Util.*;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("File separator: " + File.separator);
        System.out.println("Path separator: " + File.pathSeparator);

        File file = new File("temp");
        boolean sucess = file.mkdir();

        file = new File("temp\\sub");
        sucess = file.mkdirs();

        file = new File(".\\temp\\result.txt");
        file.createNewFile();

        print(file.exists());
        print(file.getAbsolutePath());
        print(file.getCanonicalPath()); // This typically involves removing redundant names such as "." and ".." from the pathname, resolving symbolic links (on UNIX platforms), and converting drive letters to a standard case (on Microsoft Windows platforms).
        print(file.canExecute());
        print(file.isFile());
        print(file.isHidden());
    }
}
