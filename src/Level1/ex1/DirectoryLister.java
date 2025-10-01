package Level1.ex1;

import java.io.File;
import java.util.Arrays;

public class DirectoryLister {

    public static File[] listFilesAlphabetically(String path) {

        if (path == null || path.isEmpty()) {
            System.out.println("Please enter a directory path. ");
            return new File[0];
        }

        File directory = new File(path);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory : " + path);
            return new File[0];
        }

        File[] files = directory.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("The directory is empty.");
            return new File[0];
        }

        Arrays.sort(files, (f1, f2) -> f1.getName().compareToIgnoreCase(f2.getName()));
        return files;
    }
}



