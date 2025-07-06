package com.tw.splitwise.service.contract;


import com.tw.splitwise.model.Debtor;
import com.tw.splitwise.model.Expense;

import java.util.List;

public interface IDebtCalculator {
    List<Debtor> calculate(List<Expense> expenses);
}
