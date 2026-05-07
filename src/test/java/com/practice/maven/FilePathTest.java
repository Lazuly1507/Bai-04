package com.practice.maven;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilePathTest {
  @Test
  void testOnlyWorksOnWindows() {
    // Dấu \\ chỉ có tác dụng trên Windows
    // Trên máy bạn (Windows), đường dẫn này sẽ hợp lệ -> True
    String path = ".\\pom.xml";
    java.io.File file = new java.io.File(path);

    // Kiểm tra file có tồn tại không
    assertTrue(file.exists(), "File phải tồn tại trên máy Windows!");
  }
}