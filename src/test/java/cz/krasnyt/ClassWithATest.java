package cz.krasnyt;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassWithATest {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClassWithATest.class);

    @Test
    void myTest() {
        LOGGER.debug("this is debug");
        LOGGER.info("this is info");
        LOGGER.warn("this is warn");
        LOGGER.error("this is error");
    }

}