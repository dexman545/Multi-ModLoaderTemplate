package me.ayydan.multimodloadertemplate.platform;

import me.ayydan.multimodloadertemplate.CommonModEntryPoint;
import me.ayydan.multimodloadertemplate.platform.services.IPlatformUtil;

import java.util.ServiceLoader;

public class Services {
    public static final IPlatformUtil PLATFORM = load(IPlatformUtil.class);

    private static <T> T load(Class<T> service) {
        var serviceLoader = ServiceLoader.load(service);
        var foundService = serviceLoader.findFirst()
                .orElseThrow(() -> new NullPointerException("Failed to find service for " + service.getName()));
        CommonModEntryPoint.LOGGER.debug("Found {} as service for {}", foundService.getClass(), service);
        return foundService;
    }
}
