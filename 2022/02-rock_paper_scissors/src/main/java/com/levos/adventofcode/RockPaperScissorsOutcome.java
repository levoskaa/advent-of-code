package com.levos.adventofcode;

import java.util.Map;

public enum RockPaperScissorsOutcome {
  LOSS(0),
  DRAW(3),
  WIN(6);

  private static final Map<RockPaperScissorsShape, Map<RockPaperScissorsShape, RockPaperScissorsOutcome>> outcomeMatrix = Map.of(
      RockPaperScissorsShape.ROCK,
      Map.of(RockPaperScissorsShape.ROCK, RockPaperScissorsOutcome.DRAW,
          RockPaperScissorsShape.PAPER, RockPaperScissorsOutcome.LOSS,
          RockPaperScissorsShape.SCISSORS, RockPaperScissorsOutcome.WIN),
      RockPaperScissorsShape.PAPER,
      Map.of(RockPaperScissorsShape.ROCK, RockPaperScissorsOutcome.WIN,
          RockPaperScissorsShape.PAPER, RockPaperScissorsOutcome.DRAW,
          RockPaperScissorsShape.SCISSORS, RockPaperScissorsOutcome.LOSS),
      RockPaperScissorsShape.SCISSORS,
      Map.of(RockPaperScissorsShape.ROCK, RockPaperScissorsOutcome.LOSS,
          RockPaperScissorsShape.PAPER, RockPaperScissorsOutcome.WIN,
          RockPaperScissorsShape.SCISSORS, RockPaperScissorsOutcome.DRAW)
  );

  public final int score;

  RockPaperScissorsOutcome(int score) {
    this.score = score;
  }

  public static RockPaperScissorsOutcome of(RockPaperScissorsShape shape1,
      RockPaperScissorsShape shape2) {
    return outcomeMatrix.get(shape1).get(shape2);
  }
}
