package com.tw.splitwise.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class Expense {
    String payer;
    double amount;
    String service;
    List<String> participants;

    public String getPayer() {
        return payer;
    }

    public double getAmount() {
        return amount;
    }

    public String getService() {
        return service;
    }

    public List<String> getParticipants() {
        return participants;
    }

    public Expense(String payer, double amount, String service, List<String> participants) {
        this.payer = payer;
        this.amount = amount;
        this.service = service;
        this.participants = participants;
    }

    public double getSplitAmount() {
        return amount / participants.size();
    }

    @Override
    public String toString() {

        return payer + " spent " + amount + " for " + service + " for " + participants;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expense expense = (Expense) o;

        List<String> sortedThis = new ArrayList<>(this.participants);
        List<String> sortedOther = new ArrayList<>(expense.participants);
        Collections.sort(sortedThis);
        Collections.sort(sortedOther);

        return Double.compare(expense.amount, amount) == 0 &&
                Objects.equals(payer, expense.payer) &&
                Objects.equals(service, expense.service) &&
                sortedThis.equals(sortedOther);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payer, amount, service, participants);
    }

}