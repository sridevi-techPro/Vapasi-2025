package com.tw.splitwise.service.impl;


import com.tw.splitwise.model.Debtor;
import com.tw.splitwise.model.Expense;
import com.tw.splitwise.service.contract.IDebtCalculator;

import java.util.ArrayList;
import java.util.List;

public class DefaultDebtCalculator implements IDebtCalculator {

    @Override
    public List<Debtor> calculate(List<Expense> expenses) {
        List<Debtor> debtors = new ArrayList<>();

        for (Expense expense : expenses) {
            double share =expense.getSplitAmount();
            for (String participant : expense.getParticipants()) {
                if (!participant.equals(expense.getPayer())) {
                    debtors.add(new Debtor(participant, share, expense.getPayer()));
                }
            }
        }
        return debtors;
    }
}
