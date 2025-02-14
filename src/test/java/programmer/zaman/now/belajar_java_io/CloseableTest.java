package programmer.zaman.now.belajar_java_io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class CloseableTest {

    @Test
    void closeIO() {
        Path path = Path.of("pom.xml");
        InputStream inputStream = null;

        try {
            inputStream = Files.newInputStream(path);
        } catch (IOException e) {
            Assertions.fail(e);
        } finally {
            if( inputStream != null ) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    Assertions.fail(e);
                }
            }
        }
    }

    @Test
    void closeIOWithTryResource() {
        Path path = Path.of("pom.xml");
        try(InputStream inputStream = Files.newInputStream(path)) {

        } catch (IOException exception) {
            Assertions.fail(exception);
        }
    }
}
