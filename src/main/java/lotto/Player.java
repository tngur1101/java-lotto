package lotto;

import camp.nextstep.edu.missionutils.Console;
import view.ValidateView;
import view.ViewLotto;

public class Player {

    int playerPurchasePrice;
    int lottoCount;
    static final int LOTTO_PRICE = 1000;



    public Player() {
        ViewLotto.askPurchasePrice();
        String playerInput = Console.readLine();
        validatePurchasePriceInput(playerInput);
        playerPurchasePrice = Integer.parseInt(playerInput);

    }

    public void validatePurchasePriceInput(String playerInput){
        try{
            Integer.parseInt(playerInput);
        }catch (NumberFormatException e){
            ValidateView.purchasePriceIsNotNumber();
            throw new IllegalArgumentException();
        }
    }

    public void validateCanDivideWithThousand(){
        if(playerPurchasePrice % 1000 != 0){
            ValidateView.purchasePriceCannotDivdeWithThousand();
            throw new IllegalArgumentException();
        }
        if(playerPurchasePrice < 1000){
            ValidateView.purchasePriceUnderThousand();
            throw new IllegalArgumentException();
        }
    }

}
