package baseball;

import java.util.List;

public class CompareNum {

    public int hit(List<Integer> player, List<Integer> computer){
        int result = 0;

        for(int i = 0; i < computer.size(); i++){
            if(computer.contains(player.get(i))) result++;
        }
        return result;
    }
    public int countStrike(List<Integer> player, List<Integer> computer){
        int strike = 0;

        for(int i = 0; i < computer.size(); i++){
            if(player.get(i) == computer.get(i)){
                strike++;
            }
        }
        return strike;
    }

    public String classificate(List<Integer> player, List<Integer> computer){
        int total = hit(player, computer);
        int strike = countStrike(player, computer);
        int ball = total - strike;

        if(total == 0) return "낫싱";
        else if(strike == 0) return ball + "볼";
        else if(ball == 0) return strike + "스트라이크";

        else return ball + "볼 " + strike + "스트라이크";
    }





}
