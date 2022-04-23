package guru.springframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Currency {
    protected double value;

    List<Currency> currencies = new ArrayList<>();

    public Currency(double value) {
        setValue(value);
    }

    public void times(int multiplier) {
        Currency[] currencies = new Currency[multiplier];
        Arrays.fill(currencies, new Currency(this.getValue()));
        this.currencies = new ArrayList<>(Arrays.asList(currencies));
    }

    public double getTotal() {
        return this.currencies.size() * this.getValue();
    }

    protected void setValue(double value) {
        this.value = value;
    }

    protected double getValue() {
        return this.value;
    }

    @Override
    public boolean equals(Object object) {
        return this.getValue() == ((Currency) object).getValue();
    }
}
