package view;

import java.util.List;

public class ViewLotto {

    static final String GET_PURCHASE_PRICE = "구입금액을 입력해 주세요.";
    static final String ALERT_PURCHASED_LOTTO = "%d개를 구매했습니다.";
    static final String GET_LOTTO_NUMBER = "당첨 번호를 입력해 주세요.";
    static final String GET_BONUS_NUMBER = "보너스 번호를 입력해 주세요.";
    static final String WIN_DATA = "당첨 통계";
    static final String LINE = "---";
    static final String MATCH_NUMBER_COUNT = "%d개 일치";
    static final String MATCH_LOTTO_COUNT = "%d개";
    static final String TOTAL_EARNING_RATE = "총 수익률은 %d입니다.";
    static final String PURCHASE_PRICE_IS_NOT_NUMBER = "구매 금액이 숫자가 아닙니다.";
    static final String PURCHASE_PRICE_CANNOT_DIVDE_WITH_THOUSAND = "구매 금액이 1000원단위가 아닙니다.";


    public static void askPurchasePrice(){
        System.out.println(GET_PURCHASE_PRICE);
    }

    public static void askLottoNumber(){
        System.out.println(GET_LOTTO_NUMBER);
    }

    public static void printLottoNumber(List<Integer> numbers){
        System.out.println(numbers);
    }

    public static void askBonusNumber(){
        System.out.println(GET_BONUS_NUMBER);
    }

    public static void printData(){
        System.out.println(WIN_DATA);
        System.out.println(LINE);
    }

    public static void printEarningRate(){
        System.out.println(TOTAL_EARNING_RATE);
    }

}
