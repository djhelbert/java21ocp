package org.example.log;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Each log message has an associated log Level object. The Level gives a rough guide to the importance and urgency of a log message.
 * Log Level objects encapsulate an integer value, with higher values indicating higher priorities.
 *
 * The Level class defines seven standard log levels, ranging from FINEST (the lowest priority, with the lowest value) to
 * SEVERE (the highest priority, with the highest value).
 *
 * As stated earlier, client code sends log requests to Logger objects. Each logger keeps track of a log level that it is interested in,
 * and discards log requests that are below this level.
 */
public class Logs {
    private static Logger logger = Logger.getLogger("org.example.log");

    public static void main(String... args)  {
        try {
            // FileHandler fh = new FileHandler("mylog.txt");
            // logger.addHandler(fh);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "severe error", e);
        }

        logger.setLevel(Level.ALL); // log all levels

        logger.fine("doing stuff fine");       // added by handler for log level fine
        logger.finer("doing stuff but finer"); // added by handler for log level finer

        logger.info("here is some info");

        try {
            throw new Exception("A new error");
        } catch (Exception ex) {
            logger.log(Level.WARNING, "just a warning", ex);

        }

        logger.finest("the finest"); // added by handler for log level finest
    }
}
