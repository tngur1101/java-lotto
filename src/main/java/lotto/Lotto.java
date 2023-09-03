package lotto;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lotto {
    private final List<Integer> numbers;
    private final int startNumber = 1;
    private final int endNumber = 45;
    private final int selectNumberCount = 6;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    public List<Integer> getLotto(){
        sortLottoNumber(numbers);
        return numbers;
    }

    private List<Integer> createLottoNumber(){
        List<Integer> randomnumbers = Randoms.pickUniqueNumbersInRange(startNumber, endNumber, selectNumberCount);
        return randomnumbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }

        // 만약 로또 번호가 중복되었다면 예외처리
        Set<Integer> lottoSet = new HashSet<>(numbers);
        if(lottoSet.size()!=6){
            throw new IllegalArgumentException();
        }
    }

    private List<Integer> sortLottoNumber(List<Integer> numbers){
        Collections.sort(numbers);
        return numbers;
    }

    // TODO: 추가 기능 구현
}
