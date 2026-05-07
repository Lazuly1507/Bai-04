package com.practice.maven;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilePathTest {
  @Test
  void testWorksEverywhere() {
    // Dùng Paths.get để tự thích nghi với mọi OS
    java.nio.file.Path path = java.nio.file.Paths.get("pom.xml");
    assertTrue(java.nio.file.Files.exists(path));
  }
}