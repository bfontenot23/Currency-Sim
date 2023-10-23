public class Currency {

    private final String name;
    private final double exchangeRate;
    private double amount;

    public Currency(String name, double exchangeRate, double amount)
    {
        this.name = name;
        this.exchangeRate = exchangeRate;
        this.amount = amount;
    }

    public Currency()
    {
        this.name = "";
        this.exchangeRate = 0.0;
        this.amount = 0;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return exchangeRate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getCreditValue()
    {
        return (this.getRate()*this.getAmount());
    }

    public double checkExchange(Currency foreign)
    {
        return ((this.getCreditValue()/foreign.getRate()));
    }
}
