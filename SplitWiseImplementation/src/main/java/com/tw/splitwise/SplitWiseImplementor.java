package com.tw.splitwise;


import com.tw.splitwise.service.SettlementService;
import com.tw.splitwise.service.impl.DefaultConsolidator;
import com.tw.splitwise.service.impl.DefaultDebtCalculator;
import com.tw.splitwise.service.impl.DefaultNettingService;
import com.tw.splitwise.service.impl.FileExpenseReader;

public class SplitWiseImplementor {
    private static final String EXPENSE_FILE = "expenses.txt";

    public static void main(String[] args) {
        SettlementService service = new SettlementService(
                new FileExpenseReader(),
                new DefaultDebtCalculator(),
                new DefaultConsolidator(),
                new DefaultNettingService()
        );
        service.execute(EXPENSE_FILE);
    }
}
