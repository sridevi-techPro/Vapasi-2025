package com.tw.splitwise.test.service.impl;


import com.tw.splitwise.model.Debtor;
import com.tw.splitwise.service.impl.DefaultConsolidator;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DefaultConsolidatorTest {

    private final DefaultConsolidator consolidator = new DefaultConsolidator();

    @Test
    void testConsolidate() {
        List<Debtor> debtors = List.of(
                new Debtor("B", 100.0, "A"),
                new Debtor("B", 50.0, "A"),
                new Debtor("C", 75.0, "A")
        );

        Map<String, Map<String, Double>> result = consolidator.consolidate(debtors);

        assertEquals(2, result.size());
        assertEquals(150.0, result.get("B").get("A"));
        assertEquals(75.0, result.get("C").get("A"));
    }
}
