package programmer.zaman.now.belajar_java_io;

import org.junit.jupiter.api.Test;

import java.io.StringWriter;

public class MemoryStreamTest {

    @Test
    void memoryStream() {
        StringWriter stringWriter = new StringWriter();

        for(int i = 0; i < 10; i++) {
            stringWriter.write("Hello World\n");
        }

        String content = stringWriter.getBuffer().toString();
        System.out.println(content);
    }
}
