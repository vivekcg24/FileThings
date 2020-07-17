package com.cg.json;

import io.micrometer.core.instrument.util.IOUtils;

import java.io.File;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;

public class jsonThings {
    public String startProcess() {
        String relativePath = "MainFolder" + File.separator + "SubFolder" + File.separator + "LastLevel" + File.separator + "Sample.json";
        InputStream stream = getClass().getClassLoader().getResourceAsStream(relativePath);
        return IOUtils.toString(stream, StandardCharsets.UTF_8);
    }
}
