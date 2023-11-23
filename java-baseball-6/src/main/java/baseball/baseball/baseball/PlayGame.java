package baseball;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class PlayGame {

    public void gamePlay() {
        System.out.println("숫자 야구 게임을 시작합니다.");
        Computer computer = new Computer();
        Player player = new Player();
        CompareNum compareNum = new CompareNum();

      //  System.out.println(player.playerNumber());

        boolean again = true;

        while (again) {
            List<Integer> computerSetNum = computer.setRandomNum();
           // System.out.println("정답 : " + computerSetNum);

            String result = "";

            while (!result.equals("3스트라이크")) {
                result = compareNum.classificate(player.playerNumber(), computerSetNum);
                System.out.println(result);
                if(result.equals("3스트라이크")){
                    System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                    break;
                }
            }
            again = retryGame();
        }

    }


    public boolean retryGame() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        char answer = Console.readLine().charAt(0);
        if(answer == '1'){
            return true;
        }
        return false;

    }
}
