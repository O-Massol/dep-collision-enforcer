package com.omassol;

import java.time.ZonedDateTime;
import java.util.logging.Logger;

public class Autoloader {
    Logger log = Logger.getLogger(Autoloader.class.getName());

    public String loadAtSonicSpeed() {
        try {
            log.info("loading at sonic speed");
            Thread.sleep(1000);
            return "A string loaded from memory at sonic speed";
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
