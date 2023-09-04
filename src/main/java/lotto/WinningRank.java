package lotto;

public enum WinningRank {
    First(2000000000, 6),
    Second(30000000,5),
    Third(1500000, 5),
    Fourth(50000, 4),
    Fifth(5000,3);

    final int PRIZE_MONEY;
    final int MATCH_NUMBER_COUNT;

    WinningRank(int PRIZE_MONEY, int MATCH_NUMBER_COUNT){
        this.PRIZE_MONEY = PRIZE_MONEY;
        this.MATCH_NUMBER_COUNT = MATCH_NUMBER_COUNT;
    }

    public double calculatePrizeMoney(int matchNumberCount){
        return PRIZE_MONEY * matchNumberCount;
    }



}
