package com.tw.splitwise.service.contract;


import java.util.Map;

public interface INettingService {
    Map<String, Map<String, Double>> net(Map<String, Map<String, Double>> consolidated);
}
