public class RewardValue {
    private final double cashValue;
    static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(Double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    private int convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    private double convertToCash(int milesValue) {
        return (int) (milesValue * MILES_TO_CASH_CONVERSION_RATE);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(cashValue);
    }
}
