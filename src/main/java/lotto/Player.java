package lotto;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import view.ValidateView;
import view.ViewLotto;

import java.util.ArrayList;
import java.util.List;

public class Player {

    int playerPurchasePrice;
    int lottoCount;
    static final int LOTTO_PRICE = 1000;
    List<Lotto> lottoList = new ArrayList<>();
    Lotto playerLottoNumbers;
    int bonus;

    public Player() {
        purchaseLotto();
        makeLotto();
        inputLotto();
        inputBonus();
    }

    public Lotto getPlayerLotto(){
        return playerLottoNumbers;
    }

    public int getBonus(){
        return bonus;
    }

    public void purchaseLotto(){
        ViewLotto.askPurchasePrice();
        String playerInput = Console.readLine();
        validateInputIsNumber(playerInput);
        playerPurchasePrice = Integer.parseInt(playerInput);
        validateCanDivideWithThousand();
        lottoCount = playerPurchasePrice/LOTTO_PRICE;
        ViewLotto.alertPurchasedLottoCount(lottoCount);
    }

    public void inputLotto(){
        ViewLotto.askLottoNumber();
        String playerLottoNumber = Console.readLine();
        String[] playerLotto = playerLottoNumber.split(",");
        List<Integer> playerLottoNum = new ArrayList<>();
        for(int i=0;i<playerLotto.length;i++){
            validateInputIsNumber(playerLotto[i]);
            playerLottoNum.add(Integer.parseInt(playerLotto[i]));
        }

        playerLottoNumbers = new Lotto(playerLottoNum);
    }

    public void inputBonus(){
        ViewLotto.askBonusNumber();
        String playerBonusNumber = Console.readLine();
        validateInputIsNumber(playerBonusNumber);
        bonus = Integer.parseInt(playerBonusNumber);
    }

    public void makeLotto(){
        for(int i=0;i<lottoCount;i++){
            lottoList.add(new Lotto(Lotto.createLottoNumber()));
        }
    }

    public void sortAndPrintLotto(){
        for(int i=0;i<lottoCount;i++){
             Lotto.sortLottoNumber(lottoList.get(i).getLotto());
             ViewLotto.printLottoNumber(lottoList.get(i).getLotto());
        }
    }

    public void validateInputIsNumber(String playerInput){
        try{
            Integer.parseInt(playerInput);
        }catch (NumberFormatException e){
            ValidateView.purchasePriceIsNotNumber();
            throw new IllegalArgumentException();
        }
    }

    public void validateCanDivideWithThousand(){
        if(playerPurchasePrice % LOTTO_PRICE != 0){
            ValidateView.purchasePriceCannotDivdeWithThousand();
            throw new IllegalArgumentException();
        }
        if(playerPurchasePrice < LOTTO_PRICE){
            ValidateView.purchasePriceUnderThousand();
            throw new IllegalArgumentException();
        }
    }

}
