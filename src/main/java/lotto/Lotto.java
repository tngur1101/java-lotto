package lotto;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.*;

public class Lotto {
    private final List<Integer> numbers;
    private static final int startNumber = 1;
    private static final int endNumber = 45;
    private static final int selectNumberCount = 6;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    public List<Integer> getLotto(){
        return numbers;
    }

    public static List<Integer> createLottoNumber(){
        List<Integer> randomnumbers = new ArrayList<>(Randoms.pickUniqueNumbersInRange(startNumber, endNumber, selectNumberCount));
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

    public static void sortLottoNumber(List<Integer> numbers){
        Collections.sort(numbers);
    }

    // TODO: 추가 기능 구현
}
