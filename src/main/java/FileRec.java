import java.io.File;

public class FileRec {

    public static void printDirectoryTree(String path) {

        File dir = new File(path);

        if (dir.exists() && dir.isDirectory()) {
            File[] arr = dir.listFiles();
            recursivelyPrint(arr, 0, 0);
        }
    }

    private static void recursivelyPrint(File[] arr, int index, int level) {
        if (index == arr.length)
            return;

        // проставление отступов для древовидного отображения в выводе
        for (int i = 0; i < level; i++)
            System.out.print("\t");

        if (arr[index].isFile())
            System.out.println(arr[index].getName());

        else if (arr[index].isDirectory()) {
            System.out.println("[" + arr[index].getName()
                    + "]");

            recursivelyPrint(arr[index].listFiles(), 0,
                    level + 1);
        }

        recursivelyPrint(arr, ++index, level);

    }
}
