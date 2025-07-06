package com.tw.splitwise.service.contract;


import com.tw.splitwise.model.Debtor;

import java.util.List;
import java.util.Map;

public interface IConsolidator {
    Map<String, Map<String, Double>> consolidate(List<Debtor> debtors);
}
