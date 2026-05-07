package com.practice.maven;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MathUtilsTest {
  @Test
  void testAdd() {
    MathUtils utils = new MathUtils();
    assertEquals(5, utils.add(2, 3), "2 + 3 phải bằng 5");
  }

  @Test
  void testMain() {
    MathUtils.main(new String[] {});
  }

  @Test
  void testDivide() {
    MathUtils utils = new MathUtils();
    assertEquals(2, utils.divide(6, 3), "6 / 3 phải bằng 2");
  }
}