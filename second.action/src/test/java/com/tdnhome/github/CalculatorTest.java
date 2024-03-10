package com.tdnhome.github;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

  @Test
  public void addTest() {
    Calculator calculator = new Calculator();
    Assert.assertEquals(calculator.add(0, 0), 0.0);
  }
}
