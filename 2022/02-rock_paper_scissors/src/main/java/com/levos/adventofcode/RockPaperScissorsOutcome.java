package com.levos.adventofcode;

import java.util.Map;

public enum RockPaperScissorsOutcome {
  LOSS(0),
  DRAW(3),
  WIN(6);

  public final int score;

  RockPaperScissorsOutcome(int score) {
    this.score = score;
  }
}
