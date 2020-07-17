package com.cg.json;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.net.URISyntaxException;

public class jsonThingsTest {
    @Test
    public void startProcess() throws URISyntaxException {
        String output = new jsonThings().startProcess();

        assertNotNull(output);
        assertTrue(output.length() > 0);
    }
}
