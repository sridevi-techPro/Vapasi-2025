package org.MultiThreadingExampleCode;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Task implements Runnable {
    String task;
    Task(String task) {
        this.task = task;
    }
    public void run() {
        System.out.println(task + " by the thread " + Thread.currentThread().getName());
    }
}

public class TicketBookingService {
    public static void main(String[] args) {
        try (ExecutorService pool = Executors.newFixedThreadPool(5)) {

            pool.execute(new Task("Booking received"));
            pool.execute(new Task("Payment processed"));
            pool.execute(new Task("Ticket confirmed"));
            pool.execute(new Task("Booking received"));
            pool.execute(new Task("Payment processed"));
            pool.execute(new Task("Ticket confirmed"));

            pool.shutdown();
        }
    }
}