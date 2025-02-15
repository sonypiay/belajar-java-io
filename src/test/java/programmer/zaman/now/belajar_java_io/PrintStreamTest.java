package programmer.zaman.now.belajar_java_io;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class PrintStreamTest {

    @Test
    void printStream() {
        PrintStream printStream = System.out;

        printStream.println("Hello World");
        printStream.println("Hello World Lagi");
    }

    @Test
    void printStreamFile() {
        Path path = Path.of("print.txt");

        try (OutputStream outputStream = Files.newOutputStream(path)) {
            PrintStream printStream = new PrintStream(outputStream);

            printStream.println("Hello World");
            printStream.println("Hello World");
        } catch(IOException exception) {
            Assertions.fail(exception);
        }
    }
}
