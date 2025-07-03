package com.tw.ticketbooking;

import java.util.logging.Logger;

class TicketBookingJob implements Runnable {
    private static final Logger logger = Logger.getLogger(TicketBookingJob.class.getName());
    private static final String WHITE = "\u001B[37m";
    private static final String RESET = "\u001B[0m";
    private final int bookingId;

    public TicketBookingJob(int bookingId) {
        this.bookingId = bookingId;
    }


    @Override
    public void run() {
        try {
            logger.info(WHITE + "Booking ID " + bookingId + ": Booking received by " + Thread.currentThread().getName() + RESET);
            Thread.sleep(1000);

            logger.info(WHITE + "Booking ID " + bookingId + ": Payment processed by " + Thread.currentThread().getName() + RESET);
            Thread.sleep(1000);

            logger.info(WHITE + "Booking ID " + bookingId + ": Ticket confirmed by " + Thread.currentThread().getName() + RESET);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } catch (Exception e) {
            logger.severe("Exception occured: ");
        }

    }
}