package Level1.ex2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DirectoryLister {

    public static File[] listFilesAlphabetically(String path) {
        File root = new File(path);
        if (path.isEmpty()) {
            System.out.println("Please enter a directory path. ");
            return null;
        }

        File directory = new File(path);

        if (!root.exists() || !root.isDirectory()) {
            System.out.println("Invalid directory : " + path);
            return null;
        }

        listRecursively(root, 0);
        return null;
    }

        private static void listRecursively (File directory,int level){
            File[] files = directory.listFiles();

            if (files == null || files.length == 0) {
                return;
            }

            Arrays.sort(files, (f1, f2) -> f1.getName().compareToIgnoreCase(f2.getName()));

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            for (File file : files) {
                String indent = " ".repeat(level);

                String type = file.isDirectory() ? "D" : "F";

                String lastModified = sdf.format(new Date(file.lastModified()));

                System.out.println(indent + "(" + type + ")" + file.getName() + " - " + lastModified);

                if(file.isDirectory()) {
                    listRecursively(file,level + 1);
                }

            }
        }
    }




