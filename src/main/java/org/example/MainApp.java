package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.*;

public class MainApp {
    private static final Logger logger = Logger.getLogger(MainApp.class.getName());
//    private static final Logger globalLogger = Logger.getLogger("");
    public static void main(String[] args) throws IOException {
//        logger.log(Level.INFO, "java top");
//        logger.info("java top");

//        Level.OFF;
//        Level.SEVERE; exception
//        Level.WARNING;
//        Level.INFO;
//        Level.CONFIG;
//        Level.FINE;
//        Level.FINER;
//        Level.FINEST;
//        Level.ALL;

        Handler consoleHandler = new ConsoleHandler();
//        consoleHandler.setLevel(Level.FINE);
//        consoleHandler.setFormatter(new XMLFormatter());
//        consoleHandler.setFormatter(new Formatter() {
//            @Override
//            public String format(LogRecord record) {
//                return String.format(">>>>>> %s !!! %s !!! THREAD %d \n", record.getMessage(), record.getLevel(), record.getThreadID());
//            }
//        });

//        consoleHandler.setFilter(new Filter() {
//            @Override
//            public boolean isLoggable(LogRecord record) {
//                return record.getLevel() == Level.FINE;
//                return record.getThreadID() == 1;
//                return  record.getMessage().startsWith("java");
//            }
//        });
//
//        Handler fileHandler = new FileHandler("log_%g.log", 10 ^ 1024, 20, true);
//        fileHandler.setFormatter(new SimpleFormatter());
//
//        logger.addHandler(consoleHandler);
//        logger.addHandler(fileHandler);
//        logger.setUseParentHandlers(false);
//        logger.setLevel(Level.FINE);
//
//        LogManager manager = LogManager.getLogManager();
//        manager.readConfiguration(new FileInputStream("logging.properties"));
//
//        logger.log(Level.INFO, "java top");
//        logger.log(Level.SEVERE, "java top");
//        logger.log(Level.FINE, "java top");
//
//        logger.throwing("MainApp", "main", new RuntimeException());
//        logger.log(Level.SEVERE, "WTF", new RuntimeException());



    }
}
