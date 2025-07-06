package com.tw.splitwise.test.service.impl;


import com.tw.splitwise.service.impl.DefaultNettingService;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DefaultNettingServiceTest {

    private final DefaultNettingService nettingService = new DefaultNettingService();

    @Test
    void testMutualNetting() {
        Map<String, Map<String, Double>> consolidated = new HashMap<>();
        consolidated.put("A", new HashMap<>(Map.of("B", 100.0)));
        consolidated.put("B", new HashMap<>(Map.of("A", 40.0)));

        Map<String, Map<String, Double>> result = nettingService.net(consolidated);

        assertEquals(1, result.size());
        assertTrue(result.containsKey("A"));
        assertEquals(60.0, result.get("A").get("B"));
    }

    @Test
    void testNoMutualPayments() {
        Map<String, Map<String, Double>> consolidated = new HashMap<>();
        consolidated.put("A", new HashMap<>(Map.of("B", 100.0)));
        consolidated.put("C", new HashMap<>(Map.of("A", 25.0)));

        Map<String, Map<String, Double>> result = nettingService.net(consolidated);

        assertEquals(2, result.size());
        assertEquals(100.0, result.get("A").get("B"));
        assertEquals(25.0, result.get("C").get("A"));
    }
}
