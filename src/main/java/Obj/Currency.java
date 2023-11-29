package Obj;

public class Currency {
    double gpb = 0.025;
    double usd = 0.032;
    double jpn = 4.72;
    private int amount;

    public Currency(int amount) {
        this.amount = amount;
    }

    public double getGpb() {
        return this.amount * gpb;
    }

    public double getUsd() {
        return this.amount * usd;
    }

    public double getJpn() {
        return this.amount * jpn;
    }

}
