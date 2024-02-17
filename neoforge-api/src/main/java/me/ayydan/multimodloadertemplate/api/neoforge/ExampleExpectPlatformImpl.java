package me.ayydan.multimodloadertemplate.api.neoforge;

import me.ayydan.multimodloadertemplate.api.ExampleExpectPlatform;
import net.neoforged.fml.loading.FMLPaths;

import java.nio.file.Path;

public class ExampleExpectPlatformImpl
{
    /**
     * This is our actual method to {@link ExampleExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory()
    {
        return FMLPaths.CONFIGDIR.get();
    }
}
