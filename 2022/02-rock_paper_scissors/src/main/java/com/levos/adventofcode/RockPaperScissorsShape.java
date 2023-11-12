package com.levos.adventofcode;

import java.util.Map;

public enum RockPaperScissorsShape {
  ROCK(1),
  PAPER(2),
  SCISSORS(3);

  private static final Map<RockPaperScissorsShape, Map<RockPaperScissorsOutcome, RockPaperScissorsShape>> playerMatrix = Map.of(
      RockPaperScissorsShape.ROCK,
      Map.of(RockPaperScissorsOutcome.LOSS, RockPaperScissorsShape.SCISSORS,
          RockPaperScissorsOutcome.DRAW, RockPaperScissorsShape.ROCK,
          RockPaperScissorsOutcome.WIN, RockPaperScissorsShape.PAPER),
      RockPaperScissorsShape.PAPER,
      Map.of(RockPaperScissorsOutcome.LOSS, RockPaperScissorsShape.ROCK,
          RockPaperScissorsOutcome.DRAW, RockPaperScissorsShape.PAPER,
          RockPaperScissorsOutcome.WIN, RockPaperScissorsShape.SCISSORS),
      RockPaperScissorsShape.SCISSORS,
      Map.of(RockPaperScissorsOutcome.LOSS, RockPaperScissorsShape.PAPER,
          RockPaperScissorsOutcome.DRAW, RockPaperScissorsShape.SCISSORS,
          RockPaperScissorsOutcome.WIN, RockPaperScissorsShape.ROCK)
  );

  public final int score;

  RockPaperScissorsShape(int score) {
    this.score = score;
  }

  public static RockPaperScissorsShape playerShapeForOutcome(RockPaperScissorsShape opponentShape,
      RockPaperScissorsOutcome requiredOutcome) {
    return playerMatrix.get(opponentShape).get(requiredOutcome);
  }
}
