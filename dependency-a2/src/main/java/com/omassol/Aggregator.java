package com.omassol;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.logging.Logger;


public class Aggregator {
    Logger log = Logger.getLogger(Aggregator.class.getName());

    @Deprecated
    public void aggregate(byte[] input){
        log.info("Aggregating bytes "+ Arrays.toString(input));
        log.info("Result : "+new String(input, StandardCharsets.UTF_8));
    }

    public void aggregateMuchBetter(byte[] input){
        log.info("Aggregating bytes in the latest trend "+ Arrays.toString(input));
        log.info("Result : "+new String(input, StandardCharsets.UTF_8));
    }

}