package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Computer {

    List<Integer> computer = new ArrayList<>();

    public List<Integer> setRandomNum() {

    //    System.out.println("정답 ");
        Set<Integer> numberSet = new HashSet<>();
        while (numberSet.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!numberSet.contains(randomNumber)) {
                numberSet.add(randomNumber);
            }
        }
        return new ArrayList<>(numberSet);
    }


}
