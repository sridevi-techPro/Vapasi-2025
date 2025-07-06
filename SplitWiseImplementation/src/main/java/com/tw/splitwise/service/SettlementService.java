package com.tw.splitwise.service;


import com.tw.splitwise.model.Debtor;
import com.tw.splitwise.model.Expense;
import com.tw.splitwise.service.contract.IConsolidator;
import com.tw.splitwise.service.contract.IDebtCalculator;
import com.tw.splitwise.service.contract.IExpenseReader;
import com.tw.splitwise.service.contract.INettingService;
import com.tw.splitwise.util.LoggerUtil;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class SettlementService {
    private final IExpenseReader reader;
    private final IDebtCalculator calculator;
    private final IConsolidator consolidator;
    private final INettingService nettingService;
    private static final Logger logger = LoggerUtil.getLogger(SettlementService.class);


    public SettlementService(
            IExpenseReader reader,
            IDebtCalculator calculator,
            IConsolidator consolidator,
            INettingService nettingService
    ) {
        this.reader = reader;
        this.calculator = calculator;
        this.consolidator = consolidator;
        this.nettingService = nettingService;
    }

    public void execute(String filename) {
        List<Expense> expenses = reader.read(filename);
        List<Debtor> debtors = calculator.calculate(expenses);
        LoggerUtil.info(logger,"\n--- List of Transactions---\n");
        for (Debtor d : debtors) {
            LoggerUtil.info(logger,d.toString());
        }
        Map<String, Map<String, Double>> consolidated = consolidator.consolidate(debtors);
        Map<String, Map<String, Double>> netResult = nettingService.net(consolidated);

        LoggerUtil.info(logger,"\n--- Net Payments ---\n");
        for (var payer : netResult.keySet()) {
            for (var payee : netResult.get(payer).keySet()) {
                LoggerUtil.info(logger,payer +" owes "+ payee+ " "+ netResult.get(payer).get(payee));
            }
        }
    }
}
