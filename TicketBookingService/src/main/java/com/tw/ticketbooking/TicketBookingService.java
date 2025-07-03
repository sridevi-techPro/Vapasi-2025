package com.tw.ticketbooking;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TicketBookingService {
    public static void main(String[] args) {
        int numThreads = 3;
        try (ExecutorService executor = Executors.newFixedThreadPool(numThreads)) {

            List<String> MovieGoers = Arrays.asList("1. Alice", "2. Bob", "3. Charlie","4. Danny","5. Emma");
            for (int i = 1; i < MovieGoers.size(); i++) {
                executor.execute(new TicketBookingJob(MovieGoers.get(i)));
            }

            executor.shutdown();
        }
    }
}