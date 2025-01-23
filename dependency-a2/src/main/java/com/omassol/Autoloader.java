package com.omassol;

import java.util.logging.Logger;

public class Autoloader {
    Logger log = Logger.getLogger(Autoloader.class.getName());

    public String loadAtLightSpeed() {
        try {
            log.info("loading at light speed");
            Thread.sleep(100);
            return "A string loaded from memory at light speed";
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
