package Level1.ex2;


import Level1.ex1.DirectoryPrinter;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Please provide a directory path. ");
            return;
        }

        DirectoryLister.listFilesAlphabetically(args[0]);


    }
}
