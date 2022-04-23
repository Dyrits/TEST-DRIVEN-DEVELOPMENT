package guru.springframework;

public class Dollar {

    private double amount;

    public Dollar(double amount) {
        setAmount(amount);
    }

    public void times(double multiplier) { setAmount(this.amount * multiplier); }

    private void setAmount(double amount) { this.amount = amount; }

    public double getAmount() {
        return this.amount;
    }
}
