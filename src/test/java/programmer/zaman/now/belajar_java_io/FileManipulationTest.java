package programmer.zaman.now.belajar_java_io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileManipulationTest {

    @Test
    void createFile() throws IOException {
        Path path = Path.of("file.txt");
        Files.createFile(path);

        Assertions.assertTrue(Files.exists(path));
        Files.delete(path);

        Assertions.assertFalse(Files.exists(path));
    }

    @Test
    void copyFile() throws IOException {
        Path originPath = Path.of("file.txt");
        Files.createFile(originPath);

        Assertions.assertTrue(Files.exists(originPath));

        Path copyPath = Path.of("copy.file.txt");
        Files.copy(originPath, copyPath);

        Assertions.assertTrue(Files.exists(copyPath));

        Files.delete(originPath);
        Files.delete(copyPath);

        Assertions.assertFalse(Files.exists(originPath));
        Assertions.assertFalse(Files.exists(copyPath));
    }
}
