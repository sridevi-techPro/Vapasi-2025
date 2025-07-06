package com.tw.splitwise.test.service.impl;


import com.tw.splitwise.model.Debtor;
import com.tw.splitwise.model.Expense;
import com.tw.splitwise.service.impl.DefaultDebtCalculator;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DefaultDebtCalculatorTest {

    private final DefaultDebtCalculator calculator = new DefaultDebtCalculator();

    @Test
    void testCalculateDebtors() {
        Expense expense = new Expense("A", 300.0, "Dinner", List.of("A", "B", "C"));

        List<Debtor> result = calculator.calculate(List.of(expense));

        assertEquals(2, result.size());
        assertTrue(result.contains(new Debtor("B", 100.0, "A")));
       assertTrue(result.contains(new Debtor("C", 100.0, "A")));
    }
}
