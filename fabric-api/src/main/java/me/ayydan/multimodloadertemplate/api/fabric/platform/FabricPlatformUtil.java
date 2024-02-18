package me.ayydan.multimodloadertemplate.api.fabric.platform;

import com.google.auto.service.AutoService;
import me.ayydan.multimodloadertemplate.api.platform.services.IPlatformUtil;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

@AutoService(IPlatformUtil.class)
public class FabricPlatformUtil implements IPlatformUtil {
    @Override
    public Path getConfigDir() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
