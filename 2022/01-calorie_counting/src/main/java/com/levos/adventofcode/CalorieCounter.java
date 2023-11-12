package com.levos.adventofcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CalorieCounter {

  public int solve(String filepath) {
    if (filepath == null) {
      throw new IllegalArgumentException("filepath is null.");
    }
    File file = new File(filepath);
    if (!file.exists()) {
      throw new IllegalArgumentException("'%s' doesn't exist.".formatted(filepath));
    }

    List<Integer> calories = new ArrayList<>();

    try (Scanner sc = new Scanner(file)) {
      int currentCalories = 0;

      while (sc.hasNextLine()) {
        String line = sc.nextLine();
        if (line.isEmpty()) {
          calories.add(currentCalories);
          currentCalories = 0;
        } else {
          currentCalories += Integer.parseInt(line);
        }
      }
    } catch (FileNotFoundException e) {
    }
    return calories.stream()
        .sorted(Comparator.reverseOrder())
        .limit(3)
        .mapToInt(Integer::intValue)
        .sum();
  }
}
