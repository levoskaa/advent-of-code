package com.levos.adventofcode;

public class Main {

  public static void main(String[] args) {
    RockPaperScissors rps = new RockPaperScissors();
    int result = rps.solve(args[0]);
    System.out.println("Achievable score using the strategy guide: %d".formatted(result));
  }
}
