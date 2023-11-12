package com.levos.adventofcode;

public enum RockPaperScissorsShape {
  ROCK(1),
  PAPER(2),
  SCISSORS(3);

  public final int score;

  RockPaperScissorsShape(int score) {
    this.score = score;
  }
}
