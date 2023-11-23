package baseball;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class Player {

    public List<Integer> playerNumber(){
        System.out.println("숫자를 입력해주세요 : ");
        List<Integer> playerNumber = new ArrayList<>();
        String input = Console.readLine();


        for(String number : input.split("")){
            playerNumber.add(Integer.valueOf(number));
        }
        numbervalid(input);
        return playerNumber;
    }

    public void numbervalid(String input){
        if(input.length() != 3){
            throw new IllegalArgumentException("세 자리수를 입력하세요.");
        }
    }


}
