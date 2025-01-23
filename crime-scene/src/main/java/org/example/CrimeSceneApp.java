package org.example;

import com.omassol.Aggregator;

import java.util.logging.Logger;

public class CrimeSceneApp {
    private static Logger logger = Logger.getLogger(CrimeSceneApp.class.getName());

    public static void main(String[] args) {
        logger.info("Starting !");
        var aggregator = new Aggregator();
        var bytesLoader = new BytesLoader();
        aggregator.aggregate(bytesLoader.loadBytes());
    }
}