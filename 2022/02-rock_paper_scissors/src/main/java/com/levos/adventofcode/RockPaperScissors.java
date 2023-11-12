package com.levos.adventofcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class RockPaperScissors {

  private static final Map<Character, RockPaperScissorsShape> convertingTable = Map.of(
      'A', RockPaperScissorsShape.ROCK,
      'B', RockPaperScissorsShape.PAPER,
      'C', RockPaperScissorsShape.SCISSORS
  );
  private static final Map<Character, RockPaperScissorsShape> decodingTable = Map.of(
      'X', RockPaperScissorsShape.ROCK,
      'Y', RockPaperScissorsShape.PAPER,
      'Z', RockPaperScissorsShape.SCISSORS
  );

  public int solve(String filepath) {
    File file = new File(filepath);
    int totalScore = 0;

    try (Scanner sc = new Scanner(file)) {
      while (sc.hasNextLine()) {
        totalScore += scoreForRound(sc.next().charAt(0), sc.next().charAt(0));
        sc.nextLine();
      }
    } catch (FileNotFoundException e) {
      throw new IllegalArgumentException("'%s' not found.".formatted(filepath));
    }

    return totalScore;
  }

  private int scoreForRound(char opponentInput, char playerInput) {
    RockPaperScissorsShape opponentShape = inputToShape(opponentInput);
    RockPaperScissorsShape playerShape = decodeShape(playerInput);
    RockPaperScissorsOutcome outcome = RockPaperScissorsOutcome.of(playerShape, opponentShape);
    return playerShape.score + outcome.score;
  }

  public RockPaperScissorsShape decodeShape(char encryptedShape) {
    return decodingTable.get(encryptedShape);
  }

  public RockPaperScissorsShape inputToShape(char inputChar) {
    return convertingTable.get(inputChar);
  }
}
