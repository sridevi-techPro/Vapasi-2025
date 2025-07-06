package com.tw.splitwise.util;


import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerUtil {

    private static final String WHITE = "\u001B[97m";
    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";

    public static Logger getLogger(Class<?> clazz) {
        Logger logger = Logger.getLogger(clazz.getName());
        logger.setUseParentHandlers(false); // disable default handlers to avoid duplicate logs

        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        handler.setFormatter(new SimpleFormatter());

        logger.addHandler(handler);
        logger.setLevel(Level.ALL);

        return logger;
    }

    public static void info(Logger logger, String message) {
        logger.info(WHITE + message + RESET);
    }

    public static void error(Logger logger, String message) {
        logger.severe(RED + message + RESET); // red
    }


}
