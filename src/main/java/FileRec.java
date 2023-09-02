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
        return findRecersively(arr, 0, new ArrayList<>());
    }

    private static List<File> findRecersively(File[] arr, int index, List<File> files) {
        if (index == arr.length)
            return files;

        if (arr[index].isFile())
            files.add(arr[index]);
        else if (arr[index].isDirectory())
            findRecersively(arr[index].listFiles(), 0, files);

        return findRecersively(arr, ++index, files);
    }
}
