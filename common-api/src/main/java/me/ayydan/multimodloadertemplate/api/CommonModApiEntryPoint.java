package me.ayydan.multimodloadertemplate.api;

import me.ayydan.multimodloadertemplate.api.platform.Services;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonModApiEntryPoint {
    // Neo restricts mod ID to only allow lowercase alphanumeric
    public static final String MOD_ID = "multimodloadertemplateapi";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        LOGGER.info(MOD_ID);
        LOGGER.info("Config Dir: {}", Services.PLATFORM.getConfigDir());
    }
}
