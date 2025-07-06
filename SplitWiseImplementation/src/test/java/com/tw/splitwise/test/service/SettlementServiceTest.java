package com.tw.splitwise.test.service;


import com.tw.splitwise.model.Debtor;
import com.tw.splitwise.model.Expense;
import com.tw.splitwise.service.contract.IConsolidator;
import com.tw.splitwise.service.contract.IDebtCalculator;
import com.tw.splitwise.service.contract.INettingService;
import com.tw.splitwise.service.impl.DefaultConsolidator;
import com.tw.splitwise.service.impl.DefaultDebtCalculator;
import com.tw.splitwise.service.impl.DefaultNettingService;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SettlementServiceTest {

    @Test
    void testEndToEndNetting() {
        List<Expense> expenses = List.of(
                new Expense("A", 300.0, "Trip", List.of("A", "B", "C")),
                new Expense("B", 100.0, "Snacks", List.of("A", "B"))
        );

        IDebtCalculator calculator = new DefaultDebtCalculator();
        IConsolidator consolidator = new DefaultConsolidator();
        INettingService nettingService = new DefaultNettingService();

        List<Debtor> debtors = calculator.calculate(expenses);
        Map<String, Map<String, Double>> consolidated = consolidator.consolidate(debtors);
        Map<String, Map<String, Double>> net = nettingService.net(consolidated);

        assertEquals(3, debtors.size());
        assertEquals(2, net.size());
        assertEquals(50.0, net.get("B").get("A"));
        assertEquals(100.0, net.get("C").get("A"));
    }
}
