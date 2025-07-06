package com.tw.splitwise.model;

import java.util.Objects;

public class Debtor {

    String debtor;

    double amount;

    String payer;

    public String getDebtor() {
        return debtor;
    }

    public double getAmount() {
        return amount;
    }

    public String getPayer() {
        return payer;
    }

    public Debtor(String debtor, double amount, String payer) {
        this.debtor = debtor;
        this.amount = amount;
        this.payer = payer;
    }

    @Override
    public String toString() {
        return debtor + " owes " + payer + " " + amount;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Debtor debtor = (Debtor) o;
        return Double.compare(debtor.amount, amount) == 0 &&
                Objects.equals(this.debtor, debtor.debtor) &&
                Objects.equals(payer, debtor.payer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(debtor, amount, payer);
    }

}
