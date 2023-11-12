package com.levos.adventofcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalorieCounterTest {

  // Class under test
  private CalorieCounter calorieCounter;

  @BeforeEach
  void setup() {
    calorieCounter = new CalorieCounter();
  }

  @Test
  @DisplayName("solve should throw on null filepath")
  void solveShouldThrowOnNullFilepath() {
    assertThrows(IllegalArgumentException.class, () -> calorieCounter.solve(null));
  }

  @Test
  @DisplayName("solve should throw on invalid filepath")
  void solveShouldThrowOnInvalidFilepath() {
    assertThrows(IllegalArgumentException.class,
        () -> calorieCounter.solve("/definitely-not-real-dir/file"));
  }
}