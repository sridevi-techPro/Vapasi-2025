package com.tw.splitwise.service.impl;


import com.tw.splitwise.model.Debtor;
import com.tw.splitwise.service.contract.IConsolidator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultConsolidator implements IConsolidator {

    @Override
    public Map<String, Map<String, Double>> consolidate(List<Debtor> debtors) {
        Map<String, Map<String, Double>> map = new HashMap<>();
        for (Debtor d : debtors) {
            map.computeIfAbsent(d.getDebtor(), k -> new HashMap<>())
                    .merge(d.getPayer(), d.getAmount(), Double::sum);
        }
        return map;
    }
}
