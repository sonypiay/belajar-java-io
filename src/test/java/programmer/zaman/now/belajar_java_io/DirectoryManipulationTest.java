package programmer.zaman.now.belajar_java_io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryManipulationTest {

    @Test
    void createDirectory() throws IOException {
        Path path = Path.of("contoh");
        Files.createDirectory(path);

        Assertions.assertTrue(Files.isDirectory(path));
        Assertions.assertTrue(Files.exists(path));

        Files.delete(path);

        Assertions.assertFalse(Files.exists(path));
    }
}
