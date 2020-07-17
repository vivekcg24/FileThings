package com.cg.json;

import io.micrometer.core.instrument.util.IOUtils;

import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;

public class jsonThings {
    public String startProcess() throws URISyntaxException {
        InputStream stream = getClass().getClassLoader().getResourceAsStream("/MainFolder/SubFolder/LastLevel/Sample.json");
        String fileContents = IOUtils.toString(stream, StandardCharsets.UTF_8);
        System.out.println("Contents :" + fileContents);
        return fileContents;
    }
}
