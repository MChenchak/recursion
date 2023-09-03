import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileRec {

    public static List<File> printDirectoryTree(String path) {
        if (path == null || path.isBlank())
            throw new IllegalArgumentException("Указан некорректный path");

        File dir = new File(path);

        if (!(dir.exists() && dir.isDirectory())) {
            throw new IllegalArgumentException("File is not a directory");
        }

        File[] arr = dir.listFiles();
        return findRecersively(arr);
    }

    private static List<File> findRecersively(File[] arr) {
        List<File> files = new ArrayList<>();

        for (File file : arr) {
            if (file.isFile()) {
                files.add(file);
            } else if (file.isDirectory()) {
                files.addAll(findRecersively(file.listFiles()));
            }
        }
        return files;
    }
}