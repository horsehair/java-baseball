package baseball.view;

public class OutputView {
    public static void informStartGame() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static void announceEndOfThisGame() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public static void printResultTurnOfOut() {
        System.out.println("3스트라이크");
    }

    public static void printResultTurnOfNothing() {
        System.out.println("낫싱");
    }
}
