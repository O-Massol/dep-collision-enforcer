package org.example;

import com.omassol.Autoloader;

import java.nio.charset.StandardCharsets;

public class BytesLoader {
    public byte[] loadBytes(){
        return new Autoloader().loadAtSonicSpeed().getBytes(StandardCharsets.UTF_8);
    }
}