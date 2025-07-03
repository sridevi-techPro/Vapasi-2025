package com.tw.ticketbooking;

import java.util.logging.Logger;

class TicketBookingJob implements Runnable {
    private static final Logger logger = Logger.getLogger(TicketBookingJob.class.getName());
    private static final String WHITE = "\u001B[37m";
    private static final String RESET = "\u001B[0m";
    private final String movieGoer;

    public TicketBookingJob(String bookingName) {
        this.movieGoer = bookingName;
    }


    @Override
    public void run() {
        try {
            logger.info(WHITE + movieGoer + " books a ticket. Their Booking is received by " + Thread.currentThread().getName() + RESET);
            Thread.sleep(1000);

            logger.info(WHITE + movieGoer + " pays for the ticket. Their Payment is processed by " + Thread.currentThread().getName() + RESET);
            Thread.sleep(1000);

            logger.info(WHITE + movieGoer + " receives the Ticket. Their Ticket is confirmed by " + Thread.currentThread().getName() + RESET);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } catch (Exception e) {
            logger.severe("Exception occured: ");
        }

    }
}