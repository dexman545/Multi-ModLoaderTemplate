package me.ayydan.multimodloadertemplate.api.fabric;

import me.ayydan.multimodloadertemplate.api.CommonModApiEntryPoint;
import net.fabricmc.api.ModInitializer;

public class ExampleModFabric implements ModInitializer
{
    @Override
    public void onInitialize()
    {
        CommonModApiEntryPoint.init();
    }
}
