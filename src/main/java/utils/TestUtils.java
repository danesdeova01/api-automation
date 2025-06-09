package utils;

import java.nio.file.Files;
import java.nio.file.Paths;
public class TestUtils {
    public static String readFileAsString(String filePath) throws Exception {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
}
