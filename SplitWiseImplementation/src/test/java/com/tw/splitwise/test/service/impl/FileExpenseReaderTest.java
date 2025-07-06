package com.tw.splitwise.test.service.impl;


import com.tw.splitwise.model.Expense;
import com.tw.splitwise.service.contract.IExpenseReader;
import com.tw.splitwise.service.impl.FileExpenseReader;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class FileExpenseReaderTest {

    @Test
    void testReadExpensesFromFile() {
        // Arrange
        IExpenseReader reader = new FileExpenseReader();
        String testFileName = "test-expenses.txt";

        // Act
        List<Expense> expenses = reader.read(testFileName);

        // Assert
        assertNotNull(expenses);
        assertEquals(2, expenses.size());

        Expense first = expenses.getFirst();
        assertEquals("A", first.getPayer());
        assertEquals(300.0, first.getAmount());
        assertEquals("Trip", first.getService());
        assertEquals(List.of("A", "B", "C"), first.getParticipants());

        Expense second = expenses.get(1);
        assertEquals("B", second.getPayer());
        assertEquals(150.0, second.getAmount());
        assertEquals("Dinner", second.getService());
        assertEquals(List.of("A", "B"), second.getParticipants());
    }
}
