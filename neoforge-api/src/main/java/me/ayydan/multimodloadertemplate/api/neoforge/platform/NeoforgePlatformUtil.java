package me.ayydan.multimodloadertemplate.api.neoforge.platform;

import com.google.auto.service.AutoService;
import me.ayydan.multimodloadertemplate.api.platform.services.IPlatformUtil;
import net.neoforged.fml.loading.FMLPaths;

import java.nio.file.Path;

@AutoService(IPlatformUtil.class)
public class NeoforgePlatformUtil implements IPlatformUtil {
    @Override
    public Path getConfigDir() {
        return FMLPaths.CONFIGDIR.get();
    }
}
