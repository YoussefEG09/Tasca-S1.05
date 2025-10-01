package Level1.ex1;


import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Please provide a directory path. ");
            return;
        }

        String path = args[0];
        File[] orderedFiles = DirectoryLister.listFilesAlphabetically(path);
        DirectoryPrinter.printFilesName(orderedFiles);
    }
}
