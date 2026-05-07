package com.practice.maven;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.File;

public class FilePathTest {
    @Test
    void testWindowsPath() {
        // Cố tình dùng dấu gạch chéo của Windows
        String path = "target\\test-classes\\data.txt";
        File file = new File(path);
        
        // Test này sẽ ĐÚNG trên Windows nhưng SAI trên Ubuntu/macOS
        // vì các hệ điều hành Unix-like không hiểu dấu "\" là phân cách thư mục
        assertTrue(path.contains("\\"), "Path should use Windows separator");
    }
}