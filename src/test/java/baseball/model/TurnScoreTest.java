package baseball.model;

import static org.assertj.core.api.Assertions.assertThat;

import baseball.type.ResultTurn;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TurnScoreTest {

    @DisplayName("볼 수 반환")
    @Test
    void getBalls() {
        TurnScore turnScore = new TurnScore(2, 1, ResultTurn.StrikesAndBalls);
        int result = turnScore.getBalls();
        assertThat(result).isEqualTo(2);
    }

    @DisplayName("스트라이크 수 반환")
    @Test
    void getStrikes() {
        TurnScore turnScore = new TurnScore(2, 1, ResultTurn.StrikesAndBalls);
        int result = turnScore.getStrikes();
        assertThat(result).isEqualTo(1);
    }

    @DisplayName("볼 수 저장")
    @Test
    void setBalls() {
        TurnScore turnScore = new TurnScore();
        turnScore.setBalls(2);
        int result = turnScore.getBalls();
        assertThat(result).isEqualTo(2);
    }

    @DisplayName("스트라이크 수 저장")
    @Test
    void setStrikes() {
        TurnScore turnScore = new TurnScore();
        turnScore.setStrikes(1);
        int result = turnScore.getStrikes();
        assertThat(result).isEqualTo(1);
    }

    @DisplayName("턴 결과 반환")
    @Test
    void getResultTurn() {
        TurnScore turnScore = new TurnScore(2, 1, ResultTurn.StrikesAndBalls);
        ResultTurn result = turnScore.getResultTurn();
        assertThat(result).isEqualTo(ResultTurn.StrikesAndBalls);
    }

    @DisplayName("턴 결과 저장")
    @Test
    void setResultTurn() {
        TurnScore turnScore = new TurnScore();
        turnScore.setBalls(2);
        turnScore.setStrikes(1);
        turnScore.setResultTurn();
        ResultTurn result = turnScore.getResultTurn();
        assertThat(result).isEqualTo(ResultTurn.StrikesAndBalls);
    }
}