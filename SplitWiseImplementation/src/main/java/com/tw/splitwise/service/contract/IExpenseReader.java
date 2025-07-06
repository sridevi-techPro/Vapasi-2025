package com.tw.splitwise.service.contract;

import com.tw.splitwise.model.Expense;

import java.util.List;

public interface IExpenseReader {
    List<Expense> read(String filename);
}
