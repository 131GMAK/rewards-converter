public class RewardValue {
    double cashValue;
    int milesValue;

    public RewardValue(Double cashValue) {
        this.milesValue = (int) (cashValue / 0.0035);
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = milesValue * 0.0035;
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }
}
