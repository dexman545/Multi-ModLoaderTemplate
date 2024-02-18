package me.ayydan.multimodloadertemplate;

import me.ayydan.multimodloadertemplate.platform.Services;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonModEntryPoint {
    public static final String MOD_ID = "multimodloadertemplate";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        LOGGER.info(MOD_ID);
        LOGGER.info("Config Dir: {}", Services.PLATFORM.getConfigDir());
    }
}
