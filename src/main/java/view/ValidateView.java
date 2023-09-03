package view;

public class ValidateView {
    static final String PURCHASE_PRICE_IS_NOT_NUMBER = "구매 금액이 숫자가 아닙니다.";
    static final String PURCHASE_PRICE_CANNOT_DIVDE_WITH_THOUSAND = "구매 금액이 1000원단위가 아닙니다.";
    static final String PURCHASE_PRICE_UNDER_THOUSAND = "구매 금액이 1000원 이하입니다.";

    public static void purchasePriceIsNotNumber(){
        System.out.println(PURCHASE_PRICE_IS_NOT_NUMBER);
    }

    public static void purchasePriceCannotDivdeWithThousand(){
        System.out.println(PURCHASE_PRICE_CANNOT_DIVDE_WITH_THOUSAND);
    }

    public static void purchasePriceUnderThousand(){
        System.out.println(PURCHASE_PRICE_UNDER_THOUSAND);
    }
}
