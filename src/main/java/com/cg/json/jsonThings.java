package com.cg.json;

import io.micrometer.core.instrument.util.IOUtils;

import java.io.File;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;

public class jsonThings {
    public String startProcess() throws URISyntaxException {
        String relativePath = "MainFolder" + File.separator + "SubFolder" + File.separator + "LastLevel" + File.separator + "Sample.json";
        InputStream stream = getClass().getClassLoader().getResourceAsStream(relativePath);
        String fileContents = IOUtils.toString(stream, StandardCharsets.UTF_8);
        return fileContents;
    }
}
