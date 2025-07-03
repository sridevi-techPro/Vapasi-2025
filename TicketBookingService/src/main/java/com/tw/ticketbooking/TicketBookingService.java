package com.tw.ticketbooking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TicketBookingService {
    public static void main(String[] args) {
        int numThreads = 3;
        try (ExecutorService executor = Executors.newFixedThreadPool(numThreads)) {

            int totalBookings = 5;
            for (int i = 1; i <= totalBookings; i++) {
                executor.execute(new TicketBookingJob(i));
            }

            executor.shutdown();
        }
    }
}