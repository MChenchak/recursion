import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileRecTest {

    private static final String path = "/Users/mikhail/Desktop/ВШБИ";

    @Test
    @DisplayName("exists an directory")
    void existsAndDirectory() {
        FileRec.printDirectoryTree(path);

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