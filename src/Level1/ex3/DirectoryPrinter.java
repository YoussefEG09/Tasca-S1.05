package Level1.ex3;

import java.io.File;
import java.io.IOException;

public class DirectoryPrinter {

    public static void printFilesName(File[] files) throws IOException {
        if (files == null || files.length == 0) {
            System.out.println("No files to print.");
            return;
        }

        for (File file : files) {
            System.out.println(file.getName());
        }


    }

}
