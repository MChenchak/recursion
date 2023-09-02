import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileRecTest {

    private static final String path = "/Users/mikhail/Desktop/test_dir";

    @Test
    @DisplayName("exists an directory")
    void existsAndDirectory() {
        List<File> files = FileRec.printDirectoryTree(path);

        assertEquals(5, files.size()); //5, включая файлы DS_Store

    }

    @Test
    @DisplayName("path is null")
    void pathIsNull() {
        assertThrows(IllegalArgumentException.class, () -> FileRec.printDirectoryTree(null));

    }

    @Test
    @DisplayName("path is blank")
    void pathIsBlank() {
        assertThrows(IllegalArgumentException.class, () -> FileRec.printDirectoryTree(" "));

    }
}