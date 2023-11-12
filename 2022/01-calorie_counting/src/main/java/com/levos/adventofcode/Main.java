package com.levos.adventofcode;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    CalorieCounter calorieCounter = new CalorieCounter();
    int result = calorieCounter.solve(args[0]);
    System.out.println("Sum of top 3 calorie amounts: %d".formatted(result));
  }
}