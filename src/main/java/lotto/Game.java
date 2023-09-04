package lotto;

import view.ViewLotto;

import java.util.List;

public class Game {

    public Game(){
        Player player = new Player();
        Computer computer = new Computer();
    }

    public int getRank(Lotto lotto, Lotto playerLottoNumbers, int bonus){
        int count = countMatchNumberOfLotto(lotto, playerLottoNumbers);

        if(count==WinningRank.First.MATCH_NUMBER_COUNT){
            return 1;
        }
        if(count==WinningRank.Second.MATCH_NUMBER_COUNT && lotto.isContain(bonus)){
            return 2;
        }
        if(count==WinningRank.Third.MATCH_NUMBER_COUNT){
            return 3;
        }
        if(count==WinningRank.Fourth.MATCH_NUMBER_COUNT){
            return 4;
        }
        if(count==WinningRank.Fifth.MATCH_NUMBER_COUNT){
            return 5;
        }
        return 0;
    }


    private int countMatchNumberOfLotto(Lotto lotto, Lotto playerLottoNumbers){
        int count = 0;
        List<Integer> matchLotto = playerLottoNumbers.getLotto();
        for(int i=0;i<6;i++){
            if(lotto.isContain(matchLotto.get(i))){
                count++;
            }
        }
        return count;
    }
}
