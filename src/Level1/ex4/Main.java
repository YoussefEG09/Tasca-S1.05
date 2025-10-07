package Level1.ex4;


import Level1.ex3.DirectoryLister;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Please provide a directory path. ");
            return;
        }

        String outputPath = "C:\\Users\\formacio\\Desktop\\Youssef\\Task-S1.05\\ListerEx3.txt";
        DirectoryLister.listFilesAlphabetically(args[0], outputPath);

        System.out.println("✅ Directory listing created successfully at:");
        System.out.println(outputPath);

        TxtFileReader.readAndPrintFile(outputPath);

    }
}
