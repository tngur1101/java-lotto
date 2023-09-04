package lotto;

import camp.nextstep.edu.missionutils.Console;
import view.ViewLotto;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private Lotto playerLottoNumbers;
    private int bonus;

    public Lotto getPlayerLotto(){
        return playerLottoNumbers;
    }

    public int getBonus(){
        return bonus;
    }

    public Computer(){
        inputLotto();
        inputBonus();
    }

    public void inputLotto(){
        ViewLotto.askLottoNumber();
        String playerLottoNumber = Console.readLine();
        String[] playerLotto = playerLottoNumber.split(",");
        List<Integer> playerLottoNum = new ArrayList<>();
        for(int i=0;i<playerLotto.length;i++){
            Player.validateInputIsNumber(playerLotto[i]);
            playerLottoNum.add(Integer.parseInt(playerLotto[i]));
        }

        playerLottoNumbers = new Lotto(playerLottoNum);
    }

    public void inputBonus(){
        ViewLotto.askBonusNumber();
        String playerBonusNumber = Console.readLine();
        Player.validateInputIsNumber(playerBonusNumber);
        bonus = Integer.parseInt(playerBonusNumber);
    }
}
