public class Money {
    private double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public Money(Money other) {
        this.amount = other.amount;
    }

    public double getAmount() {
        return amount;
    }

    public void add(Money other) {
        this.amount += other.amount;
    }

    public void subtract(Money other) {
        this.amount -= other.amount;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Money)) return false;
        Money other = (Money) obj;
        return this.amount == other.amount;
    }

    public int compareTo(Money other) {
        return Double.compare(this.amount, other.amount);
    }

    public String toString() {
        return String.format("$%.2f", amount);
    }
}
