package programmer.zaman.now.belajar_java_io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class InputStreamTest {

    @Test
    void read() {
        Path path = Path.of("pom.xml");
        try (InputStream inputStream = Files.newInputStream(path)) {
            StringBuilder builder = new StringBuilder();
            int data;
            int counter = 0;

            while((data = inputStream.read()) != -1) {
                builder.append((char) data);
                counter++;
            }

            System.out.println(builder.toString());
            System.out.println(counter);
        } catch (IOException e) {
            Assertions.fail(e);
        }
    }

    @Test
    void readByte() {
        Path path = Path.of("pom.xml");
        try (InputStream inputStream = Files.newInputStream(path)) {
            StringBuilder builder = new StringBuilder();
            byte[] buffer = new byte[1024];
            int length;
            int counter = 0;

            while((length = inputStream.read(buffer)) != -1) {
                builder.append(new String(buffer, 0, length));
                counter++;
            }

            System.out.println(builder.toString());
            System.out.println(counter);
        } catch (IOException e) {
            Assertions.fail(e);
        }
    }
}
