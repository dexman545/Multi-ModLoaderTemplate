package me.ayydan.multimodloadertemplate.api.fabric;

import me.ayydan.multimodloadertemplate.api.ExampleExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class ExampleExpectPlatformImpl
{
    /**
     * This is our actual method to {@link ExampleExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory()
    {
        return FabricLoader.getInstance().getConfigDir();
    }
}
