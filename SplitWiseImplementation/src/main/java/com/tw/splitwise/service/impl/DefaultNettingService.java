package com.tw.splitwise.service.impl;


import com.tw.splitwise.service.contract.INettingService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DefaultNettingService implements INettingService {
    @Override
    public Map<String, Map<String, Double>> net(Map<String, Map<String, Double>> consolidated) {
        Map<String, Map<String, Double>> netResult = new HashMap<>();
        Set<String> processed = new HashSet<>();

        for (String from : consolidated.keySet()) {
            for (String to : consolidated.get(from).keySet()) {
                if (processed.contains(from + "-" + to) || processed.contains(to + "-" + from))
                    continue;

                double forward = consolidated.getOrDefault(from, Map.of()).getOrDefault(to, 0.0);
                double reverse = consolidated.getOrDefault(to, Map.of()).getOrDefault(from, 0.0);

                if (forward > reverse) {
                    netResult.computeIfAbsent(from, k -> new HashMap<>()).put(to, forward - reverse);
                } else if (reverse > forward) {
                    netResult.computeIfAbsent(to, k -> new HashMap<>()).put(from, reverse - forward);
                }

                processed.add(from + "-" + to);
                processed.add(to + "-" + from);
            }
        }

        return netResult;
    }
}
